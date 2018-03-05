package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class AualificationCertificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AualificationCertificationExample() {
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

        public Criteria andCertificationNumIsNull() {
            addCriterion("certification_num is null");
            return (Criteria) this;
        }

        public Criteria andCertificationNumIsNotNull() {
            addCriterion("certification_num is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationNumEqualTo(String value) {
            addCriterion("certification_num =", value, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumNotEqualTo(String value) {
            addCriterion("certification_num <>", value, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumGreaterThan(String value) {
            addCriterion("certification_num >", value, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumGreaterThanOrEqualTo(String value) {
            addCriterion("certification_num >=", value, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumLessThan(String value) {
            addCriterion("certification_num <", value, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumLessThanOrEqualTo(String value) {
            addCriterion("certification_num <=", value, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumLike(String value) {
            addCriterion("certification_num like", value, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumNotLike(String value) {
            addCriterion("certification_num not like", value, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumIn(List<String> values) {
            addCriterion("certification_num in", values, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumNotIn(List<String> values) {
            addCriterion("certification_num not in", values, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumBetween(String value1, String value2) {
            addCriterion("certification_num between", value1, value2, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNumNotBetween(String value1, String value2) {
            addCriterion("certification_num not between", value1, value2, "certificationNum");
            return (Criteria) this;
        }

        public Criteria andCertificationNameIsNull() {
            addCriterion("certification_name is null");
            return (Criteria) this;
        }

        public Criteria andCertificationNameIsNotNull() {
            addCriterion("certification_name is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationNameEqualTo(String value) {
            addCriterion("certification_name =", value, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameNotEqualTo(String value) {
            addCriterion("certification_name <>", value, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameGreaterThan(String value) {
            addCriterion("certification_name >", value, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameGreaterThanOrEqualTo(String value) {
            addCriterion("certification_name >=", value, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameLessThan(String value) {
            addCriterion("certification_name <", value, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameLessThanOrEqualTo(String value) {
            addCriterion("certification_name <=", value, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameLike(String value) {
            addCriterion("certification_name like", value, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameNotLike(String value) {
            addCriterion("certification_name not like", value, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameIn(List<String> values) {
            addCriterion("certification_name in", values, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameNotIn(List<String> values) {
            addCriterion("certification_name not in", values, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameBetween(String value1, String value2) {
            addCriterion("certification_name between", value1, value2, "certificationName");
            return (Criteria) this;
        }

        public Criteria andCertificationNameNotBetween(String value1, String value2) {
            addCriterion("certification_name not between", value1, value2, "certificationName");
            return (Criteria) this;
        }

        public Criteria andIdCardNumIsNull() {
            addCriterion("id_card_num is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumIsNotNull() {
            addCriterion("id_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNumEqualTo(String value) {
            addCriterion("id_card_num =", value, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumNotEqualTo(String value) {
            addCriterion("id_card_num <>", value, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumGreaterThan(String value) {
            addCriterion("id_card_num >", value, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_num >=", value, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumLessThan(String value) {
            addCriterion("id_card_num <", value, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumLessThanOrEqualTo(String value) {
            addCriterion("id_card_num <=", value, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumLike(String value) {
            addCriterion("id_card_num like", value, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumNotLike(String value) {
            addCriterion("id_card_num not like", value, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumIn(List<String> values) {
            addCriterion("id_card_num in", values, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumNotIn(List<String> values) {
            addCriterion("id_card_num not in", values, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumBetween(String value1, String value2) {
            addCriterion("id_card_num between", value1, value2, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andIdCardNumNotBetween(String value1, String value2) {
            addCriterion("id_card_num not between", value1, value2, "idCardNum");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeIsNull() {
            addCriterion("certification_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeIsNotNull() {
            addCriterion("certification_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeEqualTo(String value) {
            addCriterion("certification_type =", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeNotEqualTo(String value) {
            addCriterion("certification_type <>", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeGreaterThan(String value) {
            addCriterion("certification_type >", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certification_type >=", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeLessThan(String value) {
            addCriterion("certification_type <", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeLessThanOrEqualTo(String value) {
            addCriterion("certification_type <=", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeLike(String value) {
            addCriterion("certification_type like", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeNotLike(String value) {
            addCriterion("certification_type not like", value, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeIn(List<String> values) {
            addCriterion("certification_type in", values, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeNotIn(List<String> values) {
            addCriterion("certification_type not in", values, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeBetween(String value1, String value2) {
            addCriterion("certification_type between", value1, value2, "certificationType");
            return (Criteria) this;
        }

        public Criteria andCertificationTypeNotBetween(String value1, String value2) {
            addCriterion("certification_type not between", value1, value2, "certificationType");
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