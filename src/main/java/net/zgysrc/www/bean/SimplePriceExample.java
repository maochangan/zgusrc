package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class SimplePriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimplePriceExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeIsNull() {
            addCriterion("simple_vip_type is null");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeIsNotNull() {
            addCriterion("simple_vip_type is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeEqualTo(String value) {
            addCriterion("simple_vip_type =", value, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeNotEqualTo(String value) {
            addCriterion("simple_vip_type <>", value, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeGreaterThan(String value) {
            addCriterion("simple_vip_type >", value, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("simple_vip_type >=", value, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeLessThan(String value) {
            addCriterion("simple_vip_type <", value, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeLessThanOrEqualTo(String value) {
            addCriterion("simple_vip_type <=", value, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeLike(String value) {
            addCriterion("simple_vip_type like", value, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeNotLike(String value) {
            addCriterion("simple_vip_type not like", value, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeIn(List<String> values) {
            addCriterion("simple_vip_type in", values, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeNotIn(List<String> values) {
            addCriterion("simple_vip_type not in", values, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeBetween(String value1, String value2) {
            addCriterion("simple_vip_type between", value1, value2, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipTypeNotBetween(String value1, String value2) {
            addCriterion("simple_vip_type not between", value1, value2, "simpleVipType");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceIsNull() {
            addCriterion("simple_vip_price is null");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceIsNotNull() {
            addCriterion("simple_vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceEqualTo(String value) {
            addCriterion("simple_vip_price =", value, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceNotEqualTo(String value) {
            addCriterion("simple_vip_price <>", value, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceGreaterThan(String value) {
            addCriterion("simple_vip_price >", value, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceGreaterThanOrEqualTo(String value) {
            addCriterion("simple_vip_price >=", value, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceLessThan(String value) {
            addCriterion("simple_vip_price <", value, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceLessThanOrEqualTo(String value) {
            addCriterion("simple_vip_price <=", value, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceLike(String value) {
            addCriterion("simple_vip_price like", value, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceNotLike(String value) {
            addCriterion("simple_vip_price not like", value, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceIn(List<String> values) {
            addCriterion("simple_vip_price in", values, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceNotIn(List<String> values) {
            addCriterion("simple_vip_price not in", values, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceBetween(String value1, String value2) {
            addCriterion("simple_vip_price between", value1, value2, "simpleVipPrice");
            return (Criteria) this;
        }

        public Criteria andSimpleVipPriceNotBetween(String value1, String value2) {
            addCriterion("simple_vip_price not between", value1, value2, "simpleVipPrice");
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