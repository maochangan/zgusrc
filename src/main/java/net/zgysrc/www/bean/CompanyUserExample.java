package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCVipNameIsNull() {
            addCriterion("c_vip_name is null");
            return (Criteria) this;
        }

        public Criteria andCVipNameIsNotNull() {
            addCriterion("c_vip_name is not null");
            return (Criteria) this;
        }

        public Criteria andCVipNameEqualTo(String value) {
            addCriterion("c_vip_name =", value, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameNotEqualTo(String value) {
            addCriterion("c_vip_name <>", value, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameGreaterThan(String value) {
            addCriterion("c_vip_name >", value, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_vip_name >=", value, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameLessThan(String value) {
            addCriterion("c_vip_name <", value, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameLessThanOrEqualTo(String value) {
            addCriterion("c_vip_name <=", value, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameLike(String value) {
            addCriterion("c_vip_name like", value, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameNotLike(String value) {
            addCriterion("c_vip_name not like", value, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameIn(List<String> values) {
            addCriterion("c_vip_name in", values, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameNotIn(List<String> values) {
            addCriterion("c_vip_name not in", values, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameBetween(String value1, String value2) {
            addCriterion("c_vip_name between", value1, value2, "cVipName");
            return (Criteria) this;
        }

        public Criteria andCVipNameNotBetween(String value1, String value2) {
            addCriterion("c_vip_name not between", value1, value2, "cVipName");
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

        public Criteria andCPasswordIsNull() {
            addCriterion("c_password is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("c_password is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("c_password =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("c_password <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("c_password >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_password >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("c_password <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_password <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("c_password like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("c_password not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("c_password in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("c_password not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("c_password between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("c_password not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCImageIsNull() {
            addCriterion("c_image is null");
            return (Criteria) this;
        }

        public Criteria andCImageIsNotNull() {
            addCriterion("c_image is not null");
            return (Criteria) this;
        }

        public Criteria andCImageEqualTo(String value) {
            addCriterion("c_image =", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotEqualTo(String value) {
            addCriterion("c_image <>", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageGreaterThan(String value) {
            addCriterion("c_image >", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageGreaterThanOrEqualTo(String value) {
            addCriterion("c_image >=", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLessThan(String value) {
            addCriterion("c_image <", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLessThanOrEqualTo(String value) {
            addCriterion("c_image <=", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLike(String value) {
            addCriterion("c_image like", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotLike(String value) {
            addCriterion("c_image not like", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageIn(List<String> values) {
            addCriterion("c_image in", values, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotIn(List<String> values) {
            addCriterion("c_image not in", values, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageBetween(String value1, String value2) {
            addCriterion("c_image between", value1, value2, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotBetween(String value1, String value2) {
            addCriterion("c_image not between", value1, value2, "cImage");
            return (Criteria) this;
        }

        public Criteria andCNickNameIsNull() {
            addCriterion("c_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andCNickNameIsNotNull() {
            addCriterion("c_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNickNameEqualTo(String value) {
            addCriterion("c_nick_name =", value, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameNotEqualTo(String value) {
            addCriterion("c_nick_name <>", value, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameGreaterThan(String value) {
            addCriterion("c_nick_name >", value, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_nick_name >=", value, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameLessThan(String value) {
            addCriterion("c_nick_name <", value, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameLessThanOrEqualTo(String value) {
            addCriterion("c_nick_name <=", value, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameLike(String value) {
            addCriterion("c_nick_name like", value, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameNotLike(String value) {
            addCriterion("c_nick_name not like", value, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameIn(List<String> values) {
            addCriterion("c_nick_name in", values, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameNotIn(List<String> values) {
            addCriterion("c_nick_name not in", values, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameBetween(String value1, String value2) {
            addCriterion("c_nick_name between", value1, value2, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNickNameNotBetween(String value1, String value2) {
            addCriterion("c_nick_name not between", value1, value2, "cNickName");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameIsNull() {
            addCriterion("c_position_name is null");
            return (Criteria) this;
        }

        public Criteria andCPositionNameIsNotNull() {
            addCriterion("c_position_name is not null");
            return (Criteria) this;
        }

        public Criteria andCPositionNameEqualTo(String value) {
            addCriterion("c_position_name =", value, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameNotEqualTo(String value) {
            addCriterion("c_position_name <>", value, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameGreaterThan(String value) {
            addCriterion("c_position_name >", value, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_position_name >=", value, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameLessThan(String value) {
            addCriterion("c_position_name <", value, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameLessThanOrEqualTo(String value) {
            addCriterion("c_position_name <=", value, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameLike(String value) {
            addCriterion("c_position_name like", value, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameNotLike(String value) {
            addCriterion("c_position_name not like", value, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameIn(List<String> values) {
            addCriterion("c_position_name in", values, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameNotIn(List<String> values) {
            addCriterion("c_position_name not in", values, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameBetween(String value1, String value2) {
            addCriterion("c_position_name between", value1, value2, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCPositionNameNotBetween(String value1, String value2) {
            addCriterion("c_position_name not between", value1, value2, "cPositionName");
            return (Criteria) this;
        }

        public Criteria andCSexIsNull() {
            addCriterion("c_sex is null");
            return (Criteria) this;
        }

        public Criteria andCSexIsNotNull() {
            addCriterion("c_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCSexEqualTo(String value) {
            addCriterion("c_sex =", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotEqualTo(String value) {
            addCriterion("c_sex <>", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThan(String value) {
            addCriterion("c_sex >", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThanOrEqualTo(String value) {
            addCriterion("c_sex >=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThan(String value) {
            addCriterion("c_sex <", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThanOrEqualTo(String value) {
            addCriterion("c_sex <=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLike(String value) {
            addCriterion("c_sex like", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotLike(String value) {
            addCriterion("c_sex not like", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexIn(List<String> values) {
            addCriterion("c_sex in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotIn(List<String> values) {
            addCriterion("c_sex not in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexBetween(String value1, String value2) {
            addCriterion("c_sex between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotBetween(String value1, String value2) {
            addCriterion("c_sex not between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberIsNull() {
            addCriterion("c_telephone_number is null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberIsNotNull() {
            addCriterion("c_telephone_number is not null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberEqualTo(String value) {
            addCriterion("c_telephone_number =", value, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberNotEqualTo(String value) {
            addCriterion("c_telephone_number <>", value, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberGreaterThan(String value) {
            addCriterion("c_telephone_number >", value, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("c_telephone_number >=", value, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberLessThan(String value) {
            addCriterion("c_telephone_number <", value, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberLessThanOrEqualTo(String value) {
            addCriterion("c_telephone_number <=", value, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberLike(String value) {
            addCriterion("c_telephone_number like", value, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberNotLike(String value) {
            addCriterion("c_telephone_number not like", value, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberIn(List<String> values) {
            addCriterion("c_telephone_number in", values, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberNotIn(List<String> values) {
            addCriterion("c_telephone_number not in", values, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberBetween(String value1, String value2) {
            addCriterion("c_telephone_number between", value1, value2, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNumberNotBetween(String value1, String value2) {
            addCriterion("c_telephone_number not between", value1, value2, "cTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNull() {
            addCriterion("c_email is null");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNotNull() {
            addCriterion("c_email is not null");
            return (Criteria) this;
        }

        public Criteria andCEmailEqualTo(String value) {
            addCriterion("c_email =", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotEqualTo(String value) {
            addCriterion("c_email <>", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThan(String value) {
            addCriterion("c_email >", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThanOrEqualTo(String value) {
            addCriterion("c_email >=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThan(String value) {
            addCriterion("c_email <", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThanOrEqualTo(String value) {
            addCriterion("c_email <=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLike(String value) {
            addCriterion("c_email like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotLike(String value) {
            addCriterion("c_email not like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailIn(List<String> values) {
            addCriterion("c_email in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotIn(List<String> values) {
            addCriterion("c_email not in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailBetween(String value1, String value2) {
            addCriterion("c_email between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotBetween(String value1, String value2) {
            addCriterion("c_email not between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCQqIsNull() {
            addCriterion("c_qq is null");
            return (Criteria) this;
        }

        public Criteria andCQqIsNotNull() {
            addCriterion("c_qq is not null");
            return (Criteria) this;
        }

        public Criteria andCQqEqualTo(String value) {
            addCriterion("c_qq =", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqNotEqualTo(String value) {
            addCriterion("c_qq <>", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqGreaterThan(String value) {
            addCriterion("c_qq >", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqGreaterThanOrEqualTo(String value) {
            addCriterion("c_qq >=", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqLessThan(String value) {
            addCriterion("c_qq <", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqLessThanOrEqualTo(String value) {
            addCriterion("c_qq <=", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqLike(String value) {
            addCriterion("c_qq like", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqNotLike(String value) {
            addCriterion("c_qq not like", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqIn(List<String> values) {
            addCriterion("c_qq in", values, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqNotIn(List<String> values) {
            addCriterion("c_qq not in", values, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqBetween(String value1, String value2) {
            addCriterion("c_qq between", value1, value2, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqNotBetween(String value1, String value2) {
            addCriterion("c_qq not between", value1, value2, "cQq");
            return (Criteria) this;
        }

        public Criteria andEmailCodeIsNull() {
            addCriterion("email_code is null");
            return (Criteria) this;
        }

        public Criteria andEmailCodeIsNotNull() {
            addCriterion("email_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmailCodeEqualTo(String value) {
            addCriterion("email_code =", value, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeNotEqualTo(String value) {
            addCriterion("email_code <>", value, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeGreaterThan(String value) {
            addCriterion("email_code >", value, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("email_code >=", value, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeLessThan(String value) {
            addCriterion("email_code <", value, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeLessThanOrEqualTo(String value) {
            addCriterion("email_code <=", value, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeLike(String value) {
            addCriterion("email_code like", value, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeNotLike(String value) {
            addCriterion("email_code not like", value, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeIn(List<String> values) {
            addCriterion("email_code in", values, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeNotIn(List<String> values) {
            addCriterion("email_code not in", values, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeBetween(String value1, String value2) {
            addCriterion("email_code between", value1, value2, "emailCode");
            return (Criteria) this;
        }

        public Criteria andEmailCodeNotBetween(String value1, String value2) {
            addCriterion("email_code not between", value1, value2, "emailCode");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIsNull() {
            addCriterion("authentication is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIsNotNull() {
            addCriterion("authentication is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationEqualTo(String value) {
            addCriterion("authentication =", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotEqualTo(String value) {
            addCriterion("authentication <>", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationGreaterThan(String value) {
            addCriterion("authentication >", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationGreaterThanOrEqualTo(String value) {
            addCriterion("authentication >=", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLessThan(String value) {
            addCriterion("authentication <", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLessThanOrEqualTo(String value) {
            addCriterion("authentication <=", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationLike(String value) {
            addCriterion("authentication like", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotLike(String value) {
            addCriterion("authentication not like", value, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationIn(List<String> values) {
            addCriterion("authentication in", values, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotIn(List<String> values) {
            addCriterion("authentication not in", values, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationBetween(String value1, String value2) {
            addCriterion("authentication between", value1, value2, "authentication");
            return (Criteria) this;
        }

        public Criteria andAuthenticationNotBetween(String value1, String value2) {
            addCriterion("authentication not between", value1, value2, "authentication");
            return (Criteria) this;
        }

        public Criteria andEmailKeyIsNull() {
            addCriterion("email_key is null");
            return (Criteria) this;
        }

        public Criteria andEmailKeyIsNotNull() {
            addCriterion("email_key is not null");
            return (Criteria) this;
        }

        public Criteria andEmailKeyEqualTo(String value) {
            addCriterion("email_key =", value, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyNotEqualTo(String value) {
            addCriterion("email_key <>", value, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyGreaterThan(String value) {
            addCriterion("email_key >", value, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyGreaterThanOrEqualTo(String value) {
            addCriterion("email_key >=", value, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyLessThan(String value) {
            addCriterion("email_key <", value, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyLessThanOrEqualTo(String value) {
            addCriterion("email_key <=", value, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyLike(String value) {
            addCriterion("email_key like", value, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyNotLike(String value) {
            addCriterion("email_key not like", value, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyIn(List<String> values) {
            addCriterion("email_key in", values, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyNotIn(List<String> values) {
            addCriterion("email_key not in", values, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyBetween(String value1, String value2) {
            addCriterion("email_key between", value1, value2, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailKeyNotBetween(String value1, String value2) {
            addCriterion("email_key not between", value1, value2, "emailKey");
            return (Criteria) this;
        }

        public Criteria andEmailAcIsNull() {
            addCriterion("email_ac is null");
            return (Criteria) this;
        }

        public Criteria andEmailAcIsNotNull() {
            addCriterion("email_ac is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAcEqualTo(String value) {
            addCriterion("email_ac =", value, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcNotEqualTo(String value) {
            addCriterion("email_ac <>", value, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcGreaterThan(String value) {
            addCriterion("email_ac >", value, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcGreaterThanOrEqualTo(String value) {
            addCriterion("email_ac >=", value, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcLessThan(String value) {
            addCriterion("email_ac <", value, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcLessThanOrEqualTo(String value) {
            addCriterion("email_ac <=", value, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcLike(String value) {
            addCriterion("email_ac like", value, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcNotLike(String value) {
            addCriterion("email_ac not like", value, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcIn(List<String> values) {
            addCriterion("email_ac in", values, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcNotIn(List<String> values) {
            addCriterion("email_ac not in", values, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcBetween(String value1, String value2) {
            addCriterion("email_ac between", value1, value2, "emailAc");
            return (Criteria) this;
        }

        public Criteria andEmailAcNotBetween(String value1, String value2) {
            addCriterion("email_ac not between", value1, value2, "emailAc");
            return (Criteria) this;
        }

        public Criteria andAcTimeIsNull() {
            addCriterion("ac_time is null");
            return (Criteria) this;
        }

        public Criteria andAcTimeIsNotNull() {
            addCriterion("ac_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ac_time =", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ac_time <>", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ac_time >", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ac_time >=", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeLessThan(Date value) {
            addCriterionForJDBCDate("ac_time <", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ac_time <=", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ac_time in", values, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ac_time not in", values, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ac_time between", value1, value2, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ac_time not between", value1, value2, "acTime");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeIsNull() {
            addCriterion("emain_ac_time is null");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeIsNotNull() {
            addCriterion("emain_ac_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeEqualTo(Long value) {
            addCriterion("emain_ac_time =", value, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeNotEqualTo(Long value) {
            addCriterion("emain_ac_time <>", value, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeGreaterThan(Long value) {
            addCriterion("emain_ac_time >", value, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("emain_ac_time >=", value, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeLessThan(Long value) {
            addCriterion("emain_ac_time <", value, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeLessThanOrEqualTo(Long value) {
            addCriterion("emain_ac_time <=", value, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeIn(List<Long> values) {
            addCriterion("emain_ac_time in", values, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeNotIn(List<Long> values) {
            addCriterion("emain_ac_time not in", values, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeBetween(Long value1, Long value2) {
            addCriterion("emain_ac_time between", value1, value2, "emainAcTime");
            return (Criteria) this;
        }

        public Criteria andEmainAcTimeNotBetween(Long value1, Long value2) {
            addCriterion("emain_ac_time not between", value1, value2, "emainAcTime");
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