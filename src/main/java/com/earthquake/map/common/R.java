package com.earthquake.map.common;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;


public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;


    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public R(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getcode() {
        return this.code;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message = "fail";

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    private R(T data) {
        this.data = data;
    }

    public static R ok() {
        R r = new R();
        r.setCode(ResultCodeEnum.STATE_SUCCESS.getCode());
        r.setMessage(ResultCodeEnum.STATE_SUCCESS.getMessage());
        return r;
    }

    public static <T> R<T> ok(String message) {
        return (new R()).success(message);
    }

    public static <T> R<T> ok(T data) {
        return (new R(data)).success();
    }

    public static <T> R<T> ok(String[] data) {
        return (new R(data)).success("200", "0");
    }

    public static <T> R<T> ok(T data, String message) {
        return (new R(data)).success(message);
    }


    public static <T> R<T> fail(ResultCodeEnum result) {
        R<T> r = new R<>();
        r.setCode(result.getCode());
        r.setMessage(result.getMessage());
        return r;
    }

    public static <T> R<T> fail(String code, String message) {
        R<T> r = new R<>();
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static R fail() {
        R r = new R();
        r.setCode(ResultCodeEnum.STATE_UNKNOWN_ERROR.getCode());
        r.setMessage(ResultCodeEnum.STATE_UNKNOWN_ERROR.getMessage());
        return r;
    }

    public static <T> R<T> fail(String message) {
        return (new R()).failure(message);
    }

    public static <T> R<T> fail(T data) {
        return (new R(data)).failure();
    }

    public static <T> R<T> fail(T data, ResultCodeEnum resultCodeEnum) {
        R<T> r = new R<>();
        r.setData(data);
        r.setCode(resultCodeEnum.getCode());
        r.setMessage(resultCodeEnum.getMessage());
        return r;
    }


    private R success() {
        this.code = "0";
        this.message = "ok";
        return this;
    }

    private R success(String message) {
        this.code = "0";
        this.message = message;
        return this;
    }

    private R success(String message, String code) {
        this.code = code;
        this.message = message;
        return this;
    }

    private R failure() {
        this.message = "fail";
        return this;
    }

    private R failure(String message) {
        this.code = "1";
        this.message = message;
        return this;
    }

    public R() {
    }
}
