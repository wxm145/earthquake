package com.earthquake.map.controller;

import com.earthquake.map.common.R;
import com.earthquake.map.service.EarthquakeDataService;
import com.earthquake.map.vo.EarthquakeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author wangxiaomiao
 * @create 2022-08-03 10:48
 */
@RestController
@RequestMapping("earthquake")
public class EarthquakeDataController {

    @Autowired
    private EarthquakeDataService earthquakeDataService;

    @PostMapping("uploadFile")
    public R upload(@RequestParam(value = "file") MultipartFile files) {
        try {
            String fileRealName = files.getOriginalFilename();
            int pointIndex = fileRealName.lastIndexOf(".");
            String fileSuffix = fileRealName.substring(pointIndex);
            if (".xlsx".equals(fileSuffix) || ".csv".equals(fileSuffix)) {
                String filePath = "c:\\logss\\" + System.currentTimeMillis() + fileSuffix;
                File file = new File(filePath);
                File fileParent = file.getParentFile();
                if (!fileParent.exists()) {
                    fileParent.mkdirs();
                }
                file.createNewFile();
                files.transferTo(file);
                earthquakeDataService.insertBatch(filePath);
                return R.ok();
            } else {
                return R.fail("Illegal file format");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return R.fail("Please check the contents of the document");
        }
    }

    @GetMapping("getMark")
    public R getMark(EarthquakeVo earthquake) {
        try {
            return R.ok(earthquakeDataService.getMark(earthquake));
        } catch (Exception e) {
            e.printStackTrace();
            return R.fail();
        }
    }

    @GetMapping("getNation")
    public R getNation() {
        try {
            return R.ok(earthquakeDataService.getNation());
        } catch (Exception e) {
            e.printStackTrace();
            return R.fail();
        }
    }


}
