package com.earthquake.map.common;


public enum ResultCodeEnum {


    STATE_SUCCESS("0", "success"),
    STATE_UNKNOWN_ERROR("1", "error");


    private String code;

    private String message;


    ResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

