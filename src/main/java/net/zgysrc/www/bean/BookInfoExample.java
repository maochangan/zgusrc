package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class BookInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookInfoExample() {
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

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookWriterIsNull() {
            addCriterion("book_writer is null");
            return (Criteria) this;
        }

        public Criteria andBookWriterIsNotNull() {
            addCriterion("book_writer is not null");
            return (Criteria) this;
        }

        public Criteria andBookWriterEqualTo(String value) {
            addCriterion("book_writer =", value, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterNotEqualTo(String value) {
            addCriterion("book_writer <>", value, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterGreaterThan(String value) {
            addCriterion("book_writer >", value, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterGreaterThanOrEqualTo(String value) {
            addCriterion("book_writer >=", value, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterLessThan(String value) {
            addCriterion("book_writer <", value, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterLessThanOrEqualTo(String value) {
            addCriterion("book_writer <=", value, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterLike(String value) {
            addCriterion("book_writer like", value, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterNotLike(String value) {
            addCriterion("book_writer not like", value, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterIn(List<String> values) {
            addCriterion("book_writer in", values, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterNotIn(List<String> values) {
            addCriterion("book_writer not in", values, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterBetween(String value1, String value2) {
            addCriterion("book_writer between", value1, value2, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andBookWriterNotBetween(String value1, String value2) {
            addCriterion("book_writer not between", value1, value2, "bookWriter");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIsNull() {
            addCriterion("collection_num is null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIsNotNull() {
            addCriterion("collection_num is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumEqualTo(Integer value) {
            addCriterion("collection_num =", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotEqualTo(Integer value) {
            addCriterion("collection_num <>", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumGreaterThan(Integer value) {
            addCriterion("collection_num >", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_num >=", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumLessThan(Integer value) {
            addCriterion("collection_num <", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumLessThanOrEqualTo(Integer value) {
            addCriterion("collection_num <=", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIn(List<Integer> values) {
            addCriterion("collection_num in", values, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotIn(List<Integer> values) {
            addCriterion("collection_num not in", values, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumBetween(Integer value1, Integer value2) {
            addCriterion("collection_num between", value1, value2, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_num not between", value1, value2, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andClickNumIsNull() {
            addCriterion("click_num is null");
            return (Criteria) this;
        }

        public Criteria andClickNumIsNotNull() {
            addCriterion("click_num is not null");
            return (Criteria) this;
        }

        public Criteria andClickNumEqualTo(Integer value) {
            addCriterion("click_num =", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotEqualTo(Integer value) {
            addCriterion("click_num <>", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumGreaterThan(Integer value) {
            addCriterion("click_num >", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_num >=", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumLessThan(Integer value) {
            addCriterion("click_num <", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("click_num <=", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumIn(List<Integer> values) {
            addCriterion("click_num in", values, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotIn(List<Integer> values) {
            addCriterion("click_num not in", values, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumBetween(Integer value1, Integer value2) {
            addCriterion("click_num between", value1, value2, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("click_num not between", value1, value2, "clickNum");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeIsNull() {
            addCriterion("book_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeIsNotNull() {
            addCriterion("book_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeEqualTo(String value) {
            addCriterion("book_create_time =", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeNotEqualTo(String value) {
            addCriterion("book_create_time <>", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeGreaterThan(String value) {
            addCriterion("book_create_time >", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("book_create_time >=", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeLessThan(String value) {
            addCriterion("book_create_time <", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("book_create_time <=", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeLike(String value) {
            addCriterion("book_create_time like", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeNotLike(String value) {
            addCriterion("book_create_time not like", value, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeIn(List<String> values) {
            addCriterion("book_create_time in", values, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeNotIn(List<String> values) {
            addCriterion("book_create_time not in", values, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeBetween(String value1, String value2) {
            addCriterion("book_create_time between", value1, value2, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookCreateTimeNotBetween(String value1, String value2) {
            addCriterion("book_create_time not between", value1, value2, "bookCreateTime");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathIsNull() {
            addCriterion("book_info_image_path is null");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathIsNotNull() {
            addCriterion("book_info_image_path is not null");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathEqualTo(String value) {
            addCriterion("book_info_image_path =", value, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathNotEqualTo(String value) {
            addCriterion("book_info_image_path <>", value, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathGreaterThan(String value) {
            addCriterion("book_info_image_path >", value, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("book_info_image_path >=", value, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathLessThan(String value) {
            addCriterion("book_info_image_path <", value, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathLessThanOrEqualTo(String value) {
            addCriterion("book_info_image_path <=", value, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathLike(String value) {
            addCriterion("book_info_image_path like", value, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathNotLike(String value) {
            addCriterion("book_info_image_path not like", value, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathIn(List<String> values) {
            addCriterion("book_info_image_path in", values, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathNotIn(List<String> values) {
            addCriterion("book_info_image_path not in", values, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathBetween(String value1, String value2) {
            addCriterion("book_info_image_path between", value1, value2, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andBookInfoImagePathNotBetween(String value1, String value2) {
            addCriterion("book_info_image_path not between", value1, value2, "bookInfoImagePath");
            return (Criteria) this;
        }

        public Criteria andIndexInfoIsNull() {
            addCriterion("index_info is null");
            return (Criteria) this;
        }

        public Criteria andIndexInfoIsNotNull() {
            addCriterion("index_info is not null");
            return (Criteria) this;
        }

        public Criteria andIndexInfoEqualTo(String value) {
            addCriterion("index_info =", value, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoNotEqualTo(String value) {
            addCriterion("index_info <>", value, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoGreaterThan(String value) {
            addCriterion("index_info >", value, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoGreaterThanOrEqualTo(String value) {
            addCriterion("index_info >=", value, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoLessThan(String value) {
            addCriterion("index_info <", value, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoLessThanOrEqualTo(String value) {
            addCriterion("index_info <=", value, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoLike(String value) {
            addCriterion("index_info like", value, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoNotLike(String value) {
            addCriterion("index_info not like", value, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoIn(List<String> values) {
            addCriterion("index_info in", values, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoNotIn(List<String> values) {
            addCriterion("index_info not in", values, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoBetween(String value1, String value2) {
            addCriterion("index_info between", value1, value2, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andIndexInfoNotBetween(String value1, String value2) {
            addCriterion("index_info not between", value1, value2, "indexInfo");
            return (Criteria) this;
        }

        public Criteria andBookTypeIsNull() {
            addCriterion("book_type is null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIsNotNull() {
            addCriterion("book_type is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeEqualTo(String value) {
            addCriterion("book_type =", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotEqualTo(String value) {
            addCriterion("book_type <>", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThan(String value) {
            addCriterion("book_type >", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeGreaterThanOrEqualTo(String value) {
            addCriterion("book_type >=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThan(String value) {
            addCriterion("book_type <", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLessThanOrEqualTo(String value) {
            addCriterion("book_type <=", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeLike(String value) {
            addCriterion("book_type like", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotLike(String value) {
            addCriterion("book_type not like", value, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeIn(List<String> values) {
            addCriterion("book_type in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotIn(List<String> values) {
            addCriterion("book_type not in", values, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeBetween(String value1, String value2) {
            addCriterion("book_type between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeNotBetween(String value1, String value2) {
            addCriterion("book_type not between", value1, value2, "bookType");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdIsNull() {
            addCriterion("book_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdIsNotNull() {
            addCriterion("book_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdEqualTo(Integer value) {
            addCriterion("book_type_id =", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotEqualTo(Integer value) {
            addCriterion("book_type_id <>", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdGreaterThan(Integer value) {
            addCriterion("book_type_id >", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_type_id >=", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdLessThan(Integer value) {
            addCriterion("book_type_id <", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_type_id <=", value, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdIn(List<Integer> values) {
            addCriterion("book_type_id in", values, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotIn(List<Integer> values) {
            addCriterion("book_type_id not in", values, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("book_type_id between", value1, value2, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_type_id not between", value1, value2, "bookTypeId");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(String value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(String value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(String value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(String value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(String value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(String value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLike(String value) {
            addCriterion("book_price like", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotLike(String value) {
            addCriterion("book_price not like", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<String> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<String> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(String value1, String value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(String value1, String value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
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