package com.earthquake.map.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class PageJson implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object PageData;
    private long total;
    private int pageNum;
    private int pageSize;


}
