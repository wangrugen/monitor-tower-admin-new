package com.iotplatform.common;

import java.util.List;

public class ResponseMessage {

    private String code="0";

    private String msg ="";

    private int  count=100;

    private List<Object> data;

    public ResponseMessage(String code, String msg, int count, List<Object> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public ResponseMessage() {
    }

    public ResponseMessage(int count, List<Object> data) {
        this.count = count;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
