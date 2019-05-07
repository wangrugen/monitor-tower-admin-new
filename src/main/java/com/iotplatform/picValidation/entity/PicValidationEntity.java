package com.iotplatform.picValidation.entity;

import java.util.Date;

public class PicValidationEntity {
    private Integer id;

    private String commId;

    private String imie;

    private String version;

    private String dianYa;

    private String jiaoDu;

    private String wenDu;

    private String weiYi;

    private String rssi;

    private String zhouQi;

    private String guanZhuDian;

    private String weiDu;

    private String jingDu;

    private String picSize;

    private String leijiaJiaoyan;

    private String picCpc;

    private String picZhentou;

    private String picYasuoData;

    private Date createTime;

    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommId() {
        return commId;
    }

    public void setCommId(String commId) {
        this.commId = commId == null ? null : commId.trim();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie == null ? null : imie.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDianYa() {
        return dianYa;
    }

    public void setDianYa(String dianYa) {
        this.dianYa = dianYa == null ? null : dianYa.trim();
    }

    public String getJiaoDu() {
        return jiaoDu;
    }

    public void setJiaoDu(String jiaoDu) {
        this.jiaoDu = jiaoDu == null ? null : jiaoDu.trim();
    }

    public String getWenDu() {
        return wenDu;
    }

    public void setWenDu(String wenDu) {
        this.wenDu = wenDu == null ? null : wenDu.trim();
    }

    public String getWeiYi() {
        return weiYi;
    }

    public void setWeiYi(String weiYi) {
        this.weiYi = weiYi == null ? null : weiYi.trim();
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi == null ? null : rssi.trim();
    }

    public String getZhouQi() {
        return zhouQi;
    }

    public void setZhouQi(String zhouQi) {
        this.zhouQi = zhouQi == null ? null : zhouQi.trim();
    }

    public String getGuanZhuDian() {
        return guanZhuDian;
    }

    public void setGuanZhuDian(String guanZhuDian) {
        this.guanZhuDian = guanZhuDian == null ? null : guanZhuDian.trim();
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

    public String getPicSize() {
        return picSize;
    }

    public void setPicSize(String picSize) {
        this.picSize = picSize == null ? null : picSize.trim();
    }

    public String getLeijiaJiaoyan() {
        return leijiaJiaoyan;
    }

    public void setLeijiaJiaoyan(String leijiaJiaoyan) {
        this.leijiaJiaoyan = leijiaJiaoyan == null ? null : leijiaJiaoyan.trim();
    }

    public String getPicCpc() {
        return picCpc;
    }

    public void setPicCpc(String picCpc) {
        this.picCpc = picCpc == null ? null : picCpc.trim();
    }

    public String getPicZhentou() {
        return picZhentou;
    }

    public void setPicZhentou(String picZhentou) {
        this.picZhentou = picZhentou == null ? null : picZhentou.trim();
    }

    public String getPicYasuoData() {
        return picYasuoData;
    }

    public void setPicYasuoData(String picYasuoData) {
        this.picYasuoData = picYasuoData == null ? null : picYasuoData.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}