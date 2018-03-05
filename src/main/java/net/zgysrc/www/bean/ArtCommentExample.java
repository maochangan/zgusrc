package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtCommentExample() {
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

        public Criteria andFatherIdIsNull() {
            addCriterion("father_id is null");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNotNull() {
            addCriterion("father_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatherIdEqualTo(Integer value) {
            addCriterion("father_id =", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotEqualTo(Integer value) {
            addCriterion("father_id <>", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThan(Integer value) {
            addCriterion("father_id >", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("father_id >=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThan(Integer value) {
            addCriterion("father_id <", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThanOrEqualTo(Integer value) {
            addCriterion("father_id <=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdIn(List<Integer> values) {
            addCriterion("father_id in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotIn(List<Integer> values) {
            addCriterion("father_id not in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdBetween(Integer value1, Integer value2) {
            addCriterion("father_id between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("father_id not between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andCommentMessageIsNull() {
            addCriterion("comment_message is null");
            return (Criteria) this;
        }

        public Criteria andCommentMessageIsNotNull() {
            addCriterion("comment_message is not null");
            return (Criteria) this;
        }

        public Criteria andCommentMessageEqualTo(String value) {
            addCriterion("comment_message =", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageNotEqualTo(String value) {
            addCriterion("comment_message <>", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageGreaterThan(String value) {
            addCriterion("comment_message >", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageGreaterThanOrEqualTo(String value) {
            addCriterion("comment_message >=", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageLessThan(String value) {
            addCriterion("comment_message <", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageLessThanOrEqualTo(String value) {
            addCriterion("comment_message <=", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageLike(String value) {
            addCriterion("comment_message like", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageNotLike(String value) {
            addCriterion("comment_message not like", value, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageIn(List<String> values) {
            addCriterion("comment_message in", values, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageNotIn(List<String> values) {
            addCriterion("comment_message not in", values, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageBetween(String value1, String value2) {
            addCriterion("comment_message between", value1, value2, "commentMessage");
            return (Criteria) this;
        }

        public Criteria andCommentMessageNotBetween(String value1, String value2) {
            addCriterion("comment_message not between", value1, value2, "commentMessage");
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

        public Criteria andLikeNumIsNull() {
            addCriterion("like_num is null");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNotNull() {
            addCriterion("like_num is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNumEqualTo(Integer value) {
            addCriterion("like_num =", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotEqualTo(Integer value) {
            addCriterion("like_num <>", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThan(Integer value) {
            addCriterion("like_num >", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_num >=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThan(Integer value) {
            addCriterion("like_num <", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("like_num <=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIn(List<Integer> values) {
            addCriterion("like_num in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotIn(List<Integer> values) {
            addCriterion("like_num not in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("like_num between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("like_num not between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameIsNull() {
            addCriterion("simple_user_name is null");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameIsNotNull() {
            addCriterion("simple_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameEqualTo(String value) {
            addCriterion("simple_user_name =", value, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameNotEqualTo(String value) {
            addCriterion("simple_user_name <>", value, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameGreaterThan(String value) {
            addCriterion("simple_user_name >", value, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("simple_user_name >=", value, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameLessThan(String value) {
            addCriterion("simple_user_name <", value, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameLessThanOrEqualTo(String value) {
            addCriterion("simple_user_name <=", value, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameLike(String value) {
            addCriterion("simple_user_name like", value, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameNotLike(String value) {
            addCriterion("simple_user_name not like", value, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameIn(List<String> values) {
            addCriterion("simple_user_name in", values, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameNotIn(List<String> values) {
            addCriterion("simple_user_name not in", values, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameBetween(String value1, String value2) {
            addCriterion("simple_user_name between", value1, value2, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andSimpleUserNameNotBetween(String value1, String value2) {
            addCriterion("simple_user_name not between", value1, value2, "simpleUserName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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