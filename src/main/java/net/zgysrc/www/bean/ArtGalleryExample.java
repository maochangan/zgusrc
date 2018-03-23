package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class ArtGalleryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtGalleryExample() {
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

        public Criteria andArtGalleryNameIsNull() {
            addCriterion("art_gallery_name is null");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameIsNotNull() {
            addCriterion("art_gallery_name is not null");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameEqualTo(String value) {
            addCriterion("art_gallery_name =", value, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameNotEqualTo(String value) {
            addCriterion("art_gallery_name <>", value, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameGreaterThan(String value) {
            addCriterion("art_gallery_name >", value, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameGreaterThanOrEqualTo(String value) {
            addCriterion("art_gallery_name >=", value, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameLessThan(String value) {
            addCriterion("art_gallery_name <", value, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameLessThanOrEqualTo(String value) {
            addCriterion("art_gallery_name <=", value, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameLike(String value) {
            addCriterion("art_gallery_name like", value, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameNotLike(String value) {
            addCriterion("art_gallery_name not like", value, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameIn(List<String> values) {
            addCriterion("art_gallery_name in", values, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameNotIn(List<String> values) {
            addCriterion("art_gallery_name not in", values, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameBetween(String value1, String value2) {
            addCriterion("art_gallery_name between", value1, value2, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryNameNotBetween(String value1, String value2) {
            addCriterion("art_gallery_name not between", value1, value2, "artGalleryName");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathIsNull() {
            addCriterion("art_gallery_img_path is null");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathIsNotNull() {
            addCriterion("art_gallery_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathEqualTo(String value) {
            addCriterion("art_gallery_img_path =", value, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathNotEqualTo(String value) {
            addCriterion("art_gallery_img_path <>", value, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathGreaterThan(String value) {
            addCriterion("art_gallery_img_path >", value, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("art_gallery_img_path >=", value, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathLessThan(String value) {
            addCriterion("art_gallery_img_path <", value, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathLessThanOrEqualTo(String value) {
            addCriterion("art_gallery_img_path <=", value, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathLike(String value) {
            addCriterion("art_gallery_img_path like", value, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathNotLike(String value) {
            addCriterion("art_gallery_img_path not like", value, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathIn(List<String> values) {
            addCriterion("art_gallery_img_path in", values, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathNotIn(List<String> values) {
            addCriterion("art_gallery_img_path not in", values, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathBetween(String value1, String value2) {
            addCriterion("art_gallery_img_path between", value1, value2, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andArtGalleryImgPathNotBetween(String value1, String value2) {
            addCriterion("art_gallery_img_path not between", value1, value2, "artGalleryImgPath");
            return (Criteria) this;
        }

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andStudioNameIsNull() {
            addCriterion("studio_name is null");
            return (Criteria) this;
        }

        public Criteria andStudioNameIsNotNull() {
            addCriterion("studio_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudioNameEqualTo(String value) {
            addCriterion("studio_name =", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotEqualTo(String value) {
            addCriterion("studio_name <>", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameGreaterThan(String value) {
            addCriterion("studio_name >", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameGreaterThanOrEqualTo(String value) {
            addCriterion("studio_name >=", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLessThan(String value) {
            addCriterion("studio_name <", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLessThanOrEqualTo(String value) {
            addCriterion("studio_name <=", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameLike(String value) {
            addCriterion("studio_name like", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotLike(String value) {
            addCriterion("studio_name not like", value, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameIn(List<String> values) {
            addCriterion("studio_name in", values, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotIn(List<String> values) {
            addCriterion("studio_name not in", values, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameBetween(String value1, String value2) {
            addCriterion("studio_name between", value1, value2, "studioName");
            return (Criteria) this;
        }

        public Criteria andStudioNameNotBetween(String value1, String value2) {
            addCriterion("studio_name not between", value1, value2, "studioName");
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

        public Criteria andArtAddressIsNull() {
            addCriterion("art_address is null");
            return (Criteria) this;
        }

        public Criteria andArtAddressIsNotNull() {
            addCriterion("art_address is not null");
            return (Criteria) this;
        }

        public Criteria andArtAddressEqualTo(String value) {
            addCriterion("art_address =", value, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressNotEqualTo(String value) {
            addCriterion("art_address <>", value, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressGreaterThan(String value) {
            addCriterion("art_address >", value, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressGreaterThanOrEqualTo(String value) {
            addCriterion("art_address >=", value, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressLessThan(String value) {
            addCriterion("art_address <", value, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressLessThanOrEqualTo(String value) {
            addCriterion("art_address <=", value, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressLike(String value) {
            addCriterion("art_address like", value, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressNotLike(String value) {
            addCriterion("art_address not like", value, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressIn(List<String> values) {
            addCriterion("art_address in", values, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressNotIn(List<String> values) {
            addCriterion("art_address not in", values, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressBetween(String value1, String value2) {
            addCriterion("art_address between", value1, value2, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtAddressNotBetween(String value1, String value2) {
            addCriterion("art_address not between", value1, value2, "artAddress");
            return (Criteria) this;
        }

        public Criteria andArtSellIsNull() {
            addCriterion("art_sell is null");
            return (Criteria) this;
        }

        public Criteria andArtSellIsNotNull() {
            addCriterion("art_sell is not null");
            return (Criteria) this;
        }

        public Criteria andArtSellEqualTo(String value) {
            addCriterion("art_sell =", value, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellNotEqualTo(String value) {
            addCriterion("art_sell <>", value, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellGreaterThan(String value) {
            addCriterion("art_sell >", value, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellGreaterThanOrEqualTo(String value) {
            addCriterion("art_sell >=", value, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellLessThan(String value) {
            addCriterion("art_sell <", value, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellLessThanOrEqualTo(String value) {
            addCriterion("art_sell <=", value, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellLike(String value) {
            addCriterion("art_sell like", value, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellNotLike(String value) {
            addCriterion("art_sell not like", value, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellIn(List<String> values) {
            addCriterion("art_sell in", values, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellNotIn(List<String> values) {
            addCriterion("art_sell not in", values, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellBetween(String value1, String value2) {
            addCriterion("art_sell between", value1, value2, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtSellNotBetween(String value1, String value2) {
            addCriterion("art_sell not between", value1, value2, "artSell");
            return (Criteria) this;
        }

        public Criteria andArtInfoIsNull() {
            addCriterion("art_info is null");
            return (Criteria) this;
        }

        public Criteria andArtInfoIsNotNull() {
            addCriterion("art_info is not null");
            return (Criteria) this;
        }

        public Criteria andArtInfoEqualTo(String value) {
            addCriterion("art_info =", value, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoNotEqualTo(String value) {
            addCriterion("art_info <>", value, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoGreaterThan(String value) {
            addCriterion("art_info >", value, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoGreaterThanOrEqualTo(String value) {
            addCriterion("art_info >=", value, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoLessThan(String value) {
            addCriterion("art_info <", value, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoLessThanOrEqualTo(String value) {
            addCriterion("art_info <=", value, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoLike(String value) {
            addCriterion("art_info like", value, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoNotLike(String value) {
            addCriterion("art_info not like", value, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoIn(List<String> values) {
            addCriterion("art_info in", values, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoNotIn(List<String> values) {
            addCriterion("art_info not in", values, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoBetween(String value1, String value2) {
            addCriterion("art_info between", value1, value2, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtInfoNotBetween(String value1, String value2) {
            addCriterion("art_info not between", value1, value2, "artInfo");
            return (Criteria) this;
        }

        public Criteria andArtDateIsNull() {
            addCriterion("art_date is null");
            return (Criteria) this;
        }

        public Criteria andArtDateIsNotNull() {
            addCriterion("art_date is not null");
            return (Criteria) this;
        }

        public Criteria andArtDateEqualTo(String value) {
            addCriterion("art_date =", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateNotEqualTo(String value) {
            addCriterion("art_date <>", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateGreaterThan(String value) {
            addCriterion("art_date >", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateGreaterThanOrEqualTo(String value) {
            addCriterion("art_date >=", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateLessThan(String value) {
            addCriterion("art_date <", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateLessThanOrEqualTo(String value) {
            addCriterion("art_date <=", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateLike(String value) {
            addCriterion("art_date like", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateNotLike(String value) {
            addCriterion("art_date not like", value, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateIn(List<String> values) {
            addCriterion("art_date in", values, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateNotIn(List<String> values) {
            addCriterion("art_date not in", values, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateBetween(String value1, String value2) {
            addCriterion("art_date between", value1, value2, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtDateNotBetween(String value1, String value2) {
            addCriterion("art_date not between", value1, value2, "artDate");
            return (Criteria) this;
        }

        public Criteria andArtTimeIsNull() {
            addCriterion("art_time is null");
            return (Criteria) this;
        }

        public Criteria andArtTimeIsNotNull() {
            addCriterion("art_time is not null");
            return (Criteria) this;
        }

        public Criteria andArtTimeEqualTo(String value) {
            addCriterion("art_time =", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeNotEqualTo(String value) {
            addCriterion("art_time <>", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeGreaterThan(String value) {
            addCriterion("art_time >", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeGreaterThanOrEqualTo(String value) {
            addCriterion("art_time >=", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeLessThan(String value) {
            addCriterion("art_time <", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeLessThanOrEqualTo(String value) {
            addCriterion("art_time <=", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeLike(String value) {
            addCriterion("art_time like", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeNotLike(String value) {
            addCriterion("art_time not like", value, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeIn(List<String> values) {
            addCriterion("art_time in", values, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeNotIn(List<String> values) {
            addCriterion("art_time not in", values, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeBetween(String value1, String value2) {
            addCriterion("art_time between", value1, value2, "artTime");
            return (Criteria) this;
        }

        public Criteria andArtTimeNotBetween(String value1, String value2) {
            addCriterion("art_time not between", value1, value2, "artTime");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIsNull() {
            addCriterion("pic_classify is null");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIsNotNull() {
            addCriterion("pic_classify is not null");
            return (Criteria) this;
        }

        public Criteria andPicClassifyEqualTo(String value) {
            addCriterion("pic_classify =", value, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyNotEqualTo(String value) {
            addCriterion("pic_classify <>", value, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyGreaterThan(String value) {
            addCriterion("pic_classify >", value, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("pic_classify >=", value, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyLessThan(String value) {
            addCriterion("pic_classify <", value, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyLessThanOrEqualTo(String value) {
            addCriterion("pic_classify <=", value, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyLike(String value) {
            addCriterion("pic_classify like", value, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyNotLike(String value) {
            addCriterion("pic_classify not like", value, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIn(List<String> values) {
            addCriterion("pic_classify in", values, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyNotIn(List<String> values) {
            addCriterion("pic_classify not in", values, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyBetween(String value1, String value2) {
            addCriterion("pic_classify between", value1, value2, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyNotBetween(String value1, String value2) {
            addCriterion("pic_classify not between", value1, value2, "picClassify");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdIsNull() {
            addCriterion("pic_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdIsNotNull() {
            addCriterion("pic_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdEqualTo(String value) {
            addCriterion("pic_classify_id =", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdNotEqualTo(String value) {
            addCriterion("pic_classify_id <>", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdGreaterThan(String value) {
            addCriterion("pic_classify_id >", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("pic_classify_id >=", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdLessThan(String value) {
            addCriterion("pic_classify_id <", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdLessThanOrEqualTo(String value) {
            addCriterion("pic_classify_id <=", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdLike(String value) {
            addCriterion("pic_classify_id like", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdNotLike(String value) {
            addCriterion("pic_classify_id not like", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdIn(List<String> values) {
            addCriterion("pic_classify_id in", values, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdNotIn(List<String> values) {
            addCriterion("pic_classify_id not in", values, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdBetween(String value1, String value2) {
            addCriterion("pic_classify_id between", value1, value2, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdNotBetween(String value1, String value2) {
            addCriterion("pic_classify_id not between", value1, value2, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherIsNull() {
            addCriterion("pic_type_another is null");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherIsNotNull() {
            addCriterion("pic_type_another is not null");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherEqualTo(String value) {
            addCriterion("pic_type_another =", value, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherNotEqualTo(String value) {
            addCriterion("pic_type_another <>", value, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherGreaterThan(String value) {
            addCriterion("pic_type_another >", value, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherGreaterThanOrEqualTo(String value) {
            addCriterion("pic_type_another >=", value, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherLessThan(String value) {
            addCriterion("pic_type_another <", value, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherLessThanOrEqualTo(String value) {
            addCriterion("pic_type_another <=", value, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherLike(String value) {
            addCriterion("pic_type_another like", value, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherNotLike(String value) {
            addCriterion("pic_type_another not like", value, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherIn(List<String> values) {
            addCriterion("pic_type_another in", values, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherNotIn(List<String> values) {
            addCriterion("pic_type_another not in", values, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherBetween(String value1, String value2) {
            addCriterion("pic_type_another between", value1, value2, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andPicTypeAnotherNotBetween(String value1, String value2) {
            addCriterion("pic_type_another not between", value1, value2, "picTypeAnother");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserAcIsNull() {
            addCriterion("user_ac is null");
            return (Criteria) this;
        }

        public Criteria andUserAcIsNotNull() {
            addCriterion("user_ac is not null");
            return (Criteria) this;
        }

        public Criteria andUserAcEqualTo(String value) {
            addCriterion("user_ac =", value, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcNotEqualTo(String value) {
            addCriterion("user_ac <>", value, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcGreaterThan(String value) {
            addCriterion("user_ac >", value, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcGreaterThanOrEqualTo(String value) {
            addCriterion("user_ac >=", value, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcLessThan(String value) {
            addCriterion("user_ac <", value, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcLessThanOrEqualTo(String value) {
            addCriterion("user_ac <=", value, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcLike(String value) {
            addCriterion("user_ac like", value, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcNotLike(String value) {
            addCriterion("user_ac not like", value, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcIn(List<String> values) {
            addCriterion("user_ac in", values, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcNotIn(List<String> values) {
            addCriterion("user_ac not in", values, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcBetween(String value1, String value2) {
            addCriterion("user_ac between", value1, value2, "userAc");
            return (Criteria) this;
        }

        public Criteria andUserAcNotBetween(String value1, String value2) {
            addCriterion("user_ac not between", value1, value2, "userAc");
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