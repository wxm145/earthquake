package com.earthquake.map.vo;

import lombok.Data;

@Data
public class MarkVo {
    private String latitude;
    private String longitude;
    private String date;
    private Double magnitude;
    private String nation;
}
