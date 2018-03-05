package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class GetResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GetResumeExample() {
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

        public Criteria andPostUserNameIsNull() {
            addCriterion("post_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPostUserNameIsNotNull() {
            addCriterion("post_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostUserNameEqualTo(String value) {
            addCriterion("post_user_name =", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameNotEqualTo(String value) {
            addCriterion("post_user_name <>", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameGreaterThan(String value) {
            addCriterion("post_user_name >", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_user_name >=", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameLessThan(String value) {
            addCriterion("post_user_name <", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameLessThanOrEqualTo(String value) {
            addCriterion("post_user_name <=", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameLike(String value) {
            addCriterion("post_user_name like", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameNotLike(String value) {
            addCriterion("post_user_name not like", value, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameIn(List<String> values) {
            addCriterion("post_user_name in", values, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameNotIn(List<String> values) {
            addCriterion("post_user_name not in", values, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameBetween(String value1, String value2) {
            addCriterion("post_user_name between", value1, value2, "postUserName");
            return (Criteria) this;
        }

        public Criteria andPostUserNameNotBetween(String value1, String value2) {
            addCriterion("post_user_name not between", value1, value2, "postUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdIsNull() {
            addCriterion("simple_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdIsNotNull() {
            addCriterion("simple_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdEqualTo(Integer value) {
            addCriterion("simple_user_id =", value, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdNotEqualTo(Integer value) {
            addCriterion("simple_user_id <>", value, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdGreaterThan(Integer value) {
            addCriterion("simple_user_id >", value, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("simple_user_id >=", value, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdLessThan(Integer value) {
            addCriterion("simple_user_id <", value, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("simple_user_id <=", value, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdIn(List<Integer> values) {
            addCriterion("simple_user_id in", values, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdNotIn(List<Integer> values) {
            addCriterion("simple_user_id not in", values, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdBetween(Integer value1, Integer value2) {
            addCriterion("simple_user_id between", value1, value2, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andSimpleUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("simple_user_id not between", value1, value2, "simpleUserId");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdIsNull() {
            addCriterion("post_simple_resume_id is null");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdIsNotNull() {
            addCriterion("post_simple_resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdEqualTo(Integer value) {
            addCriterion("post_simple_resume_id =", value, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdNotEqualTo(Integer value) {
            addCriterion("post_simple_resume_id <>", value, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdGreaterThan(Integer value) {
            addCriterion("post_simple_resume_id >", value, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_simple_resume_id >=", value, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdLessThan(Integer value) {
            addCriterion("post_simple_resume_id <", value, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_simple_resume_id <=", value, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdIn(List<Integer> values) {
            addCriterion("post_simple_resume_id in", values, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdNotIn(List<Integer> values) {
            addCriterion("post_simple_resume_id not in", values, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("post_simple_resume_id between", value1, value2, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostSimpleResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_simple_resume_id not between", value1, value2, "postSimpleResumeId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdIsNull() {
            addCriterion("post_company_id is null");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdIsNotNull() {
            addCriterion("post_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdEqualTo(Integer value) {
            addCriterion("post_company_id =", value, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdNotEqualTo(Integer value) {
            addCriterion("post_company_id <>", value, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdGreaterThan(Integer value) {
            addCriterion("post_company_id >", value, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_company_id >=", value, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdLessThan(Integer value) {
            addCriterion("post_company_id <", value, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_company_id <=", value, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdIn(List<Integer> values) {
            addCriterion("post_company_id in", values, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdNotIn(List<Integer> values) {
            addCriterion("post_company_id not in", values, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("post_company_id between", value1, value2, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_company_id not between", value1, value2, "postCompanyId");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsIsNull() {
            addCriterion("post_user_ids is null");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsIsNotNull() {
            addCriterion("post_user_ids is not null");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsEqualTo(Integer value) {
            addCriterion("post_user_ids =", value, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsNotEqualTo(Integer value) {
            addCriterion("post_user_ids <>", value, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsGreaterThan(Integer value) {
            addCriterion("post_user_ids >", value, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_user_ids >=", value, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsLessThan(Integer value) {
            addCriterion("post_user_ids <", value, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsLessThanOrEqualTo(Integer value) {
            addCriterion("post_user_ids <=", value, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsIn(List<Integer> values) {
            addCriterion("post_user_ids in", values, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsNotIn(List<Integer> values) {
            addCriterion("post_user_ids not in", values, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsBetween(Integer value1, Integer value2) {
            addCriterion("post_user_ids between", value1, value2, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andPostUserIdsNotBetween(Integer value1, Integer value2) {
            addCriterion("post_user_ids not between", value1, value2, "postUserIds");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(String value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(String value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(String value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(String value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(String value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLike(String value) {
            addCriterion("send_time like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotLike(String value) {
            addCriterion("send_time not like", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<String> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<String> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(String value1, String value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(String value1, String value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
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