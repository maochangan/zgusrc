package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class CompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyInfoExample() {
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

        public Criteria andCCompanyTypeOneIsNull() {
            addCriterion("c_company_type_one is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneIsNotNull() {
            addCriterion("c_company_type_one is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneEqualTo(String value) {
            addCriterion("c_company_type_one =", value, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneNotEqualTo(String value) {
            addCriterion("c_company_type_one <>", value, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneGreaterThan(String value) {
            addCriterion("c_company_type_one >", value, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_type_one >=", value, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneLessThan(String value) {
            addCriterion("c_company_type_one <", value, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneLessThanOrEqualTo(String value) {
            addCriterion("c_company_type_one <=", value, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneLike(String value) {
            addCriterion("c_company_type_one like", value, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneNotLike(String value) {
            addCriterion("c_company_type_one not like", value, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneIn(List<String> values) {
            addCriterion("c_company_type_one in", values, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneNotIn(List<String> values) {
            addCriterion("c_company_type_one not in", values, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneBetween(String value1, String value2) {
            addCriterion("c_company_type_one between", value1, value2, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeOneNotBetween(String value1, String value2) {
            addCriterion("c_company_type_one not between", value1, value2, "cCompanyTypeOne");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryIsNull() {
            addCriterion("c_industry_category is null");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryIsNotNull() {
            addCriterion("c_industry_category is not null");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryEqualTo(String value) {
            addCriterion("c_industry_category =", value, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryNotEqualTo(String value) {
            addCriterion("c_industry_category <>", value, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryGreaterThan(String value) {
            addCriterion("c_industry_category >", value, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("c_industry_category >=", value, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryLessThan(String value) {
            addCriterion("c_industry_category <", value, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryLessThanOrEqualTo(String value) {
            addCriterion("c_industry_category <=", value, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryLike(String value) {
            addCriterion("c_industry_category like", value, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryNotLike(String value) {
            addCriterion("c_industry_category not like", value, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryIn(List<String> values) {
            addCriterion("c_industry_category in", values, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryNotIn(List<String> values) {
            addCriterion("c_industry_category not in", values, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryBetween(String value1, String value2) {
            addCriterion("c_industry_category between", value1, value2, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCIndustryCategoryNotBetween(String value1, String value2) {
            addCriterion("c_industry_category not between", value1, value2, "cIndustryCategory");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNull() {
            addCriterion("c_province is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNotNull() {
            addCriterion("c_province is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceEqualTo(String value) {
            addCriterion("c_province =", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotEqualTo(String value) {
            addCriterion("c_province <>", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThan(String value) {
            addCriterion("c_province >", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("c_province >=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThan(String value) {
            addCriterion("c_province <", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThanOrEqualTo(String value) {
            addCriterion("c_province <=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLike(String value) {
            addCriterion("c_province like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotLike(String value) {
            addCriterion("c_province not like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceIn(List<String> values) {
            addCriterion("c_province in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotIn(List<String> values) {
            addCriterion("c_province not in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceBetween(String value1, String value2) {
            addCriterion("c_province between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotBetween(String value1, String value2) {
            addCriterion("c_province not between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressIsNull() {
            addCriterion("c_company_address is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressIsNotNull() {
            addCriterion("c_company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressEqualTo(String value) {
            addCriterion("c_company_address =", value, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressNotEqualTo(String value) {
            addCriterion("c_company_address <>", value, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressGreaterThan(String value) {
            addCriterion("c_company_address >", value, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_address >=", value, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressLessThan(String value) {
            addCriterion("c_company_address <", value, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("c_company_address <=", value, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressLike(String value) {
            addCriterion("c_company_address like", value, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressNotLike(String value) {
            addCriterion("c_company_address not like", value, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressIn(List<String> values) {
            addCriterion("c_company_address in", values, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressNotIn(List<String> values) {
            addCriterion("c_company_address not in", values, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressBetween(String value1, String value2) {
            addCriterion("c_company_address between", value1, value2, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("c_company_address not between", value1, value2, "cCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeIsNull() {
            addCriterion("c_postal_code is null");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeIsNotNull() {
            addCriterion("c_postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeEqualTo(String value) {
            addCriterion("c_postal_code =", value, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeNotEqualTo(String value) {
            addCriterion("c_postal_code <>", value, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeGreaterThan(String value) {
            addCriterion("c_postal_code >", value, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("c_postal_code >=", value, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeLessThan(String value) {
            addCriterion("c_postal_code <", value, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("c_postal_code <=", value, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeLike(String value) {
            addCriterion("c_postal_code like", value, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeNotLike(String value) {
            addCriterion("c_postal_code not like", value, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeIn(List<String> values) {
            addCriterion("c_postal_code in", values, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeNotIn(List<String> values) {
            addCriterion("c_postal_code not in", values, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeBetween(String value1, String value2) {
            addCriterion("c_postal_code between", value1, value2, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCPostalCodeNotBetween(String value1, String value2) {
            addCriterion("c_postal_code not between", value1, value2, "cPostalCode");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationIsNull() {
            addCriterion("c_company_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationIsNotNull() {
            addCriterion("c_company_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationEqualTo(String value) {
            addCriterion("c_company_abbreviation =", value, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationNotEqualTo(String value) {
            addCriterion("c_company_abbreviation <>", value, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationGreaterThan(String value) {
            addCriterion("c_company_abbreviation >", value, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_abbreviation >=", value, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationLessThan(String value) {
            addCriterion("c_company_abbreviation <", value, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("c_company_abbreviation <=", value, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationLike(String value) {
            addCriterion("c_company_abbreviation like", value, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationNotLike(String value) {
            addCriterion("c_company_abbreviation not like", value, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationIn(List<String> values) {
            addCriterion("c_company_abbreviation in", values, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationNotIn(List<String> values) {
            addCriterion("c_company_abbreviation not in", values, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationBetween(String value1, String value2) {
            addCriterion("c_company_abbreviation between", value1, value2, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanyAbbreviationNotBetween(String value1, String value2) {
            addCriterion("c_company_abbreviation not between", value1, value2, "cCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeIsNull() {
            addCriterion("c_company_size is null");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeIsNotNull() {
            addCriterion("c_company_size is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeEqualTo(String value) {
            addCriterion("c_company_size =", value, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeNotEqualTo(String value) {
            addCriterion("c_company_size <>", value, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeGreaterThan(String value) {
            addCriterion("c_company_size >", value, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_size >=", value, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeLessThan(String value) {
            addCriterion("c_company_size <", value, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeLessThanOrEqualTo(String value) {
            addCriterion("c_company_size <=", value, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeLike(String value) {
            addCriterion("c_company_size like", value, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeNotLike(String value) {
            addCriterion("c_company_size not like", value, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeIn(List<String> values) {
            addCriterion("c_company_size in", values, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeNotIn(List<String> values) {
            addCriterion("c_company_size not in", values, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeBetween(String value1, String value2) {
            addCriterion("c_company_size between", value1, value2, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanySizeNotBetween(String value1, String value2) {
            addCriterion("c_company_size not between", value1, value2, "cCompanySize");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoIsNull() {
            addCriterion("c_company_type_two is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoIsNotNull() {
            addCriterion("c_company_type_two is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoEqualTo(String value) {
            addCriterion("c_company_type_two =", value, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoNotEqualTo(String value) {
            addCriterion("c_company_type_two <>", value, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoGreaterThan(String value) {
            addCriterion("c_company_type_two >", value, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_type_two >=", value, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoLessThan(String value) {
            addCriterion("c_company_type_two <", value, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoLessThanOrEqualTo(String value) {
            addCriterion("c_company_type_two <=", value, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoLike(String value) {
            addCriterion("c_company_type_two like", value, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoNotLike(String value) {
            addCriterion("c_company_type_two not like", value, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoIn(List<String> values) {
            addCriterion("c_company_type_two in", values, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoNotIn(List<String> values) {
            addCriterion("c_company_type_two not in", values, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoBetween(String value1, String value2) {
            addCriterion("c_company_type_two between", value1, value2, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyTypeTwoNotBetween(String value1, String value2) {
            addCriterion("c_company_type_two not between", value1, value2, "cCompanyTypeTwo");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexIsNull() {
            addCriterion("c_company_index is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexIsNotNull() {
            addCriterion("c_company_index is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexEqualTo(String value) {
            addCriterion("c_company_index =", value, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexNotEqualTo(String value) {
            addCriterion("c_company_index <>", value, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexGreaterThan(String value) {
            addCriterion("c_company_index >", value, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_index >=", value, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexLessThan(String value) {
            addCriterion("c_company_index <", value, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexLessThanOrEqualTo(String value) {
            addCriterion("c_company_index <=", value, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexLike(String value) {
            addCriterion("c_company_index like", value, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexNotLike(String value) {
            addCriterion("c_company_index not like", value, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexIn(List<String> values) {
            addCriterion("c_company_index in", values, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexNotIn(List<String> values) {
            addCriterion("c_company_index not in", values, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexBetween(String value1, String value2) {
            addCriterion("c_company_index between", value1, value2, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyIndexNotBetween(String value1, String value2) {
            addCriterion("c_company_index not between", value1, value2, "cCompanyIndex");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailIsNull() {
            addCriterion("c_company_email is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailIsNotNull() {
            addCriterion("c_company_email is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailEqualTo(String value) {
            addCriterion("c_company_email =", value, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailNotEqualTo(String value) {
            addCriterion("c_company_email <>", value, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailGreaterThan(String value) {
            addCriterion("c_company_email >", value, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_email >=", value, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailLessThan(String value) {
            addCriterion("c_company_email <", value, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("c_company_email <=", value, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailLike(String value) {
            addCriterion("c_company_email like", value, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailNotLike(String value) {
            addCriterion("c_company_email not like", value, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailIn(List<String> values) {
            addCriterion("c_company_email in", values, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailNotIn(List<String> values) {
            addCriterion("c_company_email not in", values, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailBetween(String value1, String value2) {
            addCriterion("c_company_email between", value1, value2, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("c_company_email not between", value1, value2, "cCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoIsNull() {
            addCriterion("c_company_info is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoIsNotNull() {
            addCriterion("c_company_info is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoEqualTo(String value) {
            addCriterion("c_company_info =", value, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoNotEqualTo(String value) {
            addCriterion("c_company_info <>", value, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoGreaterThan(String value) {
            addCriterion("c_company_info >", value, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_info >=", value, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoLessThan(String value) {
            addCriterion("c_company_info <", value, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoLessThanOrEqualTo(String value) {
            addCriterion("c_company_info <=", value, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoLike(String value) {
            addCriterion("c_company_info like", value, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoNotLike(String value) {
            addCriterion("c_company_info not like", value, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoIn(List<String> values) {
            addCriterion("c_company_info in", values, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoNotIn(List<String> values) {
            addCriterion("c_company_info not in", values, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoBetween(String value1, String value2) {
            addCriterion("c_company_info between", value1, value2, "cCompanyInfo");
            return (Criteria) this;
        }

        public Criteria andCCompanyInfoNotBetween(String value1, String value2) {
            addCriterion("c_company_info not between", value1, value2, "cCompanyInfo");
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

        public Criteria andCCompanyPicIsNull() {
            addCriterion("c_company_pic is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicIsNotNull() {
            addCriterion("c_company_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicEqualTo(String value) {
            addCriterion("c_company_pic =", value, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicNotEqualTo(String value) {
            addCriterion("c_company_pic <>", value, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicGreaterThan(String value) {
            addCriterion("c_company_pic >", value, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_pic >=", value, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicLessThan(String value) {
            addCriterion("c_company_pic <", value, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicLessThanOrEqualTo(String value) {
            addCriterion("c_company_pic <=", value, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicLike(String value) {
            addCriterion("c_company_pic like", value, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicNotLike(String value) {
            addCriterion("c_company_pic not like", value, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicIn(List<String> values) {
            addCriterion("c_company_pic in", values, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicNotIn(List<String> values) {
            addCriterion("c_company_pic not in", values, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicBetween(String value1, String value2) {
            addCriterion("c_company_pic between", value1, value2, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCCompanyPicNotBetween(String value1, String value2) {
            addCriterion("c_company_pic not between", value1, value2, "cCompanyPic");
            return (Criteria) this;
        }

        public Criteria andCSittingIsNull() {
            addCriterion("c_sitting is null");
            return (Criteria) this;
        }

        public Criteria andCSittingIsNotNull() {
            addCriterion("c_sitting is not null");
            return (Criteria) this;
        }

        public Criteria andCSittingEqualTo(String value) {
            addCriterion("c_sitting =", value, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingNotEqualTo(String value) {
            addCriterion("c_sitting <>", value, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingGreaterThan(String value) {
            addCriterion("c_sitting >", value, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingGreaterThanOrEqualTo(String value) {
            addCriterion("c_sitting >=", value, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingLessThan(String value) {
            addCriterion("c_sitting <", value, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingLessThanOrEqualTo(String value) {
            addCriterion("c_sitting <=", value, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingLike(String value) {
            addCriterion("c_sitting like", value, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingNotLike(String value) {
            addCriterion("c_sitting not like", value, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingIn(List<String> values) {
            addCriterion("c_sitting in", values, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingNotIn(List<String> values) {
            addCriterion("c_sitting not in", values, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingBetween(String value1, String value2) {
            addCriterion("c_sitting between", value1, value2, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCSittingNotBetween(String value1, String value2) {
            addCriterion("c_sitting not between", value1, value2, "cSitting");
            return (Criteria) this;
        }

        public Criteria andCAcIsNull() {
            addCriterion("c_ac is null");
            return (Criteria) this;
        }

        public Criteria andCAcIsNotNull() {
            addCriterion("c_ac is not null");
            return (Criteria) this;
        }

        public Criteria andCAcEqualTo(String value) {
            addCriterion("c_ac =", value, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcNotEqualTo(String value) {
            addCriterion("c_ac <>", value, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcGreaterThan(String value) {
            addCriterion("c_ac >", value, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcGreaterThanOrEqualTo(String value) {
            addCriterion("c_ac >=", value, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcLessThan(String value) {
            addCriterion("c_ac <", value, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcLessThanOrEqualTo(String value) {
            addCriterion("c_ac <=", value, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcLike(String value) {
            addCriterion("c_ac like", value, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcNotLike(String value) {
            addCriterion("c_ac not like", value, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcIn(List<String> values) {
            addCriterion("c_ac in", values, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcNotIn(List<String> values) {
            addCriterion("c_ac not in", values, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcBetween(String value1, String value2) {
            addCriterion("c_ac between", value1, value2, "cAc");
            return (Criteria) this;
        }

        public Criteria andCAcNotBetween(String value1, String value2) {
            addCriterion("c_ac not between", value1, value2, "cAc");
            return (Criteria) this;
        }

        public Criteria andTopIsNull() {
            addCriterion("top is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("top is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(String value) {
            addCriterion("top =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(String value) {
            addCriterion("top <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(String value) {
            addCriterion("top >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(String value) {
            addCriterion("top >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(String value) {
            addCriterion("top <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(String value) {
            addCriterion("top <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLike(String value) {
            addCriterion("top like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotLike(String value) {
            addCriterion("top not like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<String> values) {
            addCriterion("top in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<String> values) {
            addCriterion("top not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(String value1, String value2) {
            addCriterion("top between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(String value1, String value2) {
            addCriterion("top not between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneIsNull() {
            addCriterion("c_company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneIsNotNull() {
            addCriterion("c_company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneEqualTo(String value) {
            addCriterion("c_company_phone =", value, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneNotEqualTo(String value) {
            addCriterion("c_company_phone <>", value, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneGreaterThan(String value) {
            addCriterion("c_company_phone >", value, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_company_phone >=", value, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneLessThan(String value) {
            addCriterion("c_company_phone <", value, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_company_phone <=", value, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneLike(String value) {
            addCriterion("c_company_phone like", value, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneNotLike(String value) {
            addCriterion("c_company_phone not like", value, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneIn(List<String> values) {
            addCriterion("c_company_phone in", values, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneNotIn(List<String> values) {
            addCriterion("c_company_phone not in", values, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneBetween(String value1, String value2) {
            addCriterion("c_company_phone between", value1, value2, "cCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andCCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("c_company_phone not between", value1, value2, "cCompanyPhone");
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

        public Criteria andHotOrNotIsNull() {
            addCriterion("hot_or_not is null");
            return (Criteria) this;
        }

        public Criteria andHotOrNotIsNotNull() {
            addCriterion("hot_or_not is not null");
            return (Criteria) this;
        }

        public Criteria andHotOrNotEqualTo(String value) {
            addCriterion("hot_or_not =", value, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotNotEqualTo(String value) {
            addCriterion("hot_or_not <>", value, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotGreaterThan(String value) {
            addCriterion("hot_or_not >", value, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotGreaterThanOrEqualTo(String value) {
            addCriterion("hot_or_not >=", value, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotLessThan(String value) {
            addCriterion("hot_or_not <", value, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotLessThanOrEqualTo(String value) {
            addCriterion("hot_or_not <=", value, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotLike(String value) {
            addCriterion("hot_or_not like", value, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotNotLike(String value) {
            addCriterion("hot_or_not not like", value, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotIn(List<String> values) {
            addCriterion("hot_or_not in", values, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotNotIn(List<String> values) {
            addCriterion("hot_or_not not in", values, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotBetween(String value1, String value2) {
            addCriterion("hot_or_not between", value1, value2, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andHotOrNotNotBetween(String value1, String value2) {
            addCriterion("hot_or_not not between", value1, value2, "hotOrNot");
            return (Criteria) this;
        }

        public Criteria andCCityIsNull() {
            addCriterion("c_city is null");
            return (Criteria) this;
        }

        public Criteria andCCityIsNotNull() {
            addCriterion("c_city is not null");
            return (Criteria) this;
        }

        public Criteria andCCityEqualTo(String value) {
            addCriterion("c_city =", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotEqualTo(String value) {
            addCriterion("c_city <>", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThan(String value) {
            addCriterion("c_city >", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThanOrEqualTo(String value) {
            addCriterion("c_city >=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThan(String value) {
            addCriterion("c_city <", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThanOrEqualTo(String value) {
            addCriterion("c_city <=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLike(String value) {
            addCriterion("c_city like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotLike(String value) {
            addCriterion("c_city not like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityIn(List<String> values) {
            addCriterion("c_city in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotIn(List<String> values) {
            addCriterion("c_city not in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityBetween(String value1, String value2) {
            addCriterion("c_city between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotBetween(String value1, String value2) {
            addCriterion("c_city not between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCAreaIsNull() {
            addCriterion("c_area is null");
            return (Criteria) this;
        }

        public Criteria andCAreaIsNotNull() {
            addCriterion("c_area is not null");
            return (Criteria) this;
        }

        public Criteria andCAreaEqualTo(String value) {
            addCriterion("c_area =", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotEqualTo(String value) {
            addCriterion("c_area <>", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaGreaterThan(String value) {
            addCriterion("c_area >", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaGreaterThanOrEqualTo(String value) {
            addCriterion("c_area >=", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLessThan(String value) {
            addCriterion("c_area <", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLessThanOrEqualTo(String value) {
            addCriterion("c_area <=", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLike(String value) {
            addCriterion("c_area like", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotLike(String value) {
            addCriterion("c_area not like", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaIn(List<String> values) {
            addCriterion("c_area in", values, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotIn(List<String> values) {
            addCriterion("c_area not in", values, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaBetween(String value1, String value2) {
            addCriterion("c_area between", value1, value2, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotBetween(String value1, String value2) {
            addCriterion("c_area not between", value1, value2, "cArea");
            return (Criteria) this;
        }

        public Criteria andCChaopingIsNull() {
            addCriterion("c_chaoping is null");
            return (Criteria) this;
        }

        public Criteria andCChaopingIsNotNull() {
            addCriterion("c_chaoping is not null");
            return (Criteria) this;
        }

        public Criteria andCChaopingEqualTo(String value) {
            addCriterion("c_chaoping =", value, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingNotEqualTo(String value) {
            addCriterion("c_chaoping <>", value, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingGreaterThan(String value) {
            addCriterion("c_chaoping >", value, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingGreaterThanOrEqualTo(String value) {
            addCriterion("c_chaoping >=", value, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingLessThan(String value) {
            addCriterion("c_chaoping <", value, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingLessThanOrEqualTo(String value) {
            addCriterion("c_chaoping <=", value, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingLike(String value) {
            addCriterion("c_chaoping like", value, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingNotLike(String value) {
            addCriterion("c_chaoping not like", value, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingIn(List<String> values) {
            addCriterion("c_chaoping in", values, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingNotIn(List<String> values) {
            addCriterion("c_chaoping not in", values, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingBetween(String value1, String value2) {
            addCriterion("c_chaoping between", value1, value2, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCChaopingNotBetween(String value1, String value2) {
            addCriterion("c_chaoping not between", value1, value2, "cChaoping");
            return (Criteria) this;
        }

        public Criteria andCSchoolIsNull() {
            addCriterion("c_school is null");
            return (Criteria) this;
        }

        public Criteria andCSchoolIsNotNull() {
            addCriterion("c_school is not null");
            return (Criteria) this;
        }

        public Criteria andCSchoolEqualTo(String value) {
            addCriterion("c_school =", value, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolNotEqualTo(String value) {
            addCriterion("c_school <>", value, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolGreaterThan(String value) {
            addCriterion("c_school >", value, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("c_school >=", value, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolLessThan(String value) {
            addCriterion("c_school <", value, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolLessThanOrEqualTo(String value) {
            addCriterion("c_school <=", value, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolLike(String value) {
            addCriterion("c_school like", value, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolNotLike(String value) {
            addCriterion("c_school not like", value, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolIn(List<String> values) {
            addCriterion("c_school in", values, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolNotIn(List<String> values) {
            addCriterion("c_school not in", values, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolBetween(String value1, String value2) {
            addCriterion("c_school between", value1, value2, "cSchool");
            return (Criteria) this;
        }

        public Criteria andCSchoolNotBetween(String value1, String value2) {
            addCriterion("c_school not between", value1, value2, "cSchool");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_license =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_license >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_license <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_license like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_license not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_license in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeIsNull() {
            addCriterion("registe_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeIsNotNull() {
            addCriterion("registe_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeEqualTo(String value) {
            addCriterion("registe_time =", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotEqualTo(String value) {
            addCriterion("registe_time <>", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeGreaterThan(String value) {
            addCriterion("registe_time >", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("registe_time >=", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeLessThan(String value) {
            addCriterion("registe_time <", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeLessThanOrEqualTo(String value) {
            addCriterion("registe_time <=", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeLike(String value) {
            addCriterion("registe_time like", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotLike(String value) {
            addCriterion("registe_time not like", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeIn(List<String> values) {
            addCriterion("registe_time in", values, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotIn(List<String> values) {
            addCriterion("registe_time not in", values, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeBetween(String value1, String value2) {
            addCriterion("registe_time between", value1, value2, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotBetween(String value1, String value2) {
            addCriterion("registe_time not between", value1, value2, "registeTime");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNull() {
            addCriterion("vip_type is null");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNotNull() {
            addCriterion("vip_type is not null");
            return (Criteria) this;
        }

        public Criteria andVipTypeEqualTo(String value) {
            addCriterion("vip_type =", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotEqualTo(String value) {
            addCriterion("vip_type <>", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThan(String value) {
            addCriterion("vip_type >", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vip_type >=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThan(String value) {
            addCriterion("vip_type <", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThanOrEqualTo(String value) {
            addCriterion("vip_type <=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLike(String value) {
            addCriterion("vip_type like", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotLike(String value) {
            addCriterion("vip_type not like", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeIn(List<String> values) {
            addCriterion("vip_type in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotIn(List<String> values) {
            addCriterion("vip_type not in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeBetween(String value1, String value2) {
            addCriterion("vip_type between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotBetween(String value1, String value2) {
            addCriterion("vip_type not between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andCollNumIsNull() {
            addCriterion("coll_num is null");
            return (Criteria) this;
        }

        public Criteria andCollNumIsNotNull() {
            addCriterion("coll_num is not null");
            return (Criteria) this;
        }

        public Criteria andCollNumEqualTo(Integer value) {
            addCriterion("coll_num =", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumNotEqualTo(Integer value) {
            addCriterion("coll_num <>", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumGreaterThan(Integer value) {
            addCriterion("coll_num >", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("coll_num >=", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumLessThan(Integer value) {
            addCriterion("coll_num <", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumLessThanOrEqualTo(Integer value) {
            addCriterion("coll_num <=", value, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumIn(List<Integer> values) {
            addCriterion("coll_num in", values, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumNotIn(List<Integer> values) {
            addCriterion("coll_num not in", values, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumBetween(Integer value1, Integer value2) {
            addCriterion("coll_num between", value1, value2, "collNum");
            return (Criteria) this;
        }

        public Criteria andCollNumNotBetween(Integer value1, Integer value2) {
            addCriterion("coll_num not between", value1, value2, "collNum");
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