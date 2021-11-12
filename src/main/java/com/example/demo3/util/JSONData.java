package com.example.demo3.util;

import java.io.Serializable;

/**
 * 接口返回接口
 */
public class JSONData<T> implements Serializable {

    private final static String SUCCESS = "success";
    private final static int SUCCESS_CODE = 0;
    private final static int FAIL_CODE = 500;

    private int code;
    //    private T data;
    private Object data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public JSONData() {
    }

    public JSONData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JSONData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static JSONData buildSuccess() {
        return new JSONData(SUCCESS_CODE, null, SUCCESS);
    }

    public static JSONData buildSuccess(Object data) {
        return new JSONData(SUCCESS_CODE, data, SUCCESS);
    }

    public static JSONData buildFail() {
        return buildFail("未知错误，请联系管理员");

    }

    public static JSONData buildFail(String msg) {
        return buildFail(FAIL_CODE, msg);
    }

    public static JSONData buildFail(int code, String msg) {
        return new JSONData(code, null, msg);
    }

}
