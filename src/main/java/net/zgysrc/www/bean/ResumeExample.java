package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNull() {
            addCriterion("post_name is null");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNotNull() {
            addCriterion("post_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostNameEqualTo(String value) {
            addCriterion("post_name =", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotEqualTo(String value) {
            addCriterion("post_name <>", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThan(String value) {
            addCriterion("post_name >", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_name >=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThan(String value) {
            addCriterion("post_name <", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThanOrEqualTo(String value) {
            addCriterion("post_name <=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLike(String value) {
            addCriterion("post_name like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotLike(String value) {
            addCriterion("post_name not like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameIn(List<String> values) {
            addCriterion("post_name in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotIn(List<String> values) {
            addCriterion("post_name not in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameBetween(String value1, String value2) {
            addCriterion("post_name between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotBetween(String value1, String value2) {
            addCriterion("post_name not between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andBirthYearIsNull() {
            addCriterion("birth_year is null");
            return (Criteria) this;
        }

        public Criteria andBirthYearIsNotNull() {
            addCriterion("birth_year is not null");
            return (Criteria) this;
        }

        public Criteria andBirthYearEqualTo(String value) {
            addCriterion("birth_year =", value, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearNotEqualTo(String value) {
            addCriterion("birth_year <>", value, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearGreaterThan(String value) {
            addCriterion("birth_year >", value, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearGreaterThanOrEqualTo(String value) {
            addCriterion("birth_year >=", value, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearLessThan(String value) {
            addCriterion("birth_year <", value, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearLessThanOrEqualTo(String value) {
            addCriterion("birth_year <=", value, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearLike(String value) {
            addCriterion("birth_year like", value, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearNotLike(String value) {
            addCriterion("birth_year not like", value, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearIn(List<String> values) {
            addCriterion("birth_year in", values, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearNotIn(List<String> values) {
            addCriterion("birth_year not in", values, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearBetween(String value1, String value2) {
            addCriterion("birth_year between", value1, value2, "birthYear");
            return (Criteria) this;
        }

        public Criteria andBirthYearNotBetween(String value1, String value2) {
            addCriterion("birth_year not between", value1, value2, "birthYear");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("marital_status like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("marital_status not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andHukouIsNull() {
            addCriterion("hukou is null");
            return (Criteria) this;
        }

        public Criteria andHukouIsNotNull() {
            addCriterion("hukou is not null");
            return (Criteria) this;
        }

        public Criteria andHukouEqualTo(String value) {
            addCriterion("hukou =", value, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouNotEqualTo(String value) {
            addCriterion("hukou <>", value, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouGreaterThan(String value) {
            addCriterion("hukou >", value, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouGreaterThanOrEqualTo(String value) {
            addCriterion("hukou >=", value, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouLessThan(String value) {
            addCriterion("hukou <", value, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouLessThanOrEqualTo(String value) {
            addCriterion("hukou <=", value, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouLike(String value) {
            addCriterion("hukou like", value, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouNotLike(String value) {
            addCriterion("hukou not like", value, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouIn(List<String> values) {
            addCriterion("hukou in", values, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouNotIn(List<String> values) {
            addCriterion("hukou not in", values, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouBetween(String value1, String value2) {
            addCriterion("hukou between", value1, value2, "hukou");
            return (Criteria) this;
        }

        public Criteria andHukouNotBetween(String value1, String value2) {
            addCriterion("hukou not between", value1, value2, "hukou");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(String value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(String value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(String value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(String value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(String value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLike(String value) {
            addCriterion("user_state like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotLike(String value) {
            addCriterion("user_state not like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<String> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<String> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(String value1, String value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(String value1, String value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andWantIndustryIsNull() {
            addCriterion("want_industry is null");
            return (Criteria) this;
        }

        public Criteria andWantIndustryIsNotNull() {
            addCriterion("want_industry is not null");
            return (Criteria) this;
        }

        public Criteria andWantIndustryEqualTo(String value) {
            addCriterion("want_industry =", value, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryNotEqualTo(String value) {
            addCriterion("want_industry <>", value, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryGreaterThan(String value) {
            addCriterion("want_industry >", value, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("want_industry >=", value, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryLessThan(String value) {
            addCriterion("want_industry <", value, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryLessThanOrEqualTo(String value) {
            addCriterion("want_industry <=", value, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryLike(String value) {
            addCriterion("want_industry like", value, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryNotLike(String value) {
            addCriterion("want_industry not like", value, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryIn(List<String> values) {
            addCriterion("want_industry in", values, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryNotIn(List<String> values) {
            addCriterion("want_industry not in", values, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryBetween(String value1, String value2) {
            addCriterion("want_industry between", value1, value2, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantIndustryNotBetween(String value1, String value2) {
            addCriterion("want_industry not between", value1, value2, "wantIndustry");
            return (Criteria) this;
        }

        public Criteria andWantPostIsNull() {
            addCriterion("want_post is null");
            return (Criteria) this;
        }

        public Criteria andWantPostIsNotNull() {
            addCriterion("want_post is not null");
            return (Criteria) this;
        }

        public Criteria andWantPostEqualTo(String value) {
            addCriterion("want_post =", value, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostNotEqualTo(String value) {
            addCriterion("want_post <>", value, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostGreaterThan(String value) {
            addCriterion("want_post >", value, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostGreaterThanOrEqualTo(String value) {
            addCriterion("want_post >=", value, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostLessThan(String value) {
            addCriterion("want_post <", value, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostLessThanOrEqualTo(String value) {
            addCriterion("want_post <=", value, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostLike(String value) {
            addCriterion("want_post like", value, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostNotLike(String value) {
            addCriterion("want_post not like", value, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostIn(List<String> values) {
            addCriterion("want_post in", values, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostNotIn(List<String> values) {
            addCriterion("want_post not in", values, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostBetween(String value1, String value2) {
            addCriterion("want_post between", value1, value2, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantPostNotBetween(String value1, String value2) {
            addCriterion("want_post not between", value1, value2, "wantPost");
            return (Criteria) this;
        }

        public Criteria andWantAddressIsNull() {
            addCriterion("want_address is null");
            return (Criteria) this;
        }

        public Criteria andWantAddressIsNotNull() {
            addCriterion("want_address is not null");
            return (Criteria) this;
        }

        public Criteria andWantAddressEqualTo(String value) {
            addCriterion("want_address =", value, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressNotEqualTo(String value) {
            addCriterion("want_address <>", value, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressGreaterThan(String value) {
            addCriterion("want_address >", value, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressGreaterThanOrEqualTo(String value) {
            addCriterion("want_address >=", value, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressLessThan(String value) {
            addCriterion("want_address <", value, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressLessThanOrEqualTo(String value) {
            addCriterion("want_address <=", value, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressLike(String value) {
            addCriterion("want_address like", value, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressNotLike(String value) {
            addCriterion("want_address not like", value, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressIn(List<String> values) {
            addCriterion("want_address in", values, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressNotIn(List<String> values) {
            addCriterion("want_address not in", values, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressBetween(String value1, String value2) {
            addCriterion("want_address between", value1, value2, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantAddressNotBetween(String value1, String value2) {
            addCriterion("want_address not between", value1, value2, "wantAddress");
            return (Criteria) this;
        }

        public Criteria andWantSalaryIsNull() {
            addCriterion("want_salary is null");
            return (Criteria) this;
        }

        public Criteria andWantSalaryIsNotNull() {
            addCriterion("want_salary is not null");
            return (Criteria) this;
        }

        public Criteria andWantSalaryEqualTo(String value) {
            addCriterion("want_salary =", value, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryNotEqualTo(String value) {
            addCriterion("want_salary <>", value, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryGreaterThan(String value) {
            addCriterion("want_salary >", value, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("want_salary >=", value, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryLessThan(String value) {
            addCriterion("want_salary <", value, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryLessThanOrEqualTo(String value) {
            addCriterion("want_salary <=", value, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryLike(String value) {
            addCriterion("want_salary like", value, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryNotLike(String value) {
            addCriterion("want_salary not like", value, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryIn(List<String> values) {
            addCriterion("want_salary in", values, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryNotIn(List<String> values) {
            addCriterion("want_salary not in", values, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryBetween(String value1, String value2) {
            addCriterion("want_salary between", value1, value2, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andWantSalaryNotBetween(String value1, String value2) {
            addCriterion("want_salary not between", value1, value2, "wantSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryIsNull() {
            addCriterion("now_salary is null");
            return (Criteria) this;
        }

        public Criteria andNowSalaryIsNotNull() {
            addCriterion("now_salary is not null");
            return (Criteria) this;
        }

        public Criteria andNowSalaryEqualTo(String value) {
            addCriterion("now_salary =", value, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryNotEqualTo(String value) {
            addCriterion("now_salary <>", value, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryGreaterThan(String value) {
            addCriterion("now_salary >", value, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("now_salary >=", value, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryLessThan(String value) {
            addCriterion("now_salary <", value, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryLessThanOrEqualTo(String value) {
            addCriterion("now_salary <=", value, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryLike(String value) {
            addCriterion("now_salary like", value, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryNotLike(String value) {
            addCriterion("now_salary not like", value, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryIn(List<String> values) {
            addCriterion("now_salary in", values, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryNotIn(List<String> values) {
            addCriterion("now_salary not in", values, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryBetween(String value1, String value2) {
            addCriterion("now_salary between", value1, value2, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andNowSalaryNotBetween(String value1, String value2) {
            addCriterion("now_salary not between", value1, value2, "nowSalary");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameIsNull() {
            addCriterion("old_company_name is null");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameIsNotNull() {
            addCriterion("old_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameEqualTo(String value) {
            addCriterion("old_company_name =", value, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameNotEqualTo(String value) {
            addCriterion("old_company_name <>", value, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameGreaterThan(String value) {
            addCriterion("old_company_name >", value, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_company_name >=", value, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameLessThan(String value) {
            addCriterion("old_company_name <", value, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("old_company_name <=", value, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameLike(String value) {
            addCriterion("old_company_name like", value, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameNotLike(String value) {
            addCriterion("old_company_name not like", value, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameIn(List<String> values) {
            addCriterion("old_company_name in", values, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameNotIn(List<String> values) {
            addCriterion("old_company_name not in", values, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameBetween(String value1, String value2) {
            addCriterion("old_company_name between", value1, value2, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldCompanyNameNotBetween(String value1, String value2) {
            addCriterion("old_company_name not between", value1, value2, "oldCompanyName");
            return (Criteria) this;
        }

        public Criteria andOldIndustryIsNull() {
            addCriterion("old_industry is null");
            return (Criteria) this;
        }

        public Criteria andOldIndustryIsNotNull() {
            addCriterion("old_industry is not null");
            return (Criteria) this;
        }

        public Criteria andOldIndustryEqualTo(String value) {
            addCriterion("old_industry =", value, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryNotEqualTo(String value) {
            addCriterion("old_industry <>", value, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryGreaterThan(String value) {
            addCriterion("old_industry >", value, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("old_industry >=", value, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryLessThan(String value) {
            addCriterion("old_industry <", value, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryLessThanOrEqualTo(String value) {
            addCriterion("old_industry <=", value, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryLike(String value) {
            addCriterion("old_industry like", value, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryNotLike(String value) {
            addCriterion("old_industry not like", value, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryIn(List<String> values) {
            addCriterion("old_industry in", values, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryNotIn(List<String> values) {
            addCriterion("old_industry not in", values, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryBetween(String value1, String value2) {
            addCriterion("old_industry between", value1, value2, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldIndustryNotBetween(String value1, String value2) {
            addCriterion("old_industry not between", value1, value2, "oldIndustry");
            return (Criteria) this;
        }

        public Criteria andOldPostIsNull() {
            addCriterion("old_post is null");
            return (Criteria) this;
        }

        public Criteria andOldPostIsNotNull() {
            addCriterion("old_post is not null");
            return (Criteria) this;
        }

        public Criteria andOldPostEqualTo(String value) {
            addCriterion("old_post =", value, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostNotEqualTo(String value) {
            addCriterion("old_post <>", value, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostGreaterThan(String value) {
            addCriterion("old_post >", value, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostGreaterThanOrEqualTo(String value) {
            addCriterion("old_post >=", value, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostLessThan(String value) {
            addCriterion("old_post <", value, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostLessThanOrEqualTo(String value) {
            addCriterion("old_post <=", value, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostLike(String value) {
            addCriterion("old_post like", value, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostNotLike(String value) {
            addCriterion("old_post not like", value, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostIn(List<String> values) {
            addCriterion("old_post in", values, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostNotIn(List<String> values) {
            addCriterion("old_post not in", values, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostBetween(String value1, String value2) {
            addCriterion("old_post between", value1, value2, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldPostNotBetween(String value1, String value2) {
            addCriterion("old_post not between", value1, value2, "oldPost");
            return (Criteria) this;
        }

        public Criteria andOldAddressIsNull() {
            addCriterion("old_address is null");
            return (Criteria) this;
        }

        public Criteria andOldAddressIsNotNull() {
            addCriterion("old_address is not null");
            return (Criteria) this;
        }

        public Criteria andOldAddressEqualTo(String value) {
            addCriterion("old_address =", value, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressNotEqualTo(String value) {
            addCriterion("old_address <>", value, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressGreaterThan(String value) {
            addCriterion("old_address >", value, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressGreaterThanOrEqualTo(String value) {
            addCriterion("old_address >=", value, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressLessThan(String value) {
            addCriterion("old_address <", value, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressLessThanOrEqualTo(String value) {
            addCriterion("old_address <=", value, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressLike(String value) {
            addCriterion("old_address like", value, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressNotLike(String value) {
            addCriterion("old_address not like", value, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressIn(List<String> values) {
            addCriterion("old_address in", values, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressNotIn(List<String> values) {
            addCriterion("old_address not in", values, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressBetween(String value1, String value2) {
            addCriterion("old_address between", value1, value2, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldAddressNotBetween(String value1, String value2) {
            addCriterion("old_address not between", value1, value2, "oldAddress");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeIsNull() {
            addCriterion("old_start_time is null");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeIsNotNull() {
            addCriterion("old_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeEqualTo(String value) {
            addCriterion("old_start_time =", value, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeNotEqualTo(String value) {
            addCriterion("old_start_time <>", value, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeGreaterThan(String value) {
            addCriterion("old_start_time >", value, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("old_start_time >=", value, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeLessThan(String value) {
            addCriterion("old_start_time <", value, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeLessThanOrEqualTo(String value) {
            addCriterion("old_start_time <=", value, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeLike(String value) {
            addCriterion("old_start_time like", value, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeNotLike(String value) {
            addCriterion("old_start_time not like", value, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeIn(List<String> values) {
            addCriterion("old_start_time in", values, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeNotIn(List<String> values) {
            addCriterion("old_start_time not in", values, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeBetween(String value1, String value2) {
            addCriterion("old_start_time between", value1, value2, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldStartTimeNotBetween(String value1, String value2) {
            addCriterion("old_start_time not between", value1, value2, "oldStartTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeIsNull() {
            addCriterion("old_end_time is null");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeIsNotNull() {
            addCriterion("old_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeEqualTo(String value) {
            addCriterion("old_end_time =", value, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeNotEqualTo(String value) {
            addCriterion("old_end_time <>", value, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeGreaterThan(String value) {
            addCriterion("old_end_time >", value, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("old_end_time >=", value, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeLessThan(String value) {
            addCriterion("old_end_time <", value, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeLessThanOrEqualTo(String value) {
            addCriterion("old_end_time <=", value, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeLike(String value) {
            addCriterion("old_end_time like", value, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeNotLike(String value) {
            addCriterion("old_end_time not like", value, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeIn(List<String> values) {
            addCriterion("old_end_time in", values, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeNotIn(List<String> values) {
            addCriterion("old_end_time not in", values, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeBetween(String value1, String value2) {
            addCriterion("old_end_time between", value1, value2, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andOldEndTimeNotBetween(String value1, String value2) {
            addCriterion("old_end_time not between", value1, value2, "oldEndTime");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNull() {
            addCriterion("achievement is null");
            return (Criteria) this;
        }

        public Criteria andAchievementIsNotNull() {
            addCriterion("achievement is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementEqualTo(String value) {
            addCriterion("achievement =", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotEqualTo(String value) {
            addCriterion("achievement <>", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThan(String value) {
            addCriterion("achievement >", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementGreaterThanOrEqualTo(String value) {
            addCriterion("achievement >=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThan(String value) {
            addCriterion("achievement <", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLessThanOrEqualTo(String value) {
            addCriterion("achievement <=", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementLike(String value) {
            addCriterion("achievement like", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotLike(String value) {
            addCriterion("achievement not like", value, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementIn(List<String> values) {
            addCriterion("achievement in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotIn(List<String> values) {
            addCriterion("achievement not in", values, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementBetween(String value1, String value2) {
            addCriterion("achievement between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andAchievementNotBetween(String value1, String value2) {
            addCriterion("achievement not between", value1, value2, "achievement");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeIsNull() {
            addCriterion("edu_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeIsNotNull() {
            addCriterion("edu_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeEqualTo(String value) {
            addCriterion("edu_start_time =", value, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeNotEqualTo(String value) {
            addCriterion("edu_start_time <>", value, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeGreaterThan(String value) {
            addCriterion("edu_start_time >", value, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("edu_start_time >=", value, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeLessThan(String value) {
            addCriterion("edu_start_time <", value, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeLessThanOrEqualTo(String value) {
            addCriterion("edu_start_time <=", value, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeLike(String value) {
            addCriterion("edu_start_time like", value, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeNotLike(String value) {
            addCriterion("edu_start_time not like", value, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeIn(List<String> values) {
            addCriterion("edu_start_time in", values, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeNotIn(List<String> values) {
            addCriterion("edu_start_time not in", values, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeBetween(String value1, String value2) {
            addCriterion("edu_start_time between", value1, value2, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduStartTimeNotBetween(String value1, String value2) {
            addCriterion("edu_start_time not between", value1, value2, "eduStartTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeIsNull() {
            addCriterion("edu_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeIsNotNull() {
            addCriterion("edu_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeEqualTo(String value) {
            addCriterion("edu_end_time =", value, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeNotEqualTo(String value) {
            addCriterion("edu_end_time <>", value, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeGreaterThan(String value) {
            addCriterion("edu_end_time >", value, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("edu_end_time >=", value, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeLessThan(String value) {
            addCriterion("edu_end_time <", value, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeLessThanOrEqualTo(String value) {
            addCriterion("edu_end_time <=", value, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeLike(String value) {
            addCriterion("edu_end_time like", value, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeNotLike(String value) {
            addCriterion("edu_end_time not like", value, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeIn(List<String> values) {
            addCriterion("edu_end_time in", values, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeNotIn(List<String> values) {
            addCriterion("edu_end_time not in", values, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeBetween(String value1, String value2) {
            addCriterion("edu_end_time between", value1, value2, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEduEndTimeNotBetween(String value1, String value2) {
            addCriterion("edu_end_time not between", value1, value2, "eduEndTime");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andLauguageIsNull() {
            addCriterion("lauguage is null");
            return (Criteria) this;
        }

        public Criteria andLauguageIsNotNull() {
            addCriterion("lauguage is not null");
            return (Criteria) this;
        }

        public Criteria andLauguageEqualTo(String value) {
            addCriterion("lauguage =", value, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageNotEqualTo(String value) {
            addCriterion("lauguage <>", value, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageGreaterThan(String value) {
            addCriterion("lauguage >", value, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageGreaterThanOrEqualTo(String value) {
            addCriterion("lauguage >=", value, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageLessThan(String value) {
            addCriterion("lauguage <", value, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageLessThanOrEqualTo(String value) {
            addCriterion("lauguage <=", value, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageLike(String value) {
            addCriterion("lauguage like", value, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageNotLike(String value) {
            addCriterion("lauguage not like", value, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageIn(List<String> values) {
            addCriterion("lauguage in", values, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageNotIn(List<String> values) {
            addCriterion("lauguage not in", values, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageBetween(String value1, String value2) {
            addCriterion("lauguage between", value1, value2, "lauguage");
            return (Criteria) this;
        }

        public Criteria andLauguageNotBetween(String value1, String value2) {
            addCriterion("lauguage not between", value1, value2, "lauguage");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNull() {
            addCriterion("evaluation is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNotNull() {
            addCriterion("evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationEqualTo(String value) {
            addCriterion("evaluation =", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotEqualTo(String value) {
            addCriterion("evaluation <>", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThan(String value) {
            addCriterion("evaluation >", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation >=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThan(String value) {
            addCriterion("evaluation <", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThanOrEqualTo(String value) {
            addCriterion("evaluation <=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLike(String value) {
            addCriterion("evaluation like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotLike(String value) {
            addCriterion("evaluation not like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationIn(List<String> values) {
            addCriterion("evaluation in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotIn(List<String> values) {
            addCriterion("evaluation not in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationBetween(String value1, String value2) {
            addCriterion("evaluation between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotBetween(String value1, String value2) {
            addCriterion("evaluation not between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andViewNumberIsNull() {
            addCriterion("view_number is null");
            return (Criteria) this;
        }

        public Criteria andViewNumberIsNotNull() {
            addCriterion("view_number is not null");
            return (Criteria) this;
        }

        public Criteria andViewNumberEqualTo(Integer value) {
            addCriterion("view_number =", value, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberNotEqualTo(Integer value) {
            addCriterion("view_number <>", value, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberGreaterThan(Integer value) {
            addCriterion("view_number >", value, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_number >=", value, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberLessThan(Integer value) {
            addCriterion("view_number <", value, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberLessThanOrEqualTo(Integer value) {
            addCriterion("view_number <=", value, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberIn(List<Integer> values) {
            addCriterion("view_number in", values, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberNotIn(List<Integer> values) {
            addCriterion("view_number not in", values, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberBetween(Integer value1, Integer value2) {
            addCriterion("view_number between", value1, value2, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andViewNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("view_number not between", value1, value2, "viewNumber");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIsNull() {
            addCriterion("self_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIsNotNull() {
            addCriterion("self_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationEqualTo(String value) {
            addCriterion("self_evaluation =", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationNotEqualTo(String value) {
            addCriterion("self_evaluation <>", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationGreaterThan(String value) {
            addCriterion("self_evaluation >", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("self_evaluation >=", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationLessThan(String value) {
            addCriterion("self_evaluation <", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationLessThanOrEqualTo(String value) {
            addCriterion("self_evaluation <=", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationLike(String value) {
            addCriterion("self_evaluation like", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationNotLike(String value) {
            addCriterion("self_evaluation not like", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIn(List<String> values) {
            addCriterion("self_evaluation in", values, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationNotIn(List<String> values) {
            addCriterion("self_evaluation not in", values, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationBetween(String value1, String value2) {
            addCriterion("self_evaluation between", value1, value2, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationNotBetween(String value1, String value2) {
            addCriterion("self_evaluation not between", value1, value2, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUndergraduateIsNull() {
            addCriterion("undergraduate is null");
            return (Criteria) this;
        }

        public Criteria andUndergraduateIsNotNull() {
            addCriterion("undergraduate is not null");
            return (Criteria) this;
        }

        public Criteria andUndergraduateEqualTo(String value) {
            addCriterion("undergraduate =", value, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateNotEqualTo(String value) {
            addCriterion("undergraduate <>", value, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateGreaterThan(String value) {
            addCriterion("undergraduate >", value, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateGreaterThanOrEqualTo(String value) {
            addCriterion("undergraduate >=", value, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateLessThan(String value) {
            addCriterion("undergraduate <", value, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateLessThanOrEqualTo(String value) {
            addCriterion("undergraduate <=", value, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateLike(String value) {
            addCriterion("undergraduate like", value, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateNotLike(String value) {
            addCriterion("undergraduate not like", value, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateIn(List<String> values) {
            addCriterion("undergraduate in", values, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateNotIn(List<String> values) {
            addCriterion("undergraduate not in", values, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateBetween(String value1, String value2) {
            addCriterion("undergraduate between", value1, value2, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andUndergraduateNotBetween(String value1, String value2) {
            addCriterion("undergraduate not between", value1, value2, "undergraduate");
            return (Criteria) this;
        }

        public Criteria andProjectPostIsNull() {
            addCriterion("project_post is null");
            return (Criteria) this;
        }

        public Criteria andProjectPostIsNotNull() {
            addCriterion("project_post is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPostEqualTo(String value) {
            addCriterion("project_post =", value, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostNotEqualTo(String value) {
            addCriterion("project_post <>", value, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostGreaterThan(String value) {
            addCriterion("project_post >", value, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostGreaterThanOrEqualTo(String value) {
            addCriterion("project_post >=", value, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostLessThan(String value) {
            addCriterion("project_post <", value, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostLessThanOrEqualTo(String value) {
            addCriterion("project_post <=", value, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostLike(String value) {
            addCriterion("project_post like", value, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostNotLike(String value) {
            addCriterion("project_post not like", value, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostIn(List<String> values) {
            addCriterion("project_post in", values, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostNotIn(List<String> values) {
            addCriterion("project_post not in", values, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostBetween(String value1, String value2) {
            addCriterion("project_post between", value1, value2, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectPostNotBetween(String value1, String value2) {
            addCriterion("project_post not between", value1, value2, "projectPost");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyIsNull() {
            addCriterion("project_company is null");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyIsNotNull() {
            addCriterion("project_company is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyEqualTo(String value) {
            addCriterion("project_company =", value, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNotEqualTo(String value) {
            addCriterion("project_company <>", value, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyGreaterThan(String value) {
            addCriterion("project_company >", value, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("project_company >=", value, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyLessThan(String value) {
            addCriterion("project_company <", value, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyLessThanOrEqualTo(String value) {
            addCriterion("project_company <=", value, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyLike(String value) {
            addCriterion("project_company like", value, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNotLike(String value) {
            addCriterion("project_company not like", value, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyIn(List<String> values) {
            addCriterion("project_company in", values, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNotIn(List<String> values) {
            addCriterion("project_company not in", values, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyBetween(String value1, String value2) {
            addCriterion("project_company between", value1, value2, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNotBetween(String value1, String value2) {
            addCriterion("project_company not between", value1, value2, "projectCompany");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIsNull() {
            addCriterion("project_info is null");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIsNotNull() {
            addCriterion("project_info is not null");
            return (Criteria) this;
        }

        public Criteria andProjectInfoEqualTo(String value) {
            addCriterion("project_info =", value, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoNotEqualTo(String value) {
            addCriterion("project_info <>", value, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoGreaterThan(String value) {
            addCriterion("project_info >", value, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoGreaterThanOrEqualTo(String value) {
            addCriterion("project_info >=", value, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoLessThan(String value) {
            addCriterion("project_info <", value, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoLessThanOrEqualTo(String value) {
            addCriterion("project_info <=", value, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoLike(String value) {
            addCriterion("project_info like", value, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoNotLike(String value) {
            addCriterion("project_info not like", value, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIn(List<String> values) {
            addCriterion("project_info in", values, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoNotIn(List<String> values) {
            addCriterion("project_info not in", values, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoBetween(String value1, String value2) {
            addCriterion("project_info between", value1, value2, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectInfoNotBetween(String value1, String value2) {
            addCriterion("project_info not between", value1, value2, "projectInfo");
            return (Criteria) this;
        }

        public Criteria andProjectDutyIsNull() {
            addCriterion("project_duty is null");
            return (Criteria) this;
        }

        public Criteria andProjectDutyIsNotNull() {
            addCriterion("project_duty is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDutyEqualTo(String value) {
            addCriterion("project_duty =", value, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyNotEqualTo(String value) {
            addCriterion("project_duty <>", value, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyGreaterThan(String value) {
            addCriterion("project_duty >", value, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyGreaterThanOrEqualTo(String value) {
            addCriterion("project_duty >=", value, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyLessThan(String value) {
            addCriterion("project_duty <", value, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyLessThanOrEqualTo(String value) {
            addCriterion("project_duty <=", value, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyLike(String value) {
            addCriterion("project_duty like", value, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyNotLike(String value) {
            addCriterion("project_duty not like", value, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyIn(List<String> values) {
            addCriterion("project_duty in", values, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyNotIn(List<String> values) {
            addCriterion("project_duty not in", values, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyBetween(String value1, String value2) {
            addCriterion("project_duty between", value1, value2, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectDutyNotBetween(String value1, String value2) {
            addCriterion("project_duty not between", value1, value2, "projectDuty");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceIsNull() {
            addCriterion("project_performance is null");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceIsNotNull() {
            addCriterion("project_performance is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceEqualTo(String value) {
            addCriterion("project_performance =", value, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceNotEqualTo(String value) {
            addCriterion("project_performance <>", value, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceGreaterThan(String value) {
            addCriterion("project_performance >", value, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("project_performance >=", value, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceLessThan(String value) {
            addCriterion("project_performance <", value, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceLessThanOrEqualTo(String value) {
            addCriterion("project_performance <=", value, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceLike(String value) {
            addCriterion("project_performance like", value, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceNotLike(String value) {
            addCriterion("project_performance not like", value, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceIn(List<String> values) {
            addCriterion("project_performance in", values, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceNotIn(List<String> values) {
            addCriterion("project_performance not in", values, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceBetween(String value1, String value2) {
            addCriterion("project_performance between", value1, value2, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectPerformanceNotBetween(String value1, String value2) {
            addCriterion("project_performance not between", value1, value2, "projectPerformance");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNull() {
            addCriterion("project_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNotNull() {
            addCriterion("project_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeEqualTo(String value) {
            addCriterion("project_start_time =", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotEqualTo(String value) {
            addCriterion("project_start_time <>", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThan(String value) {
            addCriterion("project_start_time >", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("project_start_time >=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThan(String value) {
            addCriterion("project_start_time <", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThanOrEqualTo(String value) {
            addCriterion("project_start_time <=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLike(String value) {
            addCriterion("project_start_time like", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotLike(String value) {
            addCriterion("project_start_time not like", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIn(List<String> values) {
            addCriterion("project_start_time in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotIn(List<String> values) {
            addCriterion("project_start_time not in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeBetween(String value1, String value2) {
            addCriterion("project_start_time between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotBetween(String value1, String value2) {
            addCriterion("project_start_time not between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNull() {
            addCriterion("project_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNotNull() {
            addCriterion("project_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeEqualTo(String value) {
            addCriterion("project_end_time =", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotEqualTo(String value) {
            addCriterion("project_end_time <>", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThan(String value) {
            addCriterion("project_end_time >", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("project_end_time >=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThan(String value) {
            addCriterion("project_end_time <", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanOrEqualTo(String value) {
            addCriterion("project_end_time <=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLike(String value) {
            addCriterion("project_end_time like", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotLike(String value) {
            addCriterion("project_end_time not like", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIn(List<String> values) {
            addCriterion("project_end_time in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotIn(List<String> values) {
            addCriterion("project_end_time not in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeBetween(String value1, String value2) {
            addCriterion("project_end_time between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotBetween(String value1, String value2) {
            addCriterion("project_end_time not between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameIsNull() {
            addCriterion("we_company_name is null");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameIsNotNull() {
            addCriterion("we_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameEqualTo(String value) {
            addCriterion("we_company_name =", value, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameNotEqualTo(String value) {
            addCriterion("we_company_name <>", value, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameGreaterThan(String value) {
            addCriterion("we_company_name >", value, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("we_company_name >=", value, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameLessThan(String value) {
            addCriterion("we_company_name <", value, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("we_company_name <=", value, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameLike(String value) {
            addCriterion("we_company_name like", value, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameNotLike(String value) {
            addCriterion("we_company_name not like", value, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameIn(List<String> values) {
            addCriterion("we_company_name in", values, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameNotIn(List<String> values) {
            addCriterion("we_company_name not in", values, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameBetween(String value1, String value2) {
            addCriterion("we_company_name between", value1, value2, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyNameNotBetween(String value1, String value2) {
            addCriterion("we_company_name not between", value1, value2, "weCompanyName");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryIsNull() {
            addCriterion("we_company_industry is null");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryIsNotNull() {
            addCriterion("we_company_industry is not null");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryEqualTo(String value) {
            addCriterion("we_company_industry =", value, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryNotEqualTo(String value) {
            addCriterion("we_company_industry <>", value, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryGreaterThan(String value) {
            addCriterion("we_company_industry >", value, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("we_company_industry >=", value, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryLessThan(String value) {
            addCriterion("we_company_industry <", value, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryLessThanOrEqualTo(String value) {
            addCriterion("we_company_industry <=", value, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryLike(String value) {
            addCriterion("we_company_industry like", value, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryNotLike(String value) {
            addCriterion("we_company_industry not like", value, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryIn(List<String> values) {
            addCriterion("we_company_industry in", values, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryNotIn(List<String> values) {
            addCriterion("we_company_industry not in", values, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryBetween(String value1, String value2) {
            addCriterion("we_company_industry between", value1, value2, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWeCompanyIndustryNotBetween(String value1, String value2) {
            addCriterion("we_company_industry not between", value1, value2, "weCompanyIndustry");
            return (Criteria) this;
        }

        public Criteria andWePostNameIsNull() {
            addCriterion("we_post_name is null");
            return (Criteria) this;
        }

        public Criteria andWePostNameIsNotNull() {
            addCriterion("we_post_name is not null");
            return (Criteria) this;
        }

        public Criteria andWePostNameEqualTo(String value) {
            addCriterion("we_post_name =", value, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameNotEqualTo(String value) {
            addCriterion("we_post_name <>", value, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameGreaterThan(String value) {
            addCriterion("we_post_name >", value, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameGreaterThanOrEqualTo(String value) {
            addCriterion("we_post_name >=", value, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameLessThan(String value) {
            addCriterion("we_post_name <", value, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameLessThanOrEqualTo(String value) {
            addCriterion("we_post_name <=", value, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameLike(String value) {
            addCriterion("we_post_name like", value, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameNotLike(String value) {
            addCriterion("we_post_name not like", value, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameIn(List<String> values) {
            addCriterion("we_post_name in", values, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameNotIn(List<String> values) {
            addCriterion("we_post_name not in", values, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameBetween(String value1, String value2) {
            addCriterion("we_post_name between", value1, value2, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWePostNameNotBetween(String value1, String value2) {
            addCriterion("we_post_name not between", value1, value2, "wePostName");
            return (Criteria) this;
        }

        public Criteria andWeAddressIsNull() {
            addCriterion("we_address is null");
            return (Criteria) this;
        }

        public Criteria andWeAddressIsNotNull() {
            addCriterion("we_address is not null");
            return (Criteria) this;
        }

        public Criteria andWeAddressEqualTo(String value) {
            addCriterion("we_address =", value, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressNotEqualTo(String value) {
            addCriterion("we_address <>", value, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressGreaterThan(String value) {
            addCriterion("we_address >", value, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("we_address >=", value, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressLessThan(String value) {
            addCriterion("we_address <", value, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressLessThanOrEqualTo(String value) {
            addCriterion("we_address <=", value, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressLike(String value) {
            addCriterion("we_address like", value, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressNotLike(String value) {
            addCriterion("we_address not like", value, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressIn(List<String> values) {
            addCriterion("we_address in", values, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressNotIn(List<String> values) {
            addCriterion("we_address not in", values, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressBetween(String value1, String value2) {
            addCriterion("we_address between", value1, value2, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeAddressNotBetween(String value1, String value2) {
            addCriterion("we_address not between", value1, value2, "weAddress");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeIsNull() {
            addCriterion("we_start_time is null");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeIsNotNull() {
            addCriterion("we_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeEqualTo(String value) {
            addCriterion("we_start_time =", value, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeNotEqualTo(String value) {
            addCriterion("we_start_time <>", value, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeGreaterThan(String value) {
            addCriterion("we_start_time >", value, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("we_start_time >=", value, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeLessThan(String value) {
            addCriterion("we_start_time <", value, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeLessThanOrEqualTo(String value) {
            addCriterion("we_start_time <=", value, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeLike(String value) {
            addCriterion("we_start_time like", value, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeNotLike(String value) {
            addCriterion("we_start_time not like", value, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeIn(List<String> values) {
            addCriterion("we_start_time in", values, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeNotIn(List<String> values) {
            addCriterion("we_start_time not in", values, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeBetween(String value1, String value2) {
            addCriterion("we_start_time between", value1, value2, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeStartTimeNotBetween(String value1, String value2) {
            addCriterion("we_start_time not between", value1, value2, "weStartTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeIsNull() {
            addCriterion("we_end_time is null");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeIsNotNull() {
            addCriterion("we_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeEqualTo(String value) {
            addCriterion("we_end_time =", value, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeNotEqualTo(String value) {
            addCriterion("we_end_time <>", value, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeGreaterThan(String value) {
            addCriterion("we_end_time >", value, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("we_end_time >=", value, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeLessThan(String value) {
            addCriterion("we_end_time <", value, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeLessThanOrEqualTo(String value) {
            addCriterion("we_end_time <=", value, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeLike(String value) {
            addCriterion("we_end_time like", value, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeNotLike(String value) {
            addCriterion("we_end_time not like", value, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeIn(List<String> values) {
            addCriterion("we_end_time in", values, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeNotIn(List<String> values) {
            addCriterion("we_end_time not in", values, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeBetween(String value1, String value2) {
            addCriterion("we_end_time between", value1, value2, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeEndTimeNotBetween(String value1, String value2) {
            addCriterion("we_end_time not between", value1, value2, "weEndTime");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceIsNull() {
            addCriterion("we_duty_performance is null");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceIsNotNull() {
            addCriterion("we_duty_performance is not null");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceEqualTo(String value) {
            addCriterion("we_duty_performance =", value, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceNotEqualTo(String value) {
            addCriterion("we_duty_performance <>", value, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceGreaterThan(String value) {
            addCriterion("we_duty_performance >", value, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("we_duty_performance >=", value, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceLessThan(String value) {
            addCriterion("we_duty_performance <", value, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceLessThanOrEqualTo(String value) {
            addCriterion("we_duty_performance <=", value, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceLike(String value) {
            addCriterion("we_duty_performance like", value, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceNotLike(String value) {
            addCriterion("we_duty_performance not like", value, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceIn(List<String> values) {
            addCriterion("we_duty_performance in", values, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceNotIn(List<String> values) {
            addCriterion("we_duty_performance not in", values, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceBetween(String value1, String value2) {
            addCriterion("we_duty_performance between", value1, value2, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andWeDutyPerformanceNotBetween(String value1, String value2) {
            addCriterion("we_duty_performance not between", value1, value2, "weDutyPerformance");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNull() {
            addCriterion("user_style is null");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNotNull() {
            addCriterion("user_style is not null");
            return (Criteria) this;
        }

        public Criteria andUserStyleEqualTo(String value) {
            addCriterion("user_style =", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotEqualTo(String value) {
            addCriterion("user_style <>", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThan(String value) {
            addCriterion("user_style >", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThanOrEqualTo(String value) {
            addCriterion("user_style >=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThan(String value) {
            addCriterion("user_style <", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThanOrEqualTo(String value) {
            addCriterion("user_style <=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLike(String value) {
            addCriterion("user_style like", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotLike(String value) {
            addCriterion("user_style not like", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleIn(List<String> values) {
            addCriterion("user_style in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotIn(List<String> values) {
            addCriterion("user_style not in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleBetween(String value1, String value2) {
            addCriterion("user_style between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotBetween(String value1, String value2) {
            addCriterion("user_style not between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("image_path is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("image_path is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("image_path =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("image_path <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("image_path >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("image_path >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("image_path <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("image_path <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("image_path like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("image_path not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("image_path in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("image_path not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("image_path between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("image_path not between", value1, value2, "imagePath");
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