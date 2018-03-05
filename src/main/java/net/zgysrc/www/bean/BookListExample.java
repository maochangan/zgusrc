package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class BookListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookListExample() {
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

        public Criteria andBookListNameIsNull() {
            addCriterion("book_list_name is null");
            return (Criteria) this;
        }

        public Criteria andBookListNameIsNotNull() {
            addCriterion("book_list_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookListNameEqualTo(String value) {
            addCriterion("book_list_name =", value, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameNotEqualTo(String value) {
            addCriterion("book_list_name <>", value, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameGreaterThan(String value) {
            addCriterion("book_list_name >", value, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_list_name >=", value, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameLessThan(String value) {
            addCriterion("book_list_name <", value, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameLessThanOrEqualTo(String value) {
            addCriterion("book_list_name <=", value, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameLike(String value) {
            addCriterion("book_list_name like", value, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameNotLike(String value) {
            addCriterion("book_list_name not like", value, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameIn(List<String> values) {
            addCriterion("book_list_name in", values, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameNotIn(List<String> values) {
            addCriterion("book_list_name not in", values, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameBetween(String value1, String value2) {
            addCriterion("book_list_name between", value1, value2, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookListNameNotBetween(String value1, String value2) {
            addCriterion("book_list_name not between", value1, value2, "bookListName");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneIsNull() {
            addCriterion("book_image_path_one is null");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneIsNotNull() {
            addCriterion("book_image_path_one is not null");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneEqualTo(String value) {
            addCriterion("book_image_path_one =", value, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneNotEqualTo(String value) {
            addCriterion("book_image_path_one <>", value, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneGreaterThan(String value) {
            addCriterion("book_image_path_one >", value, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneGreaterThanOrEqualTo(String value) {
            addCriterion("book_image_path_one >=", value, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneLessThan(String value) {
            addCriterion("book_image_path_one <", value, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneLessThanOrEqualTo(String value) {
            addCriterion("book_image_path_one <=", value, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneLike(String value) {
            addCriterion("book_image_path_one like", value, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneNotLike(String value) {
            addCriterion("book_image_path_one not like", value, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneIn(List<String> values) {
            addCriterion("book_image_path_one in", values, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneNotIn(List<String> values) {
            addCriterion("book_image_path_one not in", values, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneBetween(String value1, String value2) {
            addCriterion("book_image_path_one between", value1, value2, "bookImagePathOne");
            return (Criteria) this;
        }

        public Criteria andBookImagePathOneNotBetween(String value1, String value2) {
            addCriterion("book_image_path_one not between", value1, value2, "bookImagePathOne");
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

        public Criteria andBookClickNumIsNull() {
            addCriterion("book_click_num is null");
            return (Criteria) this;
        }

        public Criteria andBookClickNumIsNotNull() {
            addCriterion("book_click_num is not null");
            return (Criteria) this;
        }

        public Criteria andBookClickNumEqualTo(Integer value) {
            addCriterion("book_click_num =", value, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumNotEqualTo(Integer value) {
            addCriterion("book_click_num <>", value, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumGreaterThan(Integer value) {
            addCriterion("book_click_num >", value, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_click_num >=", value, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumLessThan(Integer value) {
            addCriterion("book_click_num <", value, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("book_click_num <=", value, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumIn(List<Integer> values) {
            addCriterion("book_click_num in", values, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumNotIn(List<Integer> values) {
            addCriterion("book_click_num not in", values, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumBetween(Integer value1, Integer value2) {
            addCriterion("book_click_num between", value1, value2, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andBookClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("book_click_num not between", value1, value2, "bookClickNum");
            return (Criteria) this;
        }

        public Criteria andListNumIsNull() {
            addCriterion("list_num is null");
            return (Criteria) this;
        }

        public Criteria andListNumIsNotNull() {
            addCriterion("list_num is not null");
            return (Criteria) this;
        }

        public Criteria andListNumEqualTo(Integer value) {
            addCriterion("list_num =", value, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumNotEqualTo(Integer value) {
            addCriterion("list_num <>", value, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumGreaterThan(Integer value) {
            addCriterion("list_num >", value, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_num >=", value, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumLessThan(Integer value) {
            addCriterion("list_num <", value, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumLessThanOrEqualTo(Integer value) {
            addCriterion("list_num <=", value, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumIn(List<Integer> values) {
            addCriterion("list_num in", values, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumNotIn(List<Integer> values) {
            addCriterion("list_num not in", values, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumBetween(Integer value1, Integer value2) {
            addCriterion("list_num between", value1, value2, "listNum");
            return (Criteria) this;
        }

        public Criteria andListNumNotBetween(Integer value1, Integer value2) {
            addCriterion("list_num not between", value1, value2, "listNum");
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