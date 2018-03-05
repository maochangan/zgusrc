package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleNameIsNull() {
            addCriterion("article_name is null");
            return (Criteria) this;
        }

        public Criteria andArticleNameIsNotNull() {
            addCriterion("article_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNameEqualTo(String value) {
            addCriterion("article_name =", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotEqualTo(String value) {
            addCriterion("article_name <>", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThan(String value) {
            addCriterion("article_name >", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameGreaterThanOrEqualTo(String value) {
            addCriterion("article_name >=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThan(String value) {
            addCriterion("article_name <", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLessThanOrEqualTo(String value) {
            addCriterion("article_name <=", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameLike(String value) {
            addCriterion("article_name like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotLike(String value) {
            addCriterion("article_name not like", value, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameIn(List<String> values) {
            addCriterion("article_name in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotIn(List<String> values) {
            addCriterion("article_name not in", values, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameBetween(String value1, String value2) {
            addCriterion("article_name between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleNameNotBetween(String value1, String value2) {
            addCriterion("article_name not between", value1, value2, "articleName");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumIsNull() {
            addCriterion("article_click_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumIsNotNull() {
            addCriterion("article_click_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumEqualTo(Integer value) {
            addCriterion("article_click_num =", value, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumNotEqualTo(Integer value) {
            addCriterion("article_click_num <>", value, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumGreaterThan(Integer value) {
            addCriterion("article_click_num >", value, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_click_num >=", value, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumLessThan(Integer value) {
            addCriterion("article_click_num <", value, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_click_num <=", value, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumIn(List<Integer> values) {
            addCriterion("article_click_num in", values, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumNotIn(List<Integer> values) {
            addCriterion("article_click_num not in", values, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumBetween(Integer value1, Integer value2) {
            addCriterion("article_click_num between", value1, value2, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_click_num not between", value1, value2, "articleClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumIsNull() {
            addCriterion("article_like_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumIsNotNull() {
            addCriterion("article_like_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumEqualTo(Integer value) {
            addCriterion("article_like_num =", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumNotEqualTo(Integer value) {
            addCriterion("article_like_num <>", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumGreaterThan(Integer value) {
            addCriterion("article_like_num >", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_like_num >=", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumLessThan(Integer value) {
            addCriterion("article_like_num <", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_like_num <=", value, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumIn(List<Integer> values) {
            addCriterion("article_like_num in", values, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumNotIn(List<Integer> values) {
            addCriterion("article_like_num not in", values, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("article_like_num between", value1, value2, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_like_num not between", value1, value2, "articleLikeNum");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNull() {
            addCriterion("article_type is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNotNull() {
            addCriterion("article_type is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeEqualTo(String value) {
            addCriterion("article_type =", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotEqualTo(String value) {
            addCriterion("article_type <>", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThan(String value) {
            addCriterion("article_type >", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("article_type >=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThan(String value) {
            addCriterion("article_type <", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThanOrEqualTo(String value) {
            addCriterion("article_type <=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLike(String value) {
            addCriterion("article_type like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotLike(String value) {
            addCriterion("article_type not like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIn(List<String> values) {
            addCriterion("article_type in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotIn(List<String> values) {
            addCriterion("article_type not in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeBetween(String value1, String value2) {
            addCriterion("article_type between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotBetween(String value1, String value2) {
            addCriterion("article_type not between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIsNull() {
            addCriterion("article_create_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIsNotNull() {
            addCriterion("article_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeEqualTo(String value) {
            addCriterion("article_create_time =", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotEqualTo(String value) {
            addCriterion("article_create_time <>", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeGreaterThan(String value) {
            addCriterion("article_create_time >", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("article_create_time >=", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeLessThan(String value) {
            addCriterion("article_create_time <", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("article_create_time <=", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeLike(String value) {
            addCriterion("article_create_time like", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotLike(String value) {
            addCriterion("article_create_time not like", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIn(List<String> values) {
            addCriterion("article_create_time in", values, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotIn(List<String> values) {
            addCriterion("article_create_time not in", values, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeBetween(String value1, String value2) {
            addCriterion("article_create_time between", value1, value2, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotBetween(String value1, String value2) {
            addCriterion("article_create_time not between", value1, value2, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathIsNull() {
            addCriterion("article_image_path is null");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathIsNotNull() {
            addCriterion("article_image_path is not null");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathEqualTo(String value) {
            addCriterion("article_image_path =", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathNotEqualTo(String value) {
            addCriterion("article_image_path <>", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathGreaterThan(String value) {
            addCriterion("article_image_path >", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("article_image_path >=", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathLessThan(String value) {
            addCriterion("article_image_path <", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathLessThanOrEqualTo(String value) {
            addCriterion("article_image_path <=", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathLike(String value) {
            addCriterion("article_image_path like", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathNotLike(String value) {
            addCriterion("article_image_path not like", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathIn(List<String> values) {
            addCriterion("article_image_path in", values, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathNotIn(List<String> values) {
            addCriterion("article_image_path not in", values, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathBetween(String value1, String value2) {
            addCriterion("article_image_path between", value1, value2, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathNotBetween(String value1, String value2) {
            addCriterion("article_image_path not between", value1, value2, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andIconPathIsNull() {
            addCriterion("icon_path is null");
            return (Criteria) this;
        }

        public Criteria andIconPathIsNotNull() {
            addCriterion("icon_path is not null");
            return (Criteria) this;
        }

        public Criteria andIconPathEqualTo(String value) {
            addCriterion("icon_path =", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotEqualTo(String value) {
            addCriterion("icon_path <>", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathGreaterThan(String value) {
            addCriterion("icon_path >", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathGreaterThanOrEqualTo(String value) {
            addCriterion("icon_path >=", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLessThan(String value) {
            addCriterion("icon_path <", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLessThanOrEqualTo(String value) {
            addCriterion("icon_path <=", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathLike(String value) {
            addCriterion("icon_path like", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotLike(String value) {
            addCriterion("icon_path not like", value, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathIn(List<String> values) {
            addCriterion("icon_path in", values, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotIn(List<String> values) {
            addCriterion("icon_path not in", values, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathBetween(String value1, String value2) {
            addCriterion("icon_path between", value1, value2, "iconPath");
            return (Criteria) this;
        }

        public Criteria andIconPathNotBetween(String value1, String value2) {
            addCriterion("icon_path not between", value1, value2, "iconPath");
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