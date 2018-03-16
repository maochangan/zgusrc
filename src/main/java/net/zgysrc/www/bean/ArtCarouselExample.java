package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class ArtCarouselExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtCarouselExample() {
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

        public Criteria andArtCarouselImgPathIsNull() {
            addCriterion("art_carousel_img_path is null");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathIsNotNull() {
            addCriterion("art_carousel_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathEqualTo(String value) {
            addCriterion("art_carousel_img_path =", value, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathNotEqualTo(String value) {
            addCriterion("art_carousel_img_path <>", value, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathGreaterThan(String value) {
            addCriterion("art_carousel_img_path >", value, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("art_carousel_img_path >=", value, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathLessThan(String value) {
            addCriterion("art_carousel_img_path <", value, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathLessThanOrEqualTo(String value) {
            addCriterion("art_carousel_img_path <=", value, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathLike(String value) {
            addCriterion("art_carousel_img_path like", value, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathNotLike(String value) {
            addCriterion("art_carousel_img_path not like", value, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathIn(List<String> values) {
            addCriterion("art_carousel_img_path in", values, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathNotIn(List<String> values) {
            addCriterion("art_carousel_img_path not in", values, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathBetween(String value1, String value2) {
            addCriterion("art_carousel_img_path between", value1, value2, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselImgPathNotBetween(String value1, String value2) {
            addCriterion("art_carousel_img_path not between", value1, value2, "artCarouselImgPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathIsNull() {
            addCriterion("art_carousel_link_path is null");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathIsNotNull() {
            addCriterion("art_carousel_link_path is not null");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathEqualTo(String value) {
            addCriterion("art_carousel_link_path =", value, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathNotEqualTo(String value) {
            addCriterion("art_carousel_link_path <>", value, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathGreaterThan(String value) {
            addCriterion("art_carousel_link_path >", value, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathGreaterThanOrEqualTo(String value) {
            addCriterion("art_carousel_link_path >=", value, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathLessThan(String value) {
            addCriterion("art_carousel_link_path <", value, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathLessThanOrEqualTo(String value) {
            addCriterion("art_carousel_link_path <=", value, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathLike(String value) {
            addCriterion("art_carousel_link_path like", value, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathNotLike(String value) {
            addCriterion("art_carousel_link_path not like", value, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathIn(List<String> values) {
            addCriterion("art_carousel_link_path in", values, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathNotIn(List<String> values) {
            addCriterion("art_carousel_link_path not in", values, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathBetween(String value1, String value2) {
            addCriterion("art_carousel_link_path between", value1, value2, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselLinkPathNotBetween(String value1, String value2) {
            addCriterion("art_carousel_link_path not between", value1, value2, "artCarouselLinkPath");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeIsNull() {
            addCriterion("art_carousel_type is null");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeIsNotNull() {
            addCriterion("art_carousel_type is not null");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeEqualTo(Integer value) {
            addCriterion("art_carousel_type =", value, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeNotEqualTo(Integer value) {
            addCriterion("art_carousel_type <>", value, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeGreaterThan(Integer value) {
            addCriterion("art_carousel_type >", value, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_carousel_type >=", value, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeLessThan(Integer value) {
            addCriterion("art_carousel_type <", value, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeLessThanOrEqualTo(Integer value) {
            addCriterion("art_carousel_type <=", value, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeIn(List<Integer> values) {
            addCriterion("art_carousel_type in", values, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeNotIn(List<Integer> values) {
            addCriterion("art_carousel_type not in", values, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeBetween(Integer value1, Integer value2) {
            addCriterion("art_carousel_type between", value1, value2, "artCarouselType");
            return (Criteria) this;
        }

        public Criteria andArtCarouselTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("art_carousel_type not between", value1, value2, "artCarouselType");
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