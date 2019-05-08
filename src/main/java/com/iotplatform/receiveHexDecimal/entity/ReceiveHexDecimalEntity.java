package com.iotplatform.receiveHexDecimal.entity;

import java.util.Date;

public class ReceiveHexDecimalEntity {
    private Integer id;

    private String begin;

    private String imei;

    private String time;

    private String jinGdu;

    private String weiDu;

    private String gaoDu;

    private String beiYong;

    private String end;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin == null ? null : begin.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getJinGdu() {
        return jinGdu;
    }

    public void setJinGdu(String jinGdu) {
        this.jinGdu = jinGdu == null ? null : jinGdu.trim();
    }

    public String getWeiDu() {
        return weiDu;
    }

    public void setWeiDu(String weiDu) {
        this.weiDu = weiDu == null ? null : weiDu.trim();
    }

    public String getGaoDu() {
        return gaoDu;
    }

    public void setGaoDu(String gaoDu) {
        this.gaoDu = gaoDu == null ? null : gaoDu.trim();
    }

    public String getBeiYong() {
        return beiYong;
    }

    public void setBeiYong(String beiYong) {
        this.beiYong = beiYong == null ? null : beiYong.trim();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}