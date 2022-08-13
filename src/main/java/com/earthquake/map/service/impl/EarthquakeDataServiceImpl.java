package com.earthquake.map.service.impl;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.earthquake.map.dao.earthquakeData.EarthquakeDataDao;
import com.earthquake.map.entity.EarthquakeEntity;
import com.earthquake.map.entity.Lnglat;
import com.earthquake.map.service.EarthquakeDataService;
import com.earthquake.map.utils.PositionUtil;
import com.earthquake.map.vo.EarthquakeVo;
import com.earthquake.map.vo.MarkVo;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.earthquake.map.utils.CountryUtil.getCountryNameCnEnCodeByCountryCode;

/**
 * @author wangxiaomiao
 * @create 2022-08-03 10:49
 */
@Service
public class EarthquakeDataServiceImpl implements EarthquakeDataService {
    @Autowired
    private EarthquakeDataDao earthquakeDataDao;

    @Override
    public int insertBatch(InputStream fileInputStream) throws IOException, IllegalAccessException {
        List<EarthquakeEntity> list = readExcel(fileInputStream);
        return earthquakeDataDao.insertBatch(list);
    }

    @Override
    public void insertBatch(String filePath) throws IOException, IllegalAccessException {
        List<EarthquakeEntity> list = readExcel(filePath);

        if (list.size() > 0) {
            earthquakeDataDao.deleteData();
        }

        List<List<EarthquakeEntity>> lists = splistList(list, 100);
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (List<EarthquakeEntity> earthquakeEntity : lists) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    earthquakeDataDao.insertList(earthquakeEntity);
                }
            });
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<MarkVo> getMark(EarthquakeVo earthquake) {
        if (Objects.nonNull(earthquake.getDate()) && !earthquake.getDate().isEmpty() && !"null".equals(earthquake.getDate())) {
            earthquake.setStartDate(earthquake.getDate().split(",")[0]);
            earthquake.setEndDate(earthquake.getDate().split(",")[1]);
        }
        List<MarkVo> list = earthquakeDataDao.getMark(earthquake);
        return list;
    }

    @Override
    public List<String> getNation() {
        return earthquakeDataDao.getNation();
    }

    public List<EarthquakeEntity> readExcel(String filePath) throws IOException, IllegalAccessException {
        BufferedReader reader = null;
        List<EarthquakeEntity> earthquakeList = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        int pointIndex = filePath.lastIndexOf(".");
        String fileSuffix = filePath.substring(pointIndex);
        if (".csv".equals(fileSuffix)) {
            try {
                FileInputStream fis = new FileInputStream(filePath);
                InputStreamReader isr = new InputStreamReader(fis, "GBK");
                reader = new BufferedReader(isr);
                String line;
                Field[] fields = new EarthquakeEntity().getClass().getDeclaredFields();
                int index = 0;
                while ((line = reader.readLine()) != null) {
                    if (index > 0) {
                        String[] rows = line.split(",");
                        EarthquakeEntity earthquake = new EarthquakeEntity();
                        for (int i = 0; i < rows.length; i++) {
                            fields[i].setAccessible(true);
                            fields[i].set(earthquake, rows[i]);
                        }
                        earthquakeList.add(earthquake);
                    }
                    index++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                reader.close();
            }
        } else {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Row rowTitle = sheet.getRow(0);
            if (rowTitle != null) {
                int cellCount = rowTitle.getPhysicalNumberOfCells();
                for (int cellNum = 0; cellNum < cellCount; cellNum++) {
                    Cell cell = rowTitle.getCell(cellNum);
                    if (cell != null) {
                        String cellValue = cell.getStringCellValue();
                        System.out.print(cellValue);
                    }
                }
            }
            Field[] fields = new EarthquakeEntity().getClass().getDeclaredFields();
            int rowCount = sheet.getPhysicalNumberOfRows();
            for (int rowNum = 1; rowNum < rowCount; rowNum++) {
                Row rowData = sheet.getRow(rowNum);
                if (rowData != null) {
                    int cellCount = rowTitle.getPhysicalNumberOfCells();
                    EarthquakeEntity earthquake = new EarthquakeEntity();
                    for (int cellNum = 0; cellNum < cellCount; cellNum++) {
                        Cell cell = rowData.getCell(cellNum);
                        if (cell != null) {
                            int cellType = cell.getCellType();
                            String cellValue = "";
                            switch (cellType) {
                                case HSSFCell.CELL_TYPE_STRING:
                                    cellValue = cell.getStringCellValue();
                                    break;
                                case HSSFCell.CELL_TYPE_BOOLEAN:
                                    cellValue = String.valueOf(cell.getBooleanCellValue());
                                    break;
                                case HSSFCell.CELL_TYPE_BLANK:
                                    break;
                                case HSSFCell.CELL_TYPE_NUMERIC:
                                    if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                        Date date = cell.getDateCellValue();
                                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                                        cellValue = sdf.format(date);
                                    } else {
                                        cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                                        cellValue = cell.toString();
                                    }
                                    break;
                                case HSSFCell.CELL_TYPE_ERROR:
                                    System.out.print("[Data type error]");
                                    break;
                            }
                            fields[cellNum].setAccessible(true);
                            fields[cellNum].set(earthquake, cellValue);
                        }
                    }
                    earthquakeList.add(earthquake);
                }
            }
        }
        List<Lnglat> lnglats = earthquakeDataDao.getLnglat();
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        earthquakeList.stream().forEach(e -> {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    double[] locations = PositionUtil.gps84_To_Gcj02(Double.parseDouble(e.getLatitude()), Double.parseDouble(e.getLongitude()));
                    e.setLatitude(locations[0] + "");
                    e.setLongitude(locations[1] + "");
                    String nation = "";
                    for (Lnglat lnglat : lnglats) {
                        if (lnglat.getLatitude().equals(e.getLatitude()) && lnglat.getLongitude().equals(e.getLongitude())) {
                            nation = lnglat.getNation();
                            break;
                        }
                    }
                    if (nation.isEmpty()) {
                        HttpResponse response = HttpRequest.get("https://apis.map.qq.com/ws/geocoder/v1?location=" + locations[0] + "," + locations[1] + "&get_poi=0&key=OA4BZ-FX43U-E5VV2-45M6S-C4HD3-NIFFI&output=json").execute();
                        JSONObject result = JSON.parseObject(response.body());
                        if (0 == result.getInteger("status")) {
                            nation = getCountryNameCnEnCodeByCountryCode(result.getJSONObject("result").getJSONObject("address_component").getString("nation")).split(",")[0];
                        }
                    }

                    e.setNation(nation);
                    String date = e.getDate();
                    String year = date.substring(date.lastIndexOf("/") + 1, date.length());
                    date = year + "-" + date;
                    date = date.substring(0, date.lastIndexOf("/")).replaceAll("/", "-");
                    e.setDate(date);
                }
            });
        });
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return earthquakeList;
    }


    public List<EarthquakeEntity> readExcel(InputStream fileInputStream) throws IOException, IllegalAccessException {

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row rowTitle = sheet.getRow(0);
        if (rowTitle != null) {
            int cellCount = rowTitle.getPhysicalNumberOfCells();
            for (int cellNum = 0; cellNum < cellCount; cellNum++) {
                Cell cell = rowTitle.getCell(cellNum);
                if (cell != null) {
                    String cellValue = cell.getStringCellValue();
                    System.out.print(cellValue + "|");
                }
            }
        }


        Field[] fields = new EarthquakeEntity().getClass().getDeclaredFields();

        List<EarthquakeEntity> earthquakeList = new ArrayList<>();
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int rowNum = 1; rowNum < rowCount; rowNum++) {
            Row rowData = sheet.getRow(rowNum);
            if (rowData != null) {
                int cellCount = rowTitle.getPhysicalNumberOfCells();
                EarthquakeEntity earthquake = new EarthquakeEntity();
                for (int cellNum = 0; cellNum < cellCount; cellNum++) {
                    Cell cell = rowData.getCell(cellNum);
                    if (cell != null) {
                        int cellType = cell.getCellType();
                        String cellValue = "";
                        switch (cellType) {
                            case HSSFCell.CELL_TYPE_STRING:
                                cellValue = cell.getStringCellValue();
                                break;
                            case HSSFCell.CELL_TYPE_BOOLEAN:
                                cellValue = String.valueOf(cell.getBooleanCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_BLANK:
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC:
                                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                    Date date = cell.getDateCellValue();
                                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                                    cellValue = sdf.format(date);
                                } else {
                                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                                    cellValue = cell.toString();
                                }
                                break;
                            case HSSFCell.CELL_TYPE_ERROR:
                                System.out.print("[Data type error]");
                                break;
                        }
                        fields[cellNum].setAccessible(true);
                        fields[cellNum].set(earthquake, cellValue);
                    }
                }
                earthquakeList.add(earthquake);
            }
        }

        earthquakeList.stream().forEach(e -> {
            double[] locations = PositionUtil.gps84_To_Gcj02(Double.parseDouble(e.getLatitude()), Double.parseDouble(e.getLongitude()));
            e.setLatitude(locations[0] + "");
            e.setLongitude(locations[1] + "");
            HttpResponse response = HttpRequest.get("https://apis.map.qq.com/ws/geocoder/v1?location=" + locations[0] + "," + locations[1] + "& get_poi = 0 & key = OA4BZ - FX43U - E5VV2 - 45M6S - C4HD3 - NIFFI & output = json").execute();
            JSONObject result = JSON.parseObject(response.body());
            if (0 == result.getInteger("status")) {
                String nation = result.getJSONObject("result").getJSONObject("address_component").getString("nation");
                e.setNation(nation);
            }
            String date = e.getDate();
            String year = date.substring(date.lastIndexOf("/") + 1, date.length());
            date = year + "-" + date;
            date = date.substring(0, date.lastIndexOf("/")).replaceAll("/", "-");
            e.setDate(date);
        });
        return earthquakeList;
    }


    public static <T> List<List<T>> splistList(List<T> list, int subNum) {
        List<List<T>> tNewList = new ArrayList<List<T>>();
        int priIndex = 0;
        int lastPriIndex = 0;
        int insertTimes = list.size() / subNum;
        List<T> subList = new ArrayList<>();
        for (int i = 0; i <= insertTimes; i++) {
            priIndex = subNum * i;
            lastPriIndex = priIndex + subNum;
            if (i == insertTimes) {
                subList = list.subList(priIndex, list.size());
            } else {
                subList = list.subList(priIndex, lastPriIndex);
            }
            if (subList.size() > 0) {
                tNewList.add(subList);
            }
        }
        return tNewList;
    }

}
