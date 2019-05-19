package com.iotplatform.receiveHexDecimal.entity;

import java.util.Date;

public class PositionRecordEntity {
    private Integer id;

    private String m1;

    private String m2;

    private String imei;

    private String shiJian;

    private String xinHaoZhiLiang;

    private String weiDu;

    private String jingDu;

    private String gaoDu;

    private String dw;

    private String ns;

    private String ew;

    private String wx;

    private String dy;

    private String he;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1 == null ? null : m1.trim();
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2 == null ? null : m2.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getShiJian() {
        return shiJian;
    }

    public void setShiJian(String shiJian) {
        this.shiJian = shiJian == null ? null : shiJian.trim();
    }

    public String getXinHaoZhiLiang() {
        return xinHaoZhiLiang;
    }

    public void setXinHaoZhiLiang(String xinHaoZhiLiang) {
        this.xinHaoZhiLiang = xinHaoZhiLiang == null ? null : xinHaoZhiLiang.trim();
    }

    public String getWeiDu() {
        return weiDu;
    }

    public void setWeiDu(String weiDu) {
        this.weiDu = weiDu == null ? null : weiDu.trim();
    }

    public String getJingDu() {
        return jingDu;
    }

    public void setJingDu(String jingDu) {
        this.jingDu = jingDu == null ? null : jingDu.trim();
    }

    public String getGaoDu() {
        return gaoDu;
    }

    public void setGaoDu(String gaoDu) {
        this.gaoDu = gaoDu == null ? null : gaoDu.trim();
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw == null ? null : dw.trim();
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns == null ? null : ns.trim();
    }

    public String getEw() {
        return ew;
    }

    public void setEw(String ew) {
        this.ew = ew == null ? null : ew.trim();
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx == null ? null : wx.trim();
    }

    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy == null ? null : dy.trim();
    }

    public String getHe() {
        return he;
    }

    public void setHe(String he) {
        this.he = he == null ? null : he.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}