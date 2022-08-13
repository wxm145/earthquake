package com.earthquake.map.vo;

import lombok.Data;


@Data
public class EarthquakeVo {
    private String date;
    private String startDate;
    private String endDate;
    private String depth;
    private String magnitude;
    private String nation;
    private String type;
}
