package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class PostReleaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostReleaseExample() {
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

        public Criteria andCUserNameIsNull() {
            addCriterion("c_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCUserNameIsNotNull() {
            addCriterion("c_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCUserNameEqualTo(String value) {
            addCriterion("c_user_name =", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotEqualTo(String value) {
            addCriterion("c_user_name <>", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameGreaterThan(String value) {
            addCriterion("c_user_name >", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_name >=", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLessThan(String value) {
            addCriterion("c_user_name <", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLessThanOrEqualTo(String value) {
            addCriterion("c_user_name <=", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameLike(String value) {
            addCriterion("c_user_name like", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotLike(String value) {
            addCriterion("c_user_name not like", value, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameIn(List<String> values) {
            addCriterion("c_user_name in", values, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotIn(List<String> values) {
            addCriterion("c_user_name not in", values, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameBetween(String value1, String value2) {
            addCriterion("c_user_name between", value1, value2, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCUserNameNotBetween(String value1, String value2) {
            addCriterion("c_user_name not between", value1, value2, "cUserName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameIsNull() {
            addCriterion("c_company_name is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameIsNotNull() {
            addCriterion("c_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameEqualTo(String value) {
            addCriterion("c_company_name =", value, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameNotEqualTo(String value) {
            addCriterion("c_company_name <>", value, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameGreaterThan(String value) {
            addCriterion("c_company_name >", value, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_name >=", value, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameLessThan(String value) {
            addCriterion("c_company_name <", value, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("c_company_name <=", value, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameLike(String value) {
            addCriterion("c_company_name like", value, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameNotLike(String value) {
            addCriterion("c_company_name not like", value, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameIn(List<String> values) {
            addCriterion("c_company_name in", values, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameNotIn(List<String> values) {
            addCriterion("c_company_name not in", values, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameBetween(String value1, String value2) {
            addCriterion("c_company_name between", value1, value2, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andCCompanyNameNotBetween(String value1, String value2) {
            addCriterion("c_company_name not between", value1, value2, "cCompanyName");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNumberIsNull() {
            addCriterion("p_number is null");
            return (Criteria) this;
        }

        public Criteria andPNumberIsNotNull() {
            addCriterion("p_number is not null");
            return (Criteria) this;
        }

        public Criteria andPNumberEqualTo(String value) {
            addCriterion("p_number =", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotEqualTo(String value) {
            addCriterion("p_number <>", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberGreaterThan(String value) {
            addCriterion("p_number >", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberGreaterThanOrEqualTo(String value) {
            addCriterion("p_number >=", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberLessThan(String value) {
            addCriterion("p_number <", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberLessThanOrEqualTo(String value) {
            addCriterion("p_number <=", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberLike(String value) {
            addCriterion("p_number like", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotLike(String value) {
            addCriterion("p_number not like", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberIn(List<String> values) {
            addCriterion("p_number in", values, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotIn(List<String> values) {
            addCriterion("p_number not in", values, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberBetween(String value1, String value2) {
            addCriterion("p_number between", value1, value2, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotBetween(String value1, String value2) {
            addCriterion("p_number not between", value1, value2, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPSizeIsNull() {
            addCriterion("p_size is null");
            return (Criteria) this;
        }

        public Criteria andPSizeIsNotNull() {
            addCriterion("p_size is not null");
            return (Criteria) this;
        }

        public Criteria andPSizeEqualTo(String value) {
            addCriterion("p_size =", value, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeNotEqualTo(String value) {
            addCriterion("p_size <>", value, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeGreaterThan(String value) {
            addCriterion("p_size >", value, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeGreaterThanOrEqualTo(String value) {
            addCriterion("p_size >=", value, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeLessThan(String value) {
            addCriterion("p_size <", value, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeLessThanOrEqualTo(String value) {
            addCriterion("p_size <=", value, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeLike(String value) {
            addCriterion("p_size like", value, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeNotLike(String value) {
            addCriterion("p_size not like", value, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeIn(List<String> values) {
            addCriterion("p_size in", values, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeNotIn(List<String> values) {
            addCriterion("p_size not in", values, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeBetween(String value1, String value2) {
            addCriterion("p_size between", value1, value2, "pSize");
            return (Criteria) this;
        }

        public Criteria andPSizeNotBetween(String value1, String value2) {
            addCriterion("p_size not between", value1, value2, "pSize");
            return (Criteria) this;
        }

        public Criteria andPCityIsNull() {
            addCriterion("p_city is null");
            return (Criteria) this;
        }

        public Criteria andPCityIsNotNull() {
            addCriterion("p_city is not null");
            return (Criteria) this;
        }

        public Criteria andPCityEqualTo(String value) {
            addCriterion("p_city =", value, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityNotEqualTo(String value) {
            addCriterion("p_city <>", value, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityGreaterThan(String value) {
            addCriterion("p_city >", value, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityGreaterThanOrEqualTo(String value) {
            addCriterion("p_city >=", value, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityLessThan(String value) {
            addCriterion("p_city <", value, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityLessThanOrEqualTo(String value) {
            addCriterion("p_city <=", value, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityLike(String value) {
            addCriterion("p_city like", value, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityNotLike(String value) {
            addCriterion("p_city not like", value, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityIn(List<String> values) {
            addCriterion("p_city in", values, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityNotIn(List<String> values) {
            addCriterion("p_city not in", values, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityBetween(String value1, String value2) {
            addCriterion("p_city between", value1, value2, "pCity");
            return (Criteria) this;
        }

        public Criteria andPCityNotBetween(String value1, String value2) {
            addCriterion("p_city not between", value1, value2, "pCity");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNull() {
            addCriterion("p_address is null");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNotNull() {
            addCriterion("p_address is not null");
            return (Criteria) this;
        }

        public Criteria andPAddressEqualTo(String value) {
            addCriterion("p_address =", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotEqualTo(String value) {
            addCriterion("p_address <>", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThan(String value) {
            addCriterion("p_address >", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThanOrEqualTo(String value) {
            addCriterion("p_address >=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThan(String value) {
            addCriterion("p_address <", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThanOrEqualTo(String value) {
            addCriterion("p_address <=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLike(String value) {
            addCriterion("p_address like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotLike(String value) {
            addCriterion("p_address not like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressIn(List<String> values) {
            addCriterion("p_address in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotIn(List<String> values) {
            addCriterion("p_address not in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressBetween(String value1, String value2) {
            addCriterion("p_address between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotBetween(String value1, String value2) {
            addCriterion("p_address not between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPTypeOneIsNull() {
            addCriterion("p_type_one is null");
            return (Criteria) this;
        }

        public Criteria andPTypeOneIsNotNull() {
            addCriterion("p_type_one is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeOneEqualTo(String value) {
            addCriterion("p_type_one =", value, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneNotEqualTo(String value) {
            addCriterion("p_type_one <>", value, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneGreaterThan(String value) {
            addCriterion("p_type_one >", value, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneGreaterThanOrEqualTo(String value) {
            addCriterion("p_type_one >=", value, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneLessThan(String value) {
            addCriterion("p_type_one <", value, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneLessThanOrEqualTo(String value) {
            addCriterion("p_type_one <=", value, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneLike(String value) {
            addCriterion("p_type_one like", value, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneNotLike(String value) {
            addCriterion("p_type_one not like", value, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneIn(List<String> values) {
            addCriterion("p_type_one in", values, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneNotIn(List<String> values) {
            addCriterion("p_type_one not in", values, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneBetween(String value1, String value2) {
            addCriterion("p_type_one between", value1, value2, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTypeOneNotBetween(String value1, String value2) {
            addCriterion("p_type_one not between", value1, value2, "pTypeOne");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoIsNull() {
            addCriterion("p_tyoe_two is null");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoIsNotNull() {
            addCriterion("p_tyoe_two is not null");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoEqualTo(String value) {
            addCriterion("p_tyoe_two =", value, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoNotEqualTo(String value) {
            addCriterion("p_tyoe_two <>", value, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoGreaterThan(String value) {
            addCriterion("p_tyoe_two >", value, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoGreaterThanOrEqualTo(String value) {
            addCriterion("p_tyoe_two >=", value, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoLessThan(String value) {
            addCriterion("p_tyoe_two <", value, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoLessThanOrEqualTo(String value) {
            addCriterion("p_tyoe_two <=", value, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoLike(String value) {
            addCriterion("p_tyoe_two like", value, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoNotLike(String value) {
            addCriterion("p_tyoe_two not like", value, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoIn(List<String> values) {
            addCriterion("p_tyoe_two in", values, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoNotIn(List<String> values) {
            addCriterion("p_tyoe_two not in", values, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoBetween(String value1, String value2) {
            addCriterion("p_tyoe_two between", value1, value2, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPTyoeTwoNotBetween(String value1, String value2) {
            addCriterion("p_tyoe_two not between", value1, value2, "pTyoeTwo");
            return (Criteria) this;
        }

        public Criteria andPServiceLongIsNull() {
            addCriterion("p_service_long is null");
            return (Criteria) this;
        }

        public Criteria andPServiceLongIsNotNull() {
            addCriterion("p_service_long is not null");
            return (Criteria) this;
        }

        public Criteria andPServiceLongEqualTo(String value) {
            addCriterion("p_service_long =", value, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongNotEqualTo(String value) {
            addCriterion("p_service_long <>", value, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongGreaterThan(String value) {
            addCriterion("p_service_long >", value, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongGreaterThanOrEqualTo(String value) {
            addCriterion("p_service_long >=", value, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongLessThan(String value) {
            addCriterion("p_service_long <", value, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongLessThanOrEqualTo(String value) {
            addCriterion("p_service_long <=", value, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongLike(String value) {
            addCriterion("p_service_long like", value, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongNotLike(String value) {
            addCriterion("p_service_long not like", value, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongIn(List<String> values) {
            addCriterion("p_service_long in", values, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongNotIn(List<String> values) {
            addCriterion("p_service_long not in", values, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongBetween(String value1, String value2) {
            addCriterion("p_service_long between", value1, value2, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPServiceLongNotBetween(String value1, String value2) {
            addCriterion("p_service_long not between", value1, value2, "pServiceLong");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryIsNull() {
            addCriterion("p_min_salary is null");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryIsNotNull() {
            addCriterion("p_min_salary is not null");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryEqualTo(String value) {
            addCriterion("p_min_salary =", value, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryNotEqualTo(String value) {
            addCriterion("p_min_salary <>", value, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryGreaterThan(String value) {
            addCriterion("p_min_salary >", value, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("p_min_salary >=", value, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryLessThan(String value) {
            addCriterion("p_min_salary <", value, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryLessThanOrEqualTo(String value) {
            addCriterion("p_min_salary <=", value, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryLike(String value) {
            addCriterion("p_min_salary like", value, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryNotLike(String value) {
            addCriterion("p_min_salary not like", value, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryIn(List<String> values) {
            addCriterion("p_min_salary in", values, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryNotIn(List<String> values) {
            addCriterion("p_min_salary not in", values, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryBetween(String value1, String value2) {
            addCriterion("p_min_salary between", value1, value2, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPMinSalaryNotBetween(String value1, String value2) {
            addCriterion("p_min_salary not between", value1, value2, "pMinSalary");
            return (Criteria) this;
        }

        public Criteria andPEducationIsNull() {
            addCriterion("p_education is null");
            return (Criteria) this;
        }

        public Criteria andPEducationIsNotNull() {
            addCriterion("p_education is not null");
            return (Criteria) this;
        }

        public Criteria andPEducationEqualTo(String value) {
            addCriterion("p_education =", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotEqualTo(String value) {
            addCriterion("p_education <>", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationGreaterThan(String value) {
            addCriterion("p_education >", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationGreaterThanOrEqualTo(String value) {
            addCriterion("p_education >=", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationLessThan(String value) {
            addCriterion("p_education <", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationLessThanOrEqualTo(String value) {
            addCriterion("p_education <=", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationLike(String value) {
            addCriterion("p_education like", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotLike(String value) {
            addCriterion("p_education not like", value, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationIn(List<String> values) {
            addCriterion("p_education in", values, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotIn(List<String> values) {
            addCriterion("p_education not in", values, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationBetween(String value1, String value2) {
            addCriterion("p_education between", value1, value2, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPEducationNotBetween(String value1, String value2) {
            addCriterion("p_education not between", value1, value2, "pEducation");
            return (Criteria) this;
        }

        public Criteria andPAgeIsNull() {
            addCriterion("p_age is null");
            return (Criteria) this;
        }

        public Criteria andPAgeIsNotNull() {
            addCriterion("p_age is not null");
            return (Criteria) this;
        }

        public Criteria andPAgeEqualTo(String value) {
            addCriterion("p_age =", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotEqualTo(String value) {
            addCriterion("p_age <>", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThan(String value) {
            addCriterion("p_age >", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThanOrEqualTo(String value) {
            addCriterion("p_age >=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThan(String value) {
            addCriterion("p_age <", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThanOrEqualTo(String value) {
            addCriterion("p_age <=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLike(String value) {
            addCriterion("p_age like", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotLike(String value) {
            addCriterion("p_age not like", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeIn(List<String> values) {
            addCriterion("p_age in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotIn(List<String> values) {
            addCriterion("p_age not in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeBetween(String value1, String value2) {
            addCriterion("p_age between", value1, value2, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotBetween(String value1, String value2) {
            addCriterion("p_age not between", value1, value2, "pAge");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneIsNull() {
            addCriterion("p_language_one is null");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneIsNotNull() {
            addCriterion("p_language_one is not null");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneEqualTo(String value) {
            addCriterion("p_language_one =", value, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneNotEqualTo(String value) {
            addCriterion("p_language_one <>", value, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneGreaterThan(String value) {
            addCriterion("p_language_one >", value, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneGreaterThanOrEqualTo(String value) {
            addCriterion("p_language_one >=", value, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneLessThan(String value) {
            addCriterion("p_language_one <", value, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneLessThanOrEqualTo(String value) {
            addCriterion("p_language_one <=", value, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneLike(String value) {
            addCriterion("p_language_one like", value, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneNotLike(String value) {
            addCriterion("p_language_one not like", value, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneIn(List<String> values) {
            addCriterion("p_language_one in", values, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneNotIn(List<String> values) {
            addCriterion("p_language_one not in", values, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneBetween(String value1, String value2) {
            addCriterion("p_language_one between", value1, value2, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageOneNotBetween(String value1, String value2) {
            addCriterion("p_language_one not between", value1, value2, "pLanguageOne");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoIsNull() {
            addCriterion("p_language_two is null");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoIsNotNull() {
            addCriterion("p_language_two is not null");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoEqualTo(String value) {
            addCriterion("p_language_two =", value, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoNotEqualTo(String value) {
            addCriterion("p_language_two <>", value, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoGreaterThan(String value) {
            addCriterion("p_language_two >", value, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoGreaterThanOrEqualTo(String value) {
            addCriterion("p_language_two >=", value, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoLessThan(String value) {
            addCriterion("p_language_two <", value, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoLessThanOrEqualTo(String value) {
            addCriterion("p_language_two <=", value, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoLike(String value) {
            addCriterion("p_language_two like", value, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoNotLike(String value) {
            addCriterion("p_language_two not like", value, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoIn(List<String> values) {
            addCriterion("p_language_two in", values, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoNotIn(List<String> values) {
            addCriterion("p_language_two not in", values, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoBetween(String value1, String value2) {
            addCriterion("p_language_two between", value1, value2, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPLanguageTwoNotBetween(String value1, String value2) {
            addCriterion("p_language_two not between", value1, value2, "pLanguageTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorOneIsNull() {
            addCriterion("p_major_one is null");
            return (Criteria) this;
        }

        public Criteria andPMajorOneIsNotNull() {
            addCriterion("p_major_one is not null");
            return (Criteria) this;
        }

        public Criteria andPMajorOneEqualTo(String value) {
            addCriterion("p_major_one =", value, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneNotEqualTo(String value) {
            addCriterion("p_major_one <>", value, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneGreaterThan(String value) {
            addCriterion("p_major_one >", value, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneGreaterThanOrEqualTo(String value) {
            addCriterion("p_major_one >=", value, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneLessThan(String value) {
            addCriterion("p_major_one <", value, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneLessThanOrEqualTo(String value) {
            addCriterion("p_major_one <=", value, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneLike(String value) {
            addCriterion("p_major_one like", value, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneNotLike(String value) {
            addCriterion("p_major_one not like", value, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneIn(List<String> values) {
            addCriterion("p_major_one in", values, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneNotIn(List<String> values) {
            addCriterion("p_major_one not in", values, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneBetween(String value1, String value2) {
            addCriterion("p_major_one between", value1, value2, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorOneNotBetween(String value1, String value2) {
            addCriterion("p_major_one not between", value1, value2, "pMajorOne");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoIsNull() {
            addCriterion("p_major_two is null");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoIsNotNull() {
            addCriterion("p_major_two is not null");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoEqualTo(String value) {
            addCriterion("p_major_two =", value, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoNotEqualTo(String value) {
            addCriterion("p_major_two <>", value, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoGreaterThan(String value) {
            addCriterion("p_major_two >", value, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoGreaterThanOrEqualTo(String value) {
            addCriterion("p_major_two >=", value, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoLessThan(String value) {
            addCriterion("p_major_two <", value, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoLessThanOrEqualTo(String value) {
            addCriterion("p_major_two <=", value, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoLike(String value) {
            addCriterion("p_major_two like", value, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoNotLike(String value) {
            addCriterion("p_major_two not like", value, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoIn(List<String> values) {
            addCriterion("p_major_two in", values, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoNotIn(List<String> values) {
            addCriterion("p_major_two not in", values, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoBetween(String value1, String value2) {
            addCriterion("p_major_two between", value1, value2, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPMajorTwoNotBetween(String value1, String value2) {
            addCriterion("p_major_two not between", value1, value2, "pMajorTwo");
            return (Criteria) this;
        }

        public Criteria andPWelfareIsNull() {
            addCriterion("p_welfare is null");
            return (Criteria) this;
        }

        public Criteria andPWelfareIsNotNull() {
            addCriterion("p_welfare is not null");
            return (Criteria) this;
        }

        public Criteria andPWelfareEqualTo(String value) {
            addCriterion("p_welfare =", value, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareNotEqualTo(String value) {
            addCriterion("p_welfare <>", value, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareGreaterThan(String value) {
            addCriterion("p_welfare >", value, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareGreaterThanOrEqualTo(String value) {
            addCriterion("p_welfare >=", value, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareLessThan(String value) {
            addCriterion("p_welfare <", value, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareLessThanOrEqualTo(String value) {
            addCriterion("p_welfare <=", value, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareLike(String value) {
            addCriterion("p_welfare like", value, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareNotLike(String value) {
            addCriterion("p_welfare not like", value, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareIn(List<String> values) {
            addCriterion("p_welfare in", values, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareNotIn(List<String> values) {
            addCriterion("p_welfare not in", values, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareBetween(String value1, String value2) {
            addCriterion("p_welfare between", value1, value2, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPWelfareNotBetween(String value1, String value2) {
            addCriterion("p_welfare not between", value1, value2, "pWelfare");
            return (Criteria) this;
        }

        public Criteria andPKeyworldIsNull() {
            addCriterion("p_keyworld is null");
            return (Criteria) this;
        }

        public Criteria andPKeyworldIsNotNull() {
            addCriterion("p_keyworld is not null");
            return (Criteria) this;
        }

        public Criteria andPKeyworldEqualTo(String value) {
            addCriterion("p_keyworld =", value, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldNotEqualTo(String value) {
            addCriterion("p_keyworld <>", value, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldGreaterThan(String value) {
            addCriterion("p_keyworld >", value, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldGreaterThanOrEqualTo(String value) {
            addCriterion("p_keyworld >=", value, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldLessThan(String value) {
            addCriterion("p_keyworld <", value, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldLessThanOrEqualTo(String value) {
            addCriterion("p_keyworld <=", value, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldLike(String value) {
            addCriterion("p_keyworld like", value, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldNotLike(String value) {
            addCriterion("p_keyworld not like", value, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldIn(List<String> values) {
            addCriterion("p_keyworld in", values, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldNotIn(List<String> values) {
            addCriterion("p_keyworld not in", values, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldBetween(String value1, String value2) {
            addCriterion("p_keyworld between", value1, value2, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPKeyworldNotBetween(String value1, String value2) {
            addCriterion("p_keyworld not between", value1, value2, "pKeyworld");
            return (Criteria) this;
        }

        public Criteria andPStartTimeIsNull() {
            addCriterion("p_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPStartTimeIsNotNull() {
            addCriterion("p_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPStartTimeEqualTo(String value) {
            addCriterion("p_start_time =", value, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeNotEqualTo(String value) {
            addCriterion("p_start_time <>", value, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeGreaterThan(String value) {
            addCriterion("p_start_time >", value, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("p_start_time >=", value, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeLessThan(String value) {
            addCriterion("p_start_time <", value, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeLessThanOrEqualTo(String value) {
            addCriterion("p_start_time <=", value, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeLike(String value) {
            addCriterion("p_start_time like", value, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeNotLike(String value) {
            addCriterion("p_start_time not like", value, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeIn(List<String> values) {
            addCriterion("p_start_time in", values, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeNotIn(List<String> values) {
            addCriterion("p_start_time not in", values, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeBetween(String value1, String value2) {
            addCriterion("p_start_time between", value1, value2, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPStartTimeNotBetween(String value1, String value2) {
            addCriterion("p_start_time not between", value1, value2, "pStartTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeIsNull() {
            addCriterion("p_refresh_time is null");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeIsNotNull() {
            addCriterion("p_refresh_time is not null");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeEqualTo(String value) {
            addCriterion("p_refresh_time =", value, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeNotEqualTo(String value) {
            addCriterion("p_refresh_time <>", value, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeGreaterThan(String value) {
            addCriterion("p_refresh_time >", value, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeGreaterThanOrEqualTo(String value) {
            addCriterion("p_refresh_time >=", value, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeLessThan(String value) {
            addCriterion("p_refresh_time <", value, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeLessThanOrEqualTo(String value) {
            addCriterion("p_refresh_time <=", value, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeLike(String value) {
            addCriterion("p_refresh_time like", value, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeNotLike(String value) {
            addCriterion("p_refresh_time not like", value, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeIn(List<String> values) {
            addCriterion("p_refresh_time in", values, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeNotIn(List<String> values) {
            addCriterion("p_refresh_time not in", values, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeBetween(String value1, String value2) {
            addCriterion("p_refresh_time between", value1, value2, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPRefreshTimeNotBetween(String value1, String value2) {
            addCriterion("p_refresh_time not between", value1, value2, "pRefreshTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeIsNull() {
            addCriterion("p_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPEndTimeIsNotNull() {
            addCriterion("p_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPEndTimeEqualTo(String value) {
            addCriterion("p_end_time =", value, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeNotEqualTo(String value) {
            addCriterion("p_end_time <>", value, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeGreaterThan(String value) {
            addCriterion("p_end_time >", value, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("p_end_time >=", value, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeLessThan(String value) {
            addCriterion("p_end_time <", value, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeLessThanOrEqualTo(String value) {
            addCriterion("p_end_time <=", value, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeLike(String value) {
            addCriterion("p_end_time like", value, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeNotLike(String value) {
            addCriterion("p_end_time not like", value, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeIn(List<String> values) {
            addCriterion("p_end_time in", values, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeNotIn(List<String> values) {
            addCriterion("p_end_time not in", values, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeBetween(String value1, String value2) {
            addCriterion("p_end_time between", value1, value2, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andPEndTimeNotBetween(String value1, String value2) {
            addCriterion("p_end_time not between", value1, value2, "pEndTime");
            return (Criteria) this;
        }

        public Criteria andClicksIsNull() {
            addCriterion("clicks is null");
            return (Criteria) this;
        }

        public Criteria andClicksIsNotNull() {
            addCriterion("clicks is not null");
            return (Criteria) this;
        }

        public Criteria andClicksEqualTo(Integer value) {
            addCriterion("clicks =", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotEqualTo(Integer value) {
            addCriterion("clicks <>", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThan(Integer value) {
            addCriterion("clicks >", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicks >=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThan(Integer value) {
            addCriterion("clicks <", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThanOrEqualTo(Integer value) {
            addCriterion("clicks <=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksIn(List<Integer> values) {
            addCriterion("clicks in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotIn(List<Integer> values) {
            addCriterion("clicks not in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksBetween(Integer value1, Integer value2) {
            addCriterion("clicks between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotBetween(Integer value1, Integer value2) {
            addCriterion("clicks not between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryIsNull() {
            addCriterion("p_max_salary is null");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryIsNotNull() {
            addCriterion("p_max_salary is not null");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryEqualTo(String value) {
            addCriterion("p_max_salary =", value, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryNotEqualTo(String value) {
            addCriterion("p_max_salary <>", value, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryGreaterThan(String value) {
            addCriterion("p_max_salary >", value, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("p_max_salary >=", value, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryLessThan(String value) {
            addCriterion("p_max_salary <", value, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryLessThanOrEqualTo(String value) {
            addCriterion("p_max_salary <=", value, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryLike(String value) {
            addCriterion("p_max_salary like", value, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryNotLike(String value) {
            addCriterion("p_max_salary not like", value, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryIn(List<String> values) {
            addCriterion("p_max_salary in", values, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryNotIn(List<String> values) {
            addCriterion("p_max_salary not in", values, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryBetween(String value1, String value2) {
            addCriterion("p_max_salary between", value1, value2, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andPMaxSalaryNotBetween(String value1, String value2) {
            addCriterion("p_max_salary not between", value1, value2, "pMaxSalary");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andPProvinceIsNull() {
            addCriterion("p_province is null");
            return (Criteria) this;
        }

        public Criteria andPProvinceIsNotNull() {
            addCriterion("p_province is not null");
            return (Criteria) this;
        }

        public Criteria andPProvinceEqualTo(String value) {
            addCriterion("p_province =", value, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceNotEqualTo(String value) {
            addCriterion("p_province <>", value, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceGreaterThan(String value) {
            addCriterion("p_province >", value, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("p_province >=", value, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceLessThan(String value) {
            addCriterion("p_province <", value, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceLessThanOrEqualTo(String value) {
            addCriterion("p_province <=", value, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceLike(String value) {
            addCriterion("p_province like", value, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceNotLike(String value) {
            addCriterion("p_province not like", value, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceIn(List<String> values) {
            addCriterion("p_province in", values, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceNotIn(List<String> values) {
            addCriterion("p_province not in", values, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceBetween(String value1, String value2) {
            addCriterion("p_province between", value1, value2, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPProvinceNotBetween(String value1, String value2) {
            addCriterion("p_province not between", value1, value2, "pProvince");
            return (Criteria) this;
        }

        public Criteria andPAreaIsNull() {
            addCriterion("p_area is null");
            return (Criteria) this;
        }

        public Criteria andPAreaIsNotNull() {
            addCriterion("p_area is not null");
            return (Criteria) this;
        }

        public Criteria andPAreaEqualTo(String value) {
            addCriterion("p_area =", value, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaNotEqualTo(String value) {
            addCriterion("p_area <>", value, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaGreaterThan(String value) {
            addCriterion("p_area >", value, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaGreaterThanOrEqualTo(String value) {
            addCriterion("p_area >=", value, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaLessThan(String value) {
            addCriterion("p_area <", value, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaLessThanOrEqualTo(String value) {
            addCriterion("p_area <=", value, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaLike(String value) {
            addCriterion("p_area like", value, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaNotLike(String value) {
            addCriterion("p_area not like", value, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaIn(List<String> values) {
            addCriterion("p_area in", values, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaNotIn(List<String> values) {
            addCriterion("p_area not in", values, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaBetween(String value1, String value2) {
            addCriterion("p_area between", value1, value2, "pArea");
            return (Criteria) this;
        }

        public Criteria andPAreaNotBetween(String value1, String value2) {
            addCriterion("p_area not between", value1, value2, "pArea");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityIsNull() {
            addCriterion("p_responsibility is null");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityIsNotNull() {
            addCriterion("p_responsibility is not null");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityEqualTo(String value) {
            addCriterion("p_responsibility =", value, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityNotEqualTo(String value) {
            addCriterion("p_responsibility <>", value, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityGreaterThan(String value) {
            addCriterion("p_responsibility >", value, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("p_responsibility >=", value, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityLessThan(String value) {
            addCriterion("p_responsibility <", value, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityLessThanOrEqualTo(String value) {
            addCriterion("p_responsibility <=", value, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityLike(String value) {
            addCriterion("p_responsibility like", value, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityNotLike(String value) {
            addCriterion("p_responsibility not like", value, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityIn(List<String> values) {
            addCriterion("p_responsibility in", values, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityNotIn(List<String> values) {
            addCriterion("p_responsibility not in", values, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityBetween(String value1, String value2) {
            addCriterion("p_responsibility between", value1, value2, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPResponsibilityNotBetween(String value1, String value2) {
            addCriterion("p_responsibility not between", value1, value2, "pResponsibility");
            return (Criteria) this;
        }

        public Criteria andPQualificationIsNull() {
            addCriterion("p_qualification is null");
            return (Criteria) this;
        }

        public Criteria andPQualificationIsNotNull() {
            addCriterion("p_qualification is not null");
            return (Criteria) this;
        }

        public Criteria andPQualificationEqualTo(String value) {
            addCriterion("p_qualification =", value, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationNotEqualTo(String value) {
            addCriterion("p_qualification <>", value, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationGreaterThan(String value) {
            addCriterion("p_qualification >", value, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("p_qualification >=", value, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationLessThan(String value) {
            addCriterion("p_qualification <", value, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationLessThanOrEqualTo(String value) {
            addCriterion("p_qualification <=", value, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationLike(String value) {
            addCriterion("p_qualification like", value, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationNotLike(String value) {
            addCriterion("p_qualification not like", value, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationIn(List<String> values) {
            addCriterion("p_qualification in", values, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationNotIn(List<String> values) {
            addCriterion("p_qualification not in", values, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationBetween(String value1, String value2) {
            addCriterion("p_qualification between", value1, value2, "pQualification");
            return (Criteria) this;
        }

        public Criteria andPQualificationNotBetween(String value1, String value2) {
            addCriterion("p_qualification not between", value1, value2, "pQualification");
            return (Criteria) this;
        }

        public Criteria andFindNameIsNull() {
            addCriterion("find_name is null");
            return (Criteria) this;
        }

        public Criteria andFindNameIsNotNull() {
            addCriterion("find_name is not null");
            return (Criteria) this;
        }

        public Criteria andFindNameEqualTo(String value) {
            addCriterion("find_name =", value, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameNotEqualTo(String value) {
            addCriterion("find_name <>", value, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameGreaterThan(String value) {
            addCriterion("find_name >", value, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameGreaterThanOrEqualTo(String value) {
            addCriterion("find_name >=", value, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameLessThan(String value) {
            addCriterion("find_name <", value, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameLessThanOrEqualTo(String value) {
            addCriterion("find_name <=", value, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameLike(String value) {
            addCriterion("find_name like", value, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameNotLike(String value) {
            addCriterion("find_name not like", value, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameIn(List<String> values) {
            addCriterion("find_name in", values, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameNotIn(List<String> values) {
            addCriterion("find_name not in", values, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameBetween(String value1, String value2) {
            addCriterion("find_name between", value1, value2, "findName");
            return (Criteria) this;
        }

        public Criteria andFindNameNotBetween(String value1, String value2) {
            addCriterion("find_name not between", value1, value2, "findName");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdIsNull() {
            addCriterion("get_resume_id is null");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdIsNotNull() {
            addCriterion("get_resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdEqualTo(Integer value) {
            addCriterion("get_resume_id =", value, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdNotEqualTo(Integer value) {
            addCriterion("get_resume_id <>", value, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdGreaterThan(Integer value) {
            addCriterion("get_resume_id >", value, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_resume_id >=", value, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdLessThan(Integer value) {
            addCriterion("get_resume_id <", value, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("get_resume_id <=", value, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdIn(List<Integer> values) {
            addCriterion("get_resume_id in", values, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdNotIn(List<Integer> values) {
            addCriterion("get_resume_id not in", values, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("get_resume_id between", value1, value2, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andGetResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("get_resume_id not between", value1, value2, "getResumeId");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneIsNull() {
            addCriterion("company_type_one is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneIsNotNull() {
            addCriterion("company_type_one is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneEqualTo(String value) {
            addCriterion("company_type_one =", value, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneNotEqualTo(String value) {
            addCriterion("company_type_one <>", value, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneGreaterThan(String value) {
            addCriterion("company_type_one >", value, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneGreaterThanOrEqualTo(String value) {
            addCriterion("company_type_one >=", value, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneLessThan(String value) {
            addCriterion("company_type_one <", value, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneLessThanOrEqualTo(String value) {
            addCriterion("company_type_one <=", value, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneLike(String value) {
            addCriterion("company_type_one like", value, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneNotLike(String value) {
            addCriterion("company_type_one not like", value, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneIn(List<String> values) {
            addCriterion("company_type_one in", values, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneNotIn(List<String> values) {
            addCriterion("company_type_one not in", values, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneBetween(String value1, String value2) {
            addCriterion("company_type_one between", value1, value2, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeOneNotBetween(String value1, String value2) {
            addCriterion("company_type_one not between", value1, value2, "companyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNull() {
            addCriterion("special is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNotNull() {
            addCriterion("special is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEqualTo(String value) {
            addCriterion("special =", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotEqualTo(String value) {
            addCriterion("special <>", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThan(String value) {
            addCriterion("special >", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("special >=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThan(String value) {
            addCriterion("special <", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThanOrEqualTo(String value) {
            addCriterion("special <=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLike(String value) {
            addCriterion("special like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotLike(String value) {
            addCriterion("special not like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialIn(List<String> values) {
            addCriterion("special in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotIn(List<String> values) {
            addCriterion("special not in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialBetween(String value1, String value2) {
            addCriterion("special between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotBetween(String value1, String value2) {
            addCriterion("special not between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoIsNull() {
            addCriterion("c_company_logo is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoIsNotNull() {
            addCriterion("c_company_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoEqualTo(String value) {
            addCriterion("c_company_logo =", value, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoNotEqualTo(String value) {
            addCriterion("c_company_logo <>", value, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoGreaterThan(String value) {
            addCriterion("c_company_logo >", value, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_logo >=", value, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoLessThan(String value) {
            addCriterion("c_company_logo <", value, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoLessThanOrEqualTo(String value) {
            addCriterion("c_company_logo <=", value, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoLike(String value) {
            addCriterion("c_company_logo like", value, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoNotLike(String value) {
            addCriterion("c_company_logo not like", value, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoIn(List<String> values) {
            addCriterion("c_company_logo in", values, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoNotIn(List<String> values) {
            addCriterion("c_company_logo not in", values, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoBetween(String value1, String value2) {
            addCriterion("c_company_logo between", value1, value2, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCCompanyLogoNotBetween(String value1, String value2) {
            addCriterion("c_company_logo not between", value1, value2, "cCompanyLogo");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentIsNull() {
            addCriterion("campus_recruitment is null");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentIsNotNull() {
            addCriterion("campus_recruitment is not null");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentEqualTo(String value) {
            addCriterion("campus_recruitment =", value, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentNotEqualTo(String value) {
            addCriterion("campus_recruitment <>", value, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentGreaterThan(String value) {
            addCriterion("campus_recruitment >", value, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentGreaterThanOrEqualTo(String value) {
            addCriterion("campus_recruitment >=", value, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentLessThan(String value) {
            addCriterion("campus_recruitment <", value, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentLessThanOrEqualTo(String value) {
            addCriterion("campus_recruitment <=", value, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentLike(String value) {
            addCriterion("campus_recruitment like", value, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentNotLike(String value) {
            addCriterion("campus_recruitment not like", value, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentIn(List<String> values) {
            addCriterion("campus_recruitment in", values, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentNotIn(List<String> values) {
            addCriterion("campus_recruitment not in", values, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentBetween(String value1, String value2) {
            addCriterion("campus_recruitment between", value1, value2, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andCampusRecruitmentNotBetween(String value1, String value2) {
            addCriterion("campus_recruitment not between", value1, value2, "campusRecruitment");
            return (Criteria) this;
        }

        public Criteria andPostTypeIsNull() {
            addCriterion("post_type is null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIsNotNull() {
            addCriterion("post_type is not null");
            return (Criteria) this;
        }

        public Criteria andPostTypeEqualTo(String value) {
            addCriterion("post_type =", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotEqualTo(String value) {
            addCriterion("post_type <>", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeGreaterThan(String value) {
            addCriterion("post_type >", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeGreaterThanOrEqualTo(String value) {
            addCriterion("post_type >=", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLessThan(String value) {
            addCriterion("post_type <", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLessThanOrEqualTo(String value) {
            addCriterion("post_type <=", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLike(String value) {
            addCriterion("post_type like", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotLike(String value) {
            addCriterion("post_type not like", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeIn(List<String> values) {
            addCriterion("post_type in", values, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotIn(List<String> values) {
            addCriterion("post_type not in", values, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeBetween(String value1, String value2) {
            addCriterion("post_type between", value1, value2, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotBetween(String value1, String value2) {
            addCriterion("post_type not between", value1, value2, "postType");
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