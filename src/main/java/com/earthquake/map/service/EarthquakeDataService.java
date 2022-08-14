package com.earthquake.map.service;

import com.earthquake.map.entity.EarthquakeEntity;
import com.earthquake.map.entity.TbUser;
import com.earthquake.map.vo.DepthAndMagnitude;
import com.earthquake.map.vo.EarthquakeVo;
import com.earthquake.map.vo.MarkVo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public interface EarthquakeDataService {

    int insertBatch(InputStream InputStream) throws IOException, IllegalAccessException;


    void insertBatch(String filePath) throws IOException, IllegalAccessException;


    List<MarkVo> getMark(EarthquakeVo earthquake);


    List<String> getNation();

    DepthAndMagnitude getDepthAndMagnitude();
}
