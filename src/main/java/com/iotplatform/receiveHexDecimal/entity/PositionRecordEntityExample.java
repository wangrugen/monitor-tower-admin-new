package com.iotplatform.receiveHexDecimal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PositionRecordEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionRecordEntityExample() {
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

        public Criteria andM1IsNull() {
            addCriterion("M1 is null");
            return (Criteria) this;
        }

        public Criteria andM1IsNotNull() {
            addCriterion("M1 is not null");
            return (Criteria) this;
        }

        public Criteria andM1EqualTo(String value) {
            addCriterion("M1 =", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotEqualTo(String value) {
            addCriterion("M1 <>", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1GreaterThan(String value) {
            addCriterion("M1 >", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1GreaterThanOrEqualTo(String value) {
            addCriterion("M1 >=", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1LessThan(String value) {
            addCriterion("M1 <", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1LessThanOrEqualTo(String value) {
            addCriterion("M1 <=", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1Like(String value) {
            addCriterion("M1 like", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotLike(String value) {
            addCriterion("M1 not like", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1In(List<String> values) {
            addCriterion("M1 in", values, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotIn(List<String> values) {
            addCriterion("M1 not in", values, "m1");
            return (Criteria) this;
        }

        public Criteria andM1Between(String value1, String value2) {
            addCriterion("M1 between", value1, value2, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotBetween(String value1, String value2) {
            addCriterion("M1 not between", value1, value2, "m1");
            return (Criteria) this;
        }

        public Criteria andM2IsNull() {
            addCriterion("M2 is null");
            return (Criteria) this;
        }

        public Criteria andM2IsNotNull() {
            addCriterion("M2 is not null");
            return (Criteria) this;
        }

        public Criteria andM2EqualTo(String value) {
            addCriterion("M2 =", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotEqualTo(String value) {
            addCriterion("M2 <>", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThan(String value) {
            addCriterion("M2 >", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThanOrEqualTo(String value) {
            addCriterion("M2 >=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThan(String value) {
            addCriterion("M2 <", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThanOrEqualTo(String value) {
            addCriterion("M2 <=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2Like(String value) {
            addCriterion("M2 like", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotLike(String value) {
            addCriterion("M2 not like", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2In(List<String> values) {
            addCriterion("M2 in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotIn(List<String> values) {
            addCriterion("M2 not in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2Between(String value1, String value2) {
            addCriterion("M2 between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotBetween(String value1, String value2) {
            addCriterion("M2 not between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("IMEI is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("IMEI is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("IMEI =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("IMEI <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("IMEI >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("IMEI >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("IMEI <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("IMEI <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("IMEI like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("IMEI not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("IMEI in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("IMEI not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("IMEI between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("IMEI not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andShiJianIsNull() {
            addCriterion("SHI_JIAN is null");
            return (Criteria) this;
        }

        public Criteria andShiJianIsNotNull() {
            addCriterion("SHI_JIAN is not null");
            return (Criteria) this;
        }

        public Criteria andShiJianEqualTo(String value) {
            addCriterion("SHI_JIAN =", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianNotEqualTo(String value) {
            addCriterion("SHI_JIAN <>", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianGreaterThan(String value) {
            addCriterion("SHI_JIAN >", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianGreaterThanOrEqualTo(String value) {
            addCriterion("SHI_JIAN >=", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianLessThan(String value) {
            addCriterion("SHI_JIAN <", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianLessThanOrEqualTo(String value) {
            addCriterion("SHI_JIAN <=", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianLike(String value) {
            addCriterion("SHI_JIAN like", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianNotLike(String value) {
            addCriterion("SHI_JIAN not like", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianIn(List<String> values) {
            addCriterion("SHI_JIAN in", values, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianNotIn(List<String> values) {
            addCriterion("SHI_JIAN not in", values, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianBetween(String value1, String value2) {
            addCriterion("SHI_JIAN between", value1, value2, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianNotBetween(String value1, String value2) {
            addCriterion("SHI_JIAN not between", value1, value2, "shiJian");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangIsNull() {
            addCriterion("XIN_HAO_ZHI_LIANG is null");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangIsNotNull() {
            addCriterion("XIN_HAO_ZHI_LIANG is not null");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangEqualTo(String value) {
            addCriterion("XIN_HAO_ZHI_LIANG =", value, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangNotEqualTo(String value) {
            addCriterion("XIN_HAO_ZHI_LIANG <>", value, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangGreaterThan(String value) {
            addCriterion("XIN_HAO_ZHI_LIANG >", value, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangGreaterThanOrEqualTo(String value) {
            addCriterion("XIN_HAO_ZHI_LIANG >=", value, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangLessThan(String value) {
            addCriterion("XIN_HAO_ZHI_LIANG <", value, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangLessThanOrEqualTo(String value) {
            addCriterion("XIN_HAO_ZHI_LIANG <=", value, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangLike(String value) {
            addCriterion("XIN_HAO_ZHI_LIANG like", value, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangNotLike(String value) {
            addCriterion("XIN_HAO_ZHI_LIANG not like", value, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangIn(List<String> values) {
            addCriterion("XIN_HAO_ZHI_LIANG in", values, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangNotIn(List<String> values) {
            addCriterion("XIN_HAO_ZHI_LIANG not in", values, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangBetween(String value1, String value2) {
            addCriterion("XIN_HAO_ZHI_LIANG between", value1, value2, "xinHaoZhiLiang");
            return (Criteria) this;
        }

        public Criteria andXinHaoZhiLiangNotBetween(String value1, String value2) {
            addCriterion("XIN_HAO_ZHI_LIANG not between", value1, value2, "xinHaoZhiLiang");
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

        public Criteria andGaoDuIsNull() {
            addCriterion("GAO_DU is null");
            return (Criteria) this;
        }

        public Criteria andGaoDuIsNotNull() {
            addCriterion("GAO_DU is not null");
            return (Criteria) this;
        }

        public Criteria andGaoDuEqualTo(String value) {
            addCriterion("GAO_DU =", value, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuNotEqualTo(String value) {
            addCriterion("GAO_DU <>", value, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuGreaterThan(String value) {
            addCriterion("GAO_DU >", value, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuGreaterThanOrEqualTo(String value) {
            addCriterion("GAO_DU >=", value, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuLessThan(String value) {
            addCriterion("GAO_DU <", value, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuLessThanOrEqualTo(String value) {
            addCriterion("GAO_DU <=", value, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuLike(String value) {
            addCriterion("GAO_DU like", value, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuNotLike(String value) {
            addCriterion("GAO_DU not like", value, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuIn(List<String> values) {
            addCriterion("GAO_DU in", values, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuNotIn(List<String> values) {
            addCriterion("GAO_DU not in", values, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuBetween(String value1, String value2) {
            addCriterion("GAO_DU between", value1, value2, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andGaoDuNotBetween(String value1, String value2) {
            addCriterion("GAO_DU not between", value1, value2, "gaoDu");
            return (Criteria) this;
        }

        public Criteria andDwIsNull() {
            addCriterion("DW is null");
            return (Criteria) this;
        }

        public Criteria andDwIsNotNull() {
            addCriterion("DW is not null");
            return (Criteria) this;
        }

        public Criteria andDwEqualTo(String value) {
            addCriterion("DW =", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotEqualTo(String value) {
            addCriterion("DW <>", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThan(String value) {
            addCriterion("DW >", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThanOrEqualTo(String value) {
            addCriterion("DW >=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThan(String value) {
            addCriterion("DW <", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThanOrEqualTo(String value) {
            addCriterion("DW <=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLike(String value) {
            addCriterion("DW like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotLike(String value) {
            addCriterion("DW not like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwIn(List<String> values) {
            addCriterion("DW in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotIn(List<String> values) {
            addCriterion("DW not in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwBetween(String value1, String value2) {
            addCriterion("DW between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotBetween(String value1, String value2) {
            addCriterion("DW not between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andNsIsNull() {
            addCriterion("NS is null");
            return (Criteria) this;
        }

        public Criteria andNsIsNotNull() {
            addCriterion("NS is not null");
            return (Criteria) this;
        }

        public Criteria andNsEqualTo(String value) {
            addCriterion("NS =", value, "ns");
            return (Criteria) this;
        }

        public Criteria andNsNotEqualTo(String value) {
            addCriterion("NS <>", value, "ns");
            return (Criteria) this;
        }

        public Criteria andNsGreaterThan(String value) {
            addCriterion("NS >", value, "ns");
            return (Criteria) this;
        }

        public Criteria andNsGreaterThanOrEqualTo(String value) {
            addCriterion("NS >=", value, "ns");
            return (Criteria) this;
        }

        public Criteria andNsLessThan(String value) {
            addCriterion("NS <", value, "ns");
            return (Criteria) this;
        }

        public Criteria andNsLessThanOrEqualTo(String value) {
            addCriterion("NS <=", value, "ns");
            return (Criteria) this;
        }

        public Criteria andNsLike(String value) {
            addCriterion("NS like", value, "ns");
            return (Criteria) this;
        }

        public Criteria andNsNotLike(String value) {
            addCriterion("NS not like", value, "ns");
            return (Criteria) this;
        }

        public Criteria andNsIn(List<String> values) {
            addCriterion("NS in", values, "ns");
            return (Criteria) this;
        }

        public Criteria andNsNotIn(List<String> values) {
            addCriterion("NS not in", values, "ns");
            return (Criteria) this;
        }

        public Criteria andNsBetween(String value1, String value2) {
            addCriterion("NS between", value1, value2, "ns");
            return (Criteria) this;
        }

        public Criteria andNsNotBetween(String value1, String value2) {
            addCriterion("NS not between", value1, value2, "ns");
            return (Criteria) this;
        }

        public Criteria andEwIsNull() {
            addCriterion("EW is null");
            return (Criteria) this;
        }

        public Criteria andEwIsNotNull() {
            addCriterion("EW is not null");
            return (Criteria) this;
        }

        public Criteria andEwEqualTo(String value) {
            addCriterion("EW =", value, "ew");
            return (Criteria) this;
        }

        public Criteria andEwNotEqualTo(String value) {
            addCriterion("EW <>", value, "ew");
            return (Criteria) this;
        }

        public Criteria andEwGreaterThan(String value) {
            addCriterion("EW >", value, "ew");
            return (Criteria) this;
        }

        public Criteria andEwGreaterThanOrEqualTo(String value) {
            addCriterion("EW >=", value, "ew");
            return (Criteria) this;
        }

        public Criteria andEwLessThan(String value) {
            addCriterion("EW <", value, "ew");
            return (Criteria) this;
        }

        public Criteria andEwLessThanOrEqualTo(String value) {
            addCriterion("EW <=", value, "ew");
            return (Criteria) this;
        }

        public Criteria andEwLike(String value) {
            addCriterion("EW like", value, "ew");
            return (Criteria) this;
        }

        public Criteria andEwNotLike(String value) {
            addCriterion("EW not like", value, "ew");
            return (Criteria) this;
        }

        public Criteria andEwIn(List<String> values) {
            addCriterion("EW in", values, "ew");
            return (Criteria) this;
        }

        public Criteria andEwNotIn(List<String> values) {
            addCriterion("EW not in", values, "ew");
            return (Criteria) this;
        }

        public Criteria andEwBetween(String value1, String value2) {
            addCriterion("EW between", value1, value2, "ew");
            return (Criteria) this;
        }

        public Criteria andEwNotBetween(String value1, String value2) {
            addCriterion("EW not between", value1, value2, "ew");
            return (Criteria) this;
        }

        public Criteria andWxIsNull() {
            addCriterion("WX is null");
            return (Criteria) this;
        }

        public Criteria andWxIsNotNull() {
            addCriterion("WX is not null");
            return (Criteria) this;
        }

        public Criteria andWxEqualTo(String value) {
            addCriterion("WX =", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotEqualTo(String value) {
            addCriterion("WX <>", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThan(String value) {
            addCriterion("WX >", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThanOrEqualTo(String value) {
            addCriterion("WX >=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThan(String value) {
            addCriterion("WX <", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThanOrEqualTo(String value) {
            addCriterion("WX <=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLike(String value) {
            addCriterion("WX like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotLike(String value) {
            addCriterion("WX not like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxIn(List<String> values) {
            addCriterion("WX in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotIn(List<String> values) {
            addCriterion("WX not in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxBetween(String value1, String value2) {
            addCriterion("WX between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotBetween(String value1, String value2) {
            addCriterion("WX not between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andDyIsNull() {
            addCriterion("DY is null");
            return (Criteria) this;
        }

        public Criteria andDyIsNotNull() {
            addCriterion("DY is not null");
            return (Criteria) this;
        }

        public Criteria andDyEqualTo(String value) {
            addCriterion("DY =", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotEqualTo(String value) {
            addCriterion("DY <>", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyGreaterThan(String value) {
            addCriterion("DY >", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyGreaterThanOrEqualTo(String value) {
            addCriterion("DY >=", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyLessThan(String value) {
            addCriterion("DY <", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyLessThanOrEqualTo(String value) {
            addCriterion("DY <=", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyLike(String value) {
            addCriterion("DY like", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotLike(String value) {
            addCriterion("DY not like", value, "dy");
            return (Criteria) this;
        }

        public Criteria andDyIn(List<String> values) {
            addCriterion("DY in", values, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotIn(List<String> values) {
            addCriterion("DY not in", values, "dy");
            return (Criteria) this;
        }

        public Criteria andDyBetween(String value1, String value2) {
            addCriterion("DY between", value1, value2, "dy");
            return (Criteria) this;
        }

        public Criteria andDyNotBetween(String value1, String value2) {
            addCriterion("DY not between", value1, value2, "dy");
            return (Criteria) this;
        }

        public Criteria andHeIsNull() {
            addCriterion("HE is null");
            return (Criteria) this;
        }

        public Criteria andHeIsNotNull() {
            addCriterion("HE is not null");
            return (Criteria) this;
        }

        public Criteria andHeEqualTo(String value) {
            addCriterion("HE =", value, "he");
            return (Criteria) this;
        }

        public Criteria andHeNotEqualTo(String value) {
            addCriterion("HE <>", value, "he");
            return (Criteria) this;
        }

        public Criteria andHeGreaterThan(String value) {
            addCriterion("HE >", value, "he");
            return (Criteria) this;
        }

        public Criteria andHeGreaterThanOrEqualTo(String value) {
            addCriterion("HE >=", value, "he");
            return (Criteria) this;
        }

        public Criteria andHeLessThan(String value) {
            addCriterion("HE <", value, "he");
            return (Criteria) this;
        }

        public Criteria andHeLessThanOrEqualTo(String value) {
            addCriterion("HE <=", value, "he");
            return (Criteria) this;
        }

        public Criteria andHeLike(String value) {
            addCriterion("HE like", value, "he");
            return (Criteria) this;
        }

        public Criteria andHeNotLike(String value) {
            addCriterion("HE not like", value, "he");
            return (Criteria) this;
        }

        public Criteria andHeIn(List<String> values) {
            addCriterion("HE in", values, "he");
            return (Criteria) this;
        }

        public Criteria andHeNotIn(List<String> values) {
            addCriterion("HE not in", values, "he");
            return (Criteria) this;
        }

        public Criteria andHeBetween(String value1, String value2) {
            addCriterion("HE between", value1, value2, "he");
            return (Criteria) this;
        }

        public Criteria andHeNotBetween(String value1, String value2) {
            addCriterion("HE not between", value1, value2, "he");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
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