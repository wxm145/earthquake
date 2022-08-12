package com.earthquake.map.vo;

import lombok.Data;

/**
 * @author wangxiaomiao
 * @create 2022-08-06 14:40
 */
@Data
public class MarkVo {
    private String latitude;
    private String longitude;
    private String date;
    private Double magnitude;
    private String nation;
}
