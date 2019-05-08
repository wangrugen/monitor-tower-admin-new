package com.iotplatform.receiveHexDecimal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiveHexDecimalEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiveHexDecimalEntityExample() {
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

        public Criteria andBeginIsNull() {
            addCriterion("BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andBeginIsNotNull() {
            addCriterion("BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andBeginEqualTo(String value) {
            addCriterion("BEGIN =", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginNotEqualTo(String value) {
            addCriterion("BEGIN <>", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginGreaterThan(String value) {
            addCriterion("BEGIN >", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginGreaterThanOrEqualTo(String value) {
            addCriterion("BEGIN >=", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginLessThan(String value) {
            addCriterion("BEGIN <", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginLessThanOrEqualTo(String value) {
            addCriterion("BEGIN <=", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginLike(String value) {
            addCriterion("BEGIN like", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginNotLike(String value) {
            addCriterion("BEGIN not like", value, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginIn(List<String> values) {
            addCriterion("BEGIN in", values, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginNotIn(List<String> values) {
            addCriterion("BEGIN not in", values, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginBetween(String value1, String value2) {
            addCriterion("BEGIN between", value1, value2, "begin");
            return (Criteria) this;
        }

        public Criteria andBeginNotBetween(String value1, String value2) {
            addCriterion("BEGIN not between", value1, value2, "begin");
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

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("TIME like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("TIME not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andJinGduIsNull() {
            addCriterion("JIN_GDU is null");
            return (Criteria) this;
        }

        public Criteria andJinGduIsNotNull() {
            addCriterion("JIN_GDU is not null");
            return (Criteria) this;
        }

        public Criteria andJinGduEqualTo(String value) {
            addCriterion("JIN_GDU =", value, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduNotEqualTo(String value) {
            addCriterion("JIN_GDU <>", value, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduGreaterThan(String value) {
            addCriterion("JIN_GDU >", value, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduGreaterThanOrEqualTo(String value) {
            addCriterion("JIN_GDU >=", value, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduLessThan(String value) {
            addCriterion("JIN_GDU <", value, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduLessThanOrEqualTo(String value) {
            addCriterion("JIN_GDU <=", value, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduLike(String value) {
            addCriterion("JIN_GDU like", value, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduNotLike(String value) {
            addCriterion("JIN_GDU not like", value, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduIn(List<String> values) {
            addCriterion("JIN_GDU in", values, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduNotIn(List<String> values) {
            addCriterion("JIN_GDU not in", values, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduBetween(String value1, String value2) {
            addCriterion("JIN_GDU between", value1, value2, "jinGdu");
            return (Criteria) this;
        }

        public Criteria andJinGduNotBetween(String value1, String value2) {
            addCriterion("JIN_GDU not between", value1, value2, "jinGdu");
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

        public Criteria andBeiYongIsNull() {
            addCriterion("BEI_YONG is null");
            return (Criteria) this;
        }

        public Criteria andBeiYongIsNotNull() {
            addCriterion("BEI_YONG is not null");
            return (Criteria) this;
        }

        public Criteria andBeiYongEqualTo(String value) {
            addCriterion("BEI_YONG =", value, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongNotEqualTo(String value) {
            addCriterion("BEI_YONG <>", value, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongGreaterThan(String value) {
            addCriterion("BEI_YONG >", value, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongGreaterThanOrEqualTo(String value) {
            addCriterion("BEI_YONG >=", value, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongLessThan(String value) {
            addCriterion("BEI_YONG <", value, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongLessThanOrEqualTo(String value) {
            addCriterion("BEI_YONG <=", value, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongLike(String value) {
            addCriterion("BEI_YONG like", value, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongNotLike(String value) {
            addCriterion("BEI_YONG not like", value, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongIn(List<String> values) {
            addCriterion("BEI_YONG in", values, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongNotIn(List<String> values) {
            addCriterion("BEI_YONG not in", values, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongBetween(String value1, String value2) {
            addCriterion("BEI_YONG between", value1, value2, "beiYong");
            return (Criteria) this;
        }

        public Criteria andBeiYongNotBetween(String value1, String value2) {
            addCriterion("BEI_YONG not between", value1, value2, "beiYong");
            return (Criteria) this;
        }

        public Criteria andEndIsNull() {
            addCriterion("END is null");
            return (Criteria) this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("END is not null");
            return (Criteria) this;
        }

        public Criteria andEndEqualTo(String value) {
            addCriterion("END =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(String value) {
            addCriterion("END <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(String value) {
            addCriterion("END >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(String value) {
            addCriterion("END >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(String value) {
            addCriterion("END <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(String value) {
            addCriterion("END <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLike(String value) {
            addCriterion("END like", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotLike(String value) {
            addCriterion("END not like", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<String> values) {
            addCriterion("END in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<String> values) {
            addCriterion("END not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(String value1, String value2) {
            addCriterion("END between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(String value1, String value2) {
            addCriterion("END not between", value1, value2, "end");
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