package com.iotplatform.picValidation.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PicValidationEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicValidationEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNull() {
            addCriterion("COMM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("COMM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(String value) {
            addCriterion("COMM_ID =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(String value) {
            addCriterion("COMM_ID <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(String value) {
            addCriterion("COMM_ID >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMM_ID >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(String value) {
            addCriterion("COMM_ID <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(String value) {
            addCriterion("COMM_ID <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLike(String value) {
            addCriterion("COMM_ID like", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotLike(String value) {
            addCriterion("COMM_ID not like", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<String> values) {
            addCriterion("COMM_ID in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<String> values) {
            addCriterion("COMM_ID not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(String value1, String value2) {
            addCriterion("COMM_ID between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(String value1, String value2) {
            addCriterion("COMM_ID not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andImieIsNull() {
            addCriterion("IMIE is null");
            return (Criteria) this;
        }

        public Criteria andImieIsNotNull() {
            addCriterion("IMIE is not null");
            return (Criteria) this;
        }

        public Criteria andImieEqualTo(String value) {
            addCriterion("IMIE =", value, "imie");
            return (Criteria) this;
        }

        public Criteria andImieNotEqualTo(String value) {
            addCriterion("IMIE <>", value, "imie");
            return (Criteria) this;
        }

        public Criteria andImieGreaterThan(String value) {
            addCriterion("IMIE >", value, "imie");
            return (Criteria) this;
        }

        public Criteria andImieGreaterThanOrEqualTo(String value) {
            addCriterion("IMIE >=", value, "imie");
            return (Criteria) this;
        }

        public Criteria andImieLessThan(String value) {
            addCriterion("IMIE <", value, "imie");
            return (Criteria) this;
        }

        public Criteria andImieLessThanOrEqualTo(String value) {
            addCriterion("IMIE <=", value, "imie");
            return (Criteria) this;
        }

        public Criteria andImieLike(String value) {
            addCriterion("IMIE like", value, "imie");
            return (Criteria) this;
        }

        public Criteria andImieNotLike(String value) {
            addCriterion("IMIE not like", value, "imie");
            return (Criteria) this;
        }

        public Criteria andImieIn(List<String> values) {
            addCriterion("IMIE in", values, "imie");
            return (Criteria) this;
        }

        public Criteria andImieNotIn(List<String> values) {
            addCriterion("IMIE not in", values, "imie");
            return (Criteria) this;
        }

        public Criteria andImieBetween(String value1, String value2) {
            addCriterion("IMIE between", value1, value2, "imie");
            return (Criteria) this;
        }

        public Criteria andImieNotBetween(String value1, String value2) {
            addCriterion("IMIE not between", value1, value2, "imie");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDianYaIsNull() {
            addCriterion("DIAN_YA is null");
            return (Criteria) this;
        }

        public Criteria andDianYaIsNotNull() {
            addCriterion("DIAN_YA is not null");
            return (Criteria) this;
        }

        public Criteria andDianYaEqualTo(String value) {
            addCriterion("DIAN_YA =", value, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaNotEqualTo(String value) {
            addCriterion("DIAN_YA <>", value, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaGreaterThan(String value) {
            addCriterion("DIAN_YA >", value, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaGreaterThanOrEqualTo(String value) {
            addCriterion("DIAN_YA >=", value, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaLessThan(String value) {
            addCriterion("DIAN_YA <", value, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaLessThanOrEqualTo(String value) {
            addCriterion("DIAN_YA <=", value, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaLike(String value) {
            addCriterion("DIAN_YA like", value, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaNotLike(String value) {
            addCriterion("DIAN_YA not like", value, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaIn(List<String> values) {
            addCriterion("DIAN_YA in", values, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaNotIn(List<String> values) {
            addCriterion("DIAN_YA not in", values, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaBetween(String value1, String value2) {
            addCriterion("DIAN_YA between", value1, value2, "dianYa");
            return (Criteria) this;
        }

        public Criteria andDianYaNotBetween(String value1, String value2) {
            addCriterion("DIAN_YA not between", value1, value2, "dianYa");
            return (Criteria) this;
        }

        public Criteria andJiaoDuIsNull() {
            addCriterion("JIAO_DU is null");
            return (Criteria) this;
        }

        public Criteria andJiaoDuIsNotNull() {
            addCriterion("JIAO_DU is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoDuEqualTo(String value) {
            addCriterion("JIAO_DU =", value, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuNotEqualTo(String value) {
            addCriterion("JIAO_DU <>", value, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuGreaterThan(String value) {
            addCriterion("JIAO_DU >", value, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuGreaterThanOrEqualTo(String value) {
            addCriterion("JIAO_DU >=", value, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuLessThan(String value) {
            addCriterion("JIAO_DU <", value, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuLessThanOrEqualTo(String value) {
            addCriterion("JIAO_DU <=", value, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuLike(String value) {
            addCriterion("JIAO_DU like", value, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuNotLike(String value) {
            addCriterion("JIAO_DU not like", value, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuIn(List<String> values) {
            addCriterion("JIAO_DU in", values, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuNotIn(List<String> values) {
            addCriterion("JIAO_DU not in", values, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuBetween(String value1, String value2) {
            addCriterion("JIAO_DU between", value1, value2, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andJiaoDuNotBetween(String value1, String value2) {
            addCriterion("JIAO_DU not between", value1, value2, "jiaoDu");
            return (Criteria) this;
        }

        public Criteria andWenDuIsNull() {
            addCriterion("WEN_DU is null");
            return (Criteria) this;
        }

        public Criteria andWenDuIsNotNull() {
            addCriterion("WEN_DU is not null");
            return (Criteria) this;
        }

        public Criteria andWenDuEqualTo(String value) {
            addCriterion("WEN_DU =", value, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuNotEqualTo(String value) {
            addCriterion("WEN_DU <>", value, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuGreaterThan(String value) {
            addCriterion("WEN_DU >", value, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuGreaterThanOrEqualTo(String value) {
            addCriterion("WEN_DU >=", value, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuLessThan(String value) {
            addCriterion("WEN_DU <", value, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuLessThanOrEqualTo(String value) {
            addCriterion("WEN_DU <=", value, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuLike(String value) {
            addCriterion("WEN_DU like", value, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuNotLike(String value) {
            addCriterion("WEN_DU not like", value, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuIn(List<String> values) {
            addCriterion("WEN_DU in", values, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuNotIn(List<String> values) {
            addCriterion("WEN_DU not in", values, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuBetween(String value1, String value2) {
            addCriterion("WEN_DU between", value1, value2, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWenDuNotBetween(String value1, String value2) {
            addCriterion("WEN_DU not between", value1, value2, "wenDu");
            return (Criteria) this;
        }

        public Criteria andWeiYiIsNull() {
            addCriterion("WEI_YI is null");
            return (Criteria) this;
        }

        public Criteria andWeiYiIsNotNull() {
            addCriterion("WEI_YI is not null");
            return (Criteria) this;
        }

        public Criteria andWeiYiEqualTo(String value) {
            addCriterion("WEI_YI =", value, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiNotEqualTo(String value) {
            addCriterion("WEI_YI <>", value, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiGreaterThan(String value) {
            addCriterion("WEI_YI >", value, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiGreaterThanOrEqualTo(String value) {
            addCriterion("WEI_YI >=", value, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiLessThan(String value) {
            addCriterion("WEI_YI <", value, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiLessThanOrEqualTo(String value) {
            addCriterion("WEI_YI <=", value, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiLike(String value) {
            addCriterion("WEI_YI like", value, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiNotLike(String value) {
            addCriterion("WEI_YI not like", value, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiIn(List<String> values) {
            addCriterion("WEI_YI in", values, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiNotIn(List<String> values) {
            addCriterion("WEI_YI not in", values, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiBetween(String value1, String value2) {
            addCriterion("WEI_YI between", value1, value2, "weiYi");
            return (Criteria) this;
        }

        public Criteria andWeiYiNotBetween(String value1, String value2) {
            addCriterion("WEI_YI not between", value1, value2, "weiYi");
            return (Criteria) this;
        }

        public Criteria andRssiIsNull() {
            addCriterion("RSSI is null");
            return (Criteria) this;
        }

        public Criteria andRssiIsNotNull() {
            addCriterion("RSSI is not null");
            return (Criteria) this;
        }

        public Criteria andRssiEqualTo(String value) {
            addCriterion("RSSI =", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotEqualTo(String value) {
            addCriterion("RSSI <>", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiGreaterThan(String value) {
            addCriterion("RSSI >", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiGreaterThanOrEqualTo(String value) {
            addCriterion("RSSI >=", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiLessThan(String value) {
            addCriterion("RSSI <", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiLessThanOrEqualTo(String value) {
            addCriterion("RSSI <=", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiLike(String value) {
            addCriterion("RSSI like", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotLike(String value) {
            addCriterion("RSSI not like", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiIn(List<String> values) {
            addCriterion("RSSI in", values, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotIn(List<String> values) {
            addCriterion("RSSI not in", values, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiBetween(String value1, String value2) {
            addCriterion("RSSI between", value1, value2, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotBetween(String value1, String value2) {
            addCriterion("RSSI not between", value1, value2, "rssi");
            return (Criteria) this;
        }

        public Criteria andZhouQiIsNull() {
            addCriterion("ZHOU_QI is null");
            return (Criteria) this;
        }

        public Criteria andZhouQiIsNotNull() {
            addCriterion("ZHOU_QI is not null");
            return (Criteria) this;
        }

        public Criteria andZhouQiEqualTo(String value) {
            addCriterion("ZHOU_QI =", value, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiNotEqualTo(String value) {
            addCriterion("ZHOU_QI <>", value, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiGreaterThan(String value) {
            addCriterion("ZHOU_QI >", value, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHOU_QI >=", value, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiLessThan(String value) {
            addCriterion("ZHOU_QI <", value, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiLessThanOrEqualTo(String value) {
            addCriterion("ZHOU_QI <=", value, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiLike(String value) {
            addCriterion("ZHOU_QI like", value, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiNotLike(String value) {
            addCriterion("ZHOU_QI not like", value, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiIn(List<String> values) {
            addCriterion("ZHOU_QI in", values, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiNotIn(List<String> values) {
            addCriterion("ZHOU_QI not in", values, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiBetween(String value1, String value2) {
            addCriterion("ZHOU_QI between", value1, value2, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andZhouQiNotBetween(String value1, String value2) {
            addCriterion("ZHOU_QI not between", value1, value2, "zhouQi");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianIsNull() {
            addCriterion("GUAN_ZHU_DIAN is null");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianIsNotNull() {
            addCriterion("GUAN_ZHU_DIAN is not null");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianEqualTo(String value) {
            addCriterion("GUAN_ZHU_DIAN =", value, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianNotEqualTo(String value) {
            addCriterion("GUAN_ZHU_DIAN <>", value, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianGreaterThan(String value) {
            addCriterion("GUAN_ZHU_DIAN >", value, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianGreaterThanOrEqualTo(String value) {
            addCriterion("GUAN_ZHU_DIAN >=", value, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianLessThan(String value) {
            addCriterion("GUAN_ZHU_DIAN <", value, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianLessThanOrEqualTo(String value) {
            addCriterion("GUAN_ZHU_DIAN <=", value, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianLike(String value) {
            addCriterion("GUAN_ZHU_DIAN like", value, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianNotLike(String value) {
            addCriterion("GUAN_ZHU_DIAN not like", value, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianIn(List<String> values) {
            addCriterion("GUAN_ZHU_DIAN in", values, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianNotIn(List<String> values) {
            addCriterion("GUAN_ZHU_DIAN not in", values, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianBetween(String value1, String value2) {
            addCriterion("GUAN_ZHU_DIAN between", value1, value2, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andGuanZhuDianNotBetween(String value1, String value2) {
            addCriterion("GUAN_ZHU_DIAN not between", value1, value2, "guanZhuDian");
            return (Criteria) this;
        }

        public Criteria andWeiDuIsNull() {
            addCriterion("WEI_DU is null");
            return (Criteria) this;
        }

        public Criteria andWeiDuIsNotNull() {
            addCriterion("WEI_DU is not null");
            return (Criteria) this;
        }

        public Criteria andWeiDuEqualTo(String value) {
            addCriterion("WEI_DU =", value, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuNotEqualTo(String value) {
            addCriterion("WEI_DU <>", value, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuGreaterThan(String value) {
            addCriterion("WEI_DU >", value, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuGreaterThanOrEqualTo(String value) {
            addCriterion("WEI_DU >=", value, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuLessThan(String value) {
            addCriterion("WEI_DU <", value, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuLessThanOrEqualTo(String value) {
            addCriterion("WEI_DU <=", value, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuLike(String value) {
            addCriterion("WEI_DU like", value, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuNotLike(String value) {
            addCriterion("WEI_DU not like", value, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuIn(List<String> values) {
            addCriterion("WEI_DU in", values, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuNotIn(List<String> values) {
            addCriterion("WEI_DU not in", values, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuBetween(String value1, String value2) {
            addCriterion("WEI_DU between", value1, value2, "weiDu");
            return (Criteria) this;
        }

        public Criteria andWeiDuNotBetween(String value1, String value2) {
            addCriterion("WEI_DU not between", value1, value2, "weiDu");
            return (Criteria) this;
        }

        public Criteria andJingDuIsNull() {
            addCriterion("JING_DU is null");
            return (Criteria) this;
        }

        public Criteria andJingDuIsNotNull() {
            addCriterion("JING_DU is not null");
            return (Criteria) this;
        }

        public Criteria andJingDuEqualTo(String value) {
            addCriterion("JING_DU =", value, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuNotEqualTo(String value) {
            addCriterion("JING_DU <>", value, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuGreaterThan(String value) {
            addCriterion("JING_DU >", value, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuGreaterThanOrEqualTo(String value) {
            addCriterion("JING_DU >=", value, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuLessThan(String value) {
            addCriterion("JING_DU <", value, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuLessThanOrEqualTo(String value) {
            addCriterion("JING_DU <=", value, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuLike(String value) {
            addCriterion("JING_DU like", value, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuNotLike(String value) {
            addCriterion("JING_DU not like", value, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuIn(List<String> values) {
            addCriterion("JING_DU in", values, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuNotIn(List<String> values) {
            addCriterion("JING_DU not in", values, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuBetween(String value1, String value2) {
            addCriterion("JING_DU between", value1, value2, "jingDu");
            return (Criteria) this;
        }

        public Criteria andJingDuNotBetween(String value1, String value2) {
            addCriterion("JING_DU not between", value1, value2, "jingDu");
            return (Criteria) this;
        }

        public Criteria andPicSizeIsNull() {
            addCriterion("PIC_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andPicSizeIsNotNull() {
            addCriterion("PIC_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andPicSizeEqualTo(String value) {
            addCriterion("PIC_SIZE =", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeNotEqualTo(String value) {
            addCriterion("PIC_SIZE <>", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeGreaterThan(String value) {
            addCriterion("PIC_SIZE >", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_SIZE >=", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeLessThan(String value) {
            addCriterion("PIC_SIZE <", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeLessThanOrEqualTo(String value) {
            addCriterion("PIC_SIZE <=", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeLike(String value) {
            addCriterion("PIC_SIZE like", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeNotLike(String value) {
            addCriterion("PIC_SIZE not like", value, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeIn(List<String> values) {
            addCriterion("PIC_SIZE in", values, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeNotIn(List<String> values) {
            addCriterion("PIC_SIZE not in", values, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeBetween(String value1, String value2) {
            addCriterion("PIC_SIZE between", value1, value2, "picSize");
            return (Criteria) this;
        }

        public Criteria andPicSizeNotBetween(String value1, String value2) {
            addCriterion("PIC_SIZE not between", value1, value2, "picSize");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanIsNull() {
            addCriterion("LEIJIA_JIAOYAN is null");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanIsNotNull() {
            addCriterion("LEIJIA_JIAOYAN is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanEqualTo(String value) {
            addCriterion("LEIJIA_JIAOYAN =", value, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanNotEqualTo(String value) {
            addCriterion("LEIJIA_JIAOYAN <>", value, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanGreaterThan(String value) {
            addCriterion("LEIJIA_JIAOYAN >", value, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanGreaterThanOrEqualTo(String value) {
            addCriterion("LEIJIA_JIAOYAN >=", value, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanLessThan(String value) {
            addCriterion("LEIJIA_JIAOYAN <", value, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanLessThanOrEqualTo(String value) {
            addCriterion("LEIJIA_JIAOYAN <=", value, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanLike(String value) {
            addCriterion("LEIJIA_JIAOYAN like", value, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanNotLike(String value) {
            addCriterion("LEIJIA_JIAOYAN not like", value, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanIn(List<String> values) {
            addCriterion("LEIJIA_JIAOYAN in", values, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanNotIn(List<String> values) {
            addCriterion("LEIJIA_JIAOYAN not in", values, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanBetween(String value1, String value2) {
            addCriterion("LEIJIA_JIAOYAN between", value1, value2, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andLeijiaJiaoyanNotBetween(String value1, String value2) {
            addCriterion("LEIJIA_JIAOYAN not between", value1, value2, "leijiaJiaoyan");
            return (Criteria) this;
        }

        public Criteria andPicCpcIsNull() {
            addCriterion("PIC_CPC is null");
            return (Criteria) this;
        }

        public Criteria andPicCpcIsNotNull() {
            addCriterion("PIC_CPC is not null");
            return (Criteria) this;
        }

        public Criteria andPicCpcEqualTo(String value) {
            addCriterion("PIC_CPC =", value, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcNotEqualTo(String value) {
            addCriterion("PIC_CPC <>", value, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcGreaterThan(String value) {
            addCriterion("PIC_CPC >", value, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_CPC >=", value, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcLessThan(String value) {
            addCriterion("PIC_CPC <", value, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcLessThanOrEqualTo(String value) {
            addCriterion("PIC_CPC <=", value, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcLike(String value) {
            addCriterion("PIC_CPC like", value, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcNotLike(String value) {
            addCriterion("PIC_CPC not like", value, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcIn(List<String> values) {
            addCriterion("PIC_CPC in", values, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcNotIn(List<String> values) {
            addCriterion("PIC_CPC not in", values, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcBetween(String value1, String value2) {
            addCriterion("PIC_CPC between", value1, value2, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicCpcNotBetween(String value1, String value2) {
            addCriterion("PIC_CPC not between", value1, value2, "picCpc");
            return (Criteria) this;
        }

        public Criteria andPicZhentouIsNull() {
            addCriterion("PIC_ZHENTOU is null");
            return (Criteria) this;
        }

        public Criteria andPicZhentouIsNotNull() {
            addCriterion("PIC_ZHENTOU is not null");
            return (Criteria) this;
        }

        public Criteria andPicZhentouEqualTo(String value) {
            addCriterion("PIC_ZHENTOU =", value, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouNotEqualTo(String value) {
            addCriterion("PIC_ZHENTOU <>", value, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouGreaterThan(String value) {
            addCriterion("PIC_ZHENTOU >", value, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_ZHENTOU >=", value, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouLessThan(String value) {
            addCriterion("PIC_ZHENTOU <", value, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouLessThanOrEqualTo(String value) {
            addCriterion("PIC_ZHENTOU <=", value, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouLike(String value) {
            addCriterion("PIC_ZHENTOU like", value, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouNotLike(String value) {
            addCriterion("PIC_ZHENTOU not like", value, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouIn(List<String> values) {
            addCriterion("PIC_ZHENTOU in", values, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouNotIn(List<String> values) {
            addCriterion("PIC_ZHENTOU not in", values, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouBetween(String value1, String value2) {
            addCriterion("PIC_ZHENTOU between", value1, value2, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicZhentouNotBetween(String value1, String value2) {
            addCriterion("PIC_ZHENTOU not between", value1, value2, "picZhentou");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataIsNull() {
            addCriterion("PIC_YASUO_DATA is null");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataIsNotNull() {
            addCriterion("PIC_YASUO_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataEqualTo(String value) {
            addCriterion("PIC_YASUO_DATA =", value, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataNotEqualTo(String value) {
            addCriterion("PIC_YASUO_DATA <>", value, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataGreaterThan(String value) {
            addCriterion("PIC_YASUO_DATA >", value, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_YASUO_DATA >=", value, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataLessThan(String value) {
            addCriterion("PIC_YASUO_DATA <", value, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataLessThanOrEqualTo(String value) {
            addCriterion("PIC_YASUO_DATA <=", value, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataLike(String value) {
            addCriterion("PIC_YASUO_DATA like", value, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataNotLike(String value) {
            addCriterion("PIC_YASUO_DATA not like", value, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataIn(List<String> values) {
            addCriterion("PIC_YASUO_DATA in", values, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataNotIn(List<String> values) {
            addCriterion("PIC_YASUO_DATA not in", values, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataBetween(String value1, String value2) {
            addCriterion("PIC_YASUO_DATA between", value1, value2, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andPicYasuoDataNotBetween(String value1, String value2) {
            addCriterion("PIC_YASUO_DATA not between", value1, value2, "picYasuoData");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("IMAGE_URL =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("IMAGE_URL <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("IMAGE_URL >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_URL >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("IMAGE_URL <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_URL <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("IMAGE_URL like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("IMAGE_URL not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("IMAGE_URL in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("IMAGE_URL not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("IMAGE_URL between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("IMAGE_URL not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}