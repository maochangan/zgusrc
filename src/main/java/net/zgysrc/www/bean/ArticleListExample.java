package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class ArticleListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleListExample() {
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

        public Criteria andArticleListNameIsNull() {
            addCriterion("article_list_name is null");
            return (Criteria) this;
        }

        public Criteria andArticleListNameIsNotNull() {
            addCriterion("article_list_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticleListNameEqualTo(String value) {
            addCriterion("article_list_name =", value, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameNotEqualTo(String value) {
            addCriterion("article_list_name <>", value, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameGreaterThan(String value) {
            addCriterion("article_list_name >", value, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameGreaterThanOrEqualTo(String value) {
            addCriterion("article_list_name >=", value, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameLessThan(String value) {
            addCriterion("article_list_name <", value, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameLessThanOrEqualTo(String value) {
            addCriterion("article_list_name <=", value, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameLike(String value) {
            addCriterion("article_list_name like", value, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameNotLike(String value) {
            addCriterion("article_list_name not like", value, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameIn(List<String> values) {
            addCriterion("article_list_name in", values, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameNotIn(List<String> values) {
            addCriterion("article_list_name not in", values, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameBetween(String value1, String value2) {
            addCriterion("article_list_name between", value1, value2, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListNameNotBetween(String value1, String value2) {
            addCriterion("article_list_name not between", value1, value2, "articleListName");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumIsNull() {
            addCriterion("article_list_click_num is null");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumIsNotNull() {
            addCriterion("article_list_click_num is not null");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumEqualTo(Integer value) {
            addCriterion("article_list_click_num =", value, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumNotEqualTo(Integer value) {
            addCriterion("article_list_click_num <>", value, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumGreaterThan(Integer value) {
            addCriterion("article_list_click_num >", value, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_list_click_num >=", value, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumLessThan(Integer value) {
            addCriterion("article_list_click_num <", value, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("article_list_click_num <=", value, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumIn(List<Integer> values) {
            addCriterion("article_list_click_num in", values, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumNotIn(List<Integer> values) {
            addCriterion("article_list_click_num not in", values, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumBetween(Integer value1, Integer value2) {
            addCriterion("article_list_click_num between", value1, value2, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_list_click_num not between", value1, value2, "articleListClickNum");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterIsNull() {
            addCriterion("article_list_writer is null");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterIsNotNull() {
            addCriterion("article_list_writer is not null");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterEqualTo(String value) {
            addCriterion("article_list_writer =", value, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterNotEqualTo(String value) {
            addCriterion("article_list_writer <>", value, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterGreaterThan(String value) {
            addCriterion("article_list_writer >", value, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterGreaterThanOrEqualTo(String value) {
            addCriterion("article_list_writer >=", value, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterLessThan(String value) {
            addCriterion("article_list_writer <", value, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterLessThanOrEqualTo(String value) {
            addCriterion("article_list_writer <=", value, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterLike(String value) {
            addCriterion("article_list_writer like", value, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterNotLike(String value) {
            addCriterion("article_list_writer not like", value, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterIn(List<String> values) {
            addCriterion("article_list_writer in", values, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterNotIn(List<String> values) {
            addCriterion("article_list_writer not in", values, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterBetween(String value1, String value2) {
            addCriterion("article_list_writer between", value1, value2, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListWriterNotBetween(String value1, String value2) {
            addCriterion("article_list_writer not between", value1, value2, "articleListWriter");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeIsNull() {
            addCriterion("article_list_create_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeIsNotNull() {
            addCriterion("article_list_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeEqualTo(String value) {
            addCriterion("article_list_create_time =", value, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeNotEqualTo(String value) {
            addCriterion("article_list_create_time <>", value, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeGreaterThan(String value) {
            addCriterion("article_list_create_time >", value, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("article_list_create_time >=", value, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeLessThan(String value) {
            addCriterion("article_list_create_time <", value, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("article_list_create_time <=", value, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeLike(String value) {
            addCriterion("article_list_create_time like", value, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeNotLike(String value) {
            addCriterion("article_list_create_time not like", value, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeIn(List<String> values) {
            addCriterion("article_list_create_time in", values, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeNotIn(List<String> values) {
            addCriterion("article_list_create_time not in", values, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeBetween(String value1, String value2) {
            addCriterion("article_list_create_time between", value1, value2, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListCreateTimeNotBetween(String value1, String value2) {
            addCriterion("article_list_create_time not between", value1, value2, "articleListCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdIsNull() {
            addCriterion("article_list_father_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdIsNotNull() {
            addCriterion("article_list_father_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdEqualTo(Integer value) {
            addCriterion("article_list_father_id =", value, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdNotEqualTo(Integer value) {
            addCriterion("article_list_father_id <>", value, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdGreaterThan(Integer value) {
            addCriterion("article_list_father_id >", value, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_list_father_id >=", value, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdLessThan(Integer value) {
            addCriterion("article_list_father_id <", value, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_list_father_id <=", value, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdIn(List<Integer> values) {
            addCriterion("article_list_father_id in", values, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdNotIn(List<Integer> values) {
            addCriterion("article_list_father_id not in", values, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdBetween(Integer value1, Integer value2) {
            addCriterion("article_list_father_id between", value1, value2, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleListFatherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_list_father_id not between", value1, value2, "articleListFatherId");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathIsNull() {
            addCriterion("article_Image_path is null");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathIsNotNull() {
            addCriterion("article_Image_path is not null");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathEqualTo(String value) {
            addCriterion("article_Image_path =", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathNotEqualTo(String value) {
            addCriterion("article_Image_path <>", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathGreaterThan(String value) {
            addCriterion("article_Image_path >", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("article_Image_path >=", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathLessThan(String value) {
            addCriterion("article_Image_path <", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathLessThanOrEqualTo(String value) {
            addCriterion("article_Image_path <=", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathLike(String value) {
            addCriterion("article_Image_path like", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathNotLike(String value) {
            addCriterion("article_Image_path not like", value, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathIn(List<String> values) {
            addCriterion("article_Image_path in", values, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathNotIn(List<String> values) {
            addCriterion("article_Image_path not in", values, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathBetween(String value1, String value2) {
            addCriterion("article_Image_path between", value1, value2, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleImagePathNotBetween(String value1, String value2) {
            addCriterion("article_Image_path not between", value1, value2, "articleImagePath");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameIsNull() {
            addCriterion("article_father_name is null");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameIsNotNull() {
            addCriterion("article_father_name is not null");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameEqualTo(String value) {
            addCriterion("article_father_name =", value, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameNotEqualTo(String value) {
            addCriterion("article_father_name <>", value, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameGreaterThan(String value) {
            addCriterion("article_father_name >", value, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameGreaterThanOrEqualTo(String value) {
            addCriterion("article_father_name >=", value, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameLessThan(String value) {
            addCriterion("article_father_name <", value, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameLessThanOrEqualTo(String value) {
            addCriterion("article_father_name <=", value, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameLike(String value) {
            addCriterion("article_father_name like", value, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameNotLike(String value) {
            addCriterion("article_father_name not like", value, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameIn(List<String> values) {
            addCriterion("article_father_name in", values, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameNotIn(List<String> values) {
            addCriterion("article_father_name not in", values, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameBetween(String value1, String value2) {
            addCriterion("article_father_name between", value1, value2, "articleFatherName");
            return (Criteria) this;
        }

        public Criteria andArticleFatherNameNotBetween(String value1, String value2) {
            addCriterion("article_father_name not between", value1, value2, "articleFatherName");
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