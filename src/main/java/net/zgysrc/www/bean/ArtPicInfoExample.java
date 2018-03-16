package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class ArtPicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtPicInfoExample() {
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

        public Criteria andPicNameIsNull() {
            addCriterion("pic_name is null");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNotNull() {
            addCriterion("pic_name is not null");
            return (Criteria) this;
        }

        public Criteria andPicNameEqualTo(String value) {
            addCriterion("pic_name =", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotEqualTo(String value) {
            addCriterion("pic_name <>", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThan(String value) {
            addCriterion("pic_name >", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("pic_name >=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThan(String value) {
            addCriterion("pic_name <", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThanOrEqualTo(String value) {
            addCriterion("pic_name <=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLike(String value) {
            addCriterion("pic_name like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotLike(String value) {
            addCriterion("pic_name not like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameIn(List<String> values) {
            addCriterion("pic_name in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotIn(List<String> values) {
            addCriterion("pic_name not in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameBetween(String value1, String value2) {
            addCriterion("pic_name between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotBetween(String value1, String value2) {
            addCriterion("pic_name not between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicPathIsNull() {
            addCriterion("pic_path is null");
            return (Criteria) this;
        }

        public Criteria andPicPathIsNotNull() {
            addCriterion("pic_path is not null");
            return (Criteria) this;
        }

        public Criteria andPicPathEqualTo(String value) {
            addCriterion("pic_path =", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotEqualTo(String value) {
            addCriterion("pic_path <>", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathGreaterThan(String value) {
            addCriterion("pic_path >", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("pic_path >=", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLessThan(String value) {
            addCriterion("pic_path <", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLessThanOrEqualTo(String value) {
            addCriterion("pic_path <=", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLike(String value) {
            addCriterion("pic_path like", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotLike(String value) {
            addCriterion("pic_path not like", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathIn(List<String> values) {
            addCriterion("pic_path in", values, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotIn(List<String> values) {
            addCriterion("pic_path not in", values, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathBetween(String value1, String value2) {
            addCriterion("pic_path between", value1, value2, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotBetween(String value1, String value2) {
            addCriterion("pic_path not between", value1, value2, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicTypeIsNull() {
            addCriterion("pic_type is null");
            return (Criteria) this;
        }

        public Criteria andPicTypeIsNotNull() {
            addCriterion("pic_type is not null");
            return (Criteria) this;
        }

        public Criteria andPicTypeEqualTo(String value) {
            addCriterion("pic_type =", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotEqualTo(String value) {
            addCriterion("pic_type <>", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeGreaterThan(String value) {
            addCriterion("pic_type >", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pic_type >=", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLessThan(String value) {
            addCriterion("pic_type <", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLessThanOrEqualTo(String value) {
            addCriterion("pic_type <=", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLike(String value) {
            addCriterion("pic_type like", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotLike(String value) {
            addCriterion("pic_type not like", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeIn(List<String> values) {
            addCriterion("pic_type in", values, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotIn(List<String> values) {
            addCriterion("pic_type not in", values, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeBetween(String value1, String value2) {
            addCriterion("pic_type between", value1, value2, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotBetween(String value1, String value2) {
            addCriterion("pic_type not between", value1, value2, "picType");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumIsNull() {
            addCriterion("pic_like_num is null");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumIsNotNull() {
            addCriterion("pic_like_num is not null");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumEqualTo(Integer value) {
            addCriterion("pic_like_num =", value, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumNotEqualTo(Integer value) {
            addCriterion("pic_like_num <>", value, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumGreaterThan(Integer value) {
            addCriterion("pic_like_num >", value, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_like_num >=", value, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumLessThan(Integer value) {
            addCriterion("pic_like_num <", value, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("pic_like_num <=", value, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumIn(List<Integer> values) {
            addCriterion("pic_like_num in", values, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumNotIn(List<Integer> values) {
            addCriterion("pic_like_num not in", values, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("pic_like_num between", value1, value2, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_like_num not between", value1, value2, "picLikeNum");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeIsNull() {
            addCriterion("pic_upload_time is null");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeIsNotNull() {
            addCriterion("pic_upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeEqualTo(String value) {
            addCriterion("pic_upload_time =", value, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeNotEqualTo(String value) {
            addCriterion("pic_upload_time <>", value, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeGreaterThan(String value) {
            addCriterion("pic_upload_time >", value, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pic_upload_time >=", value, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeLessThan(String value) {
            addCriterion("pic_upload_time <", value, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("pic_upload_time <=", value, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeLike(String value) {
            addCriterion("pic_upload_time like", value, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeNotLike(String value) {
            addCriterion("pic_upload_time not like", value, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeIn(List<String> values) {
            addCriterion("pic_upload_time in", values, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeNotIn(List<String> values) {
            addCriterion("pic_upload_time not in", values, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeBetween(String value1, String value2) {
            addCriterion("pic_upload_time between", value1, value2, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicUploadTimeNotBetween(String value1, String value2) {
            addCriterion("pic_upload_time not between", value1, value2, "picUploadTime");
            return (Criteria) this;
        }

        public Criteria andPicClickNumIsNull() {
            addCriterion("pic_click_num is null");
            return (Criteria) this;
        }

        public Criteria andPicClickNumIsNotNull() {
            addCriterion("pic_click_num is not null");
            return (Criteria) this;
        }

        public Criteria andPicClickNumEqualTo(Integer value) {
            addCriterion("pic_click_num =", value, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumNotEqualTo(Integer value) {
            addCriterion("pic_click_num <>", value, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumGreaterThan(Integer value) {
            addCriterion("pic_click_num >", value, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_click_num >=", value, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumLessThan(Integer value) {
            addCriterion("pic_click_num <", value, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("pic_click_num <=", value, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumIn(List<Integer> values) {
            addCriterion("pic_click_num in", values, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumNotIn(List<Integer> values) {
            addCriterion("pic_click_num not in", values, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumBetween(Integer value1, Integer value2) {
            addCriterion("pic_click_num between", value1, value2, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_click_num not between", value1, value2, "picClickNum");
            return (Criteria) this;
        }

        public Criteria andPicPrizeIsNull() {
            addCriterion("pic_prize is null");
            return (Criteria) this;
        }

        public Criteria andPicPrizeIsNotNull() {
            addCriterion("pic_prize is not null");
            return (Criteria) this;
        }

        public Criteria andPicPrizeEqualTo(String value) {
            addCriterion("pic_prize =", value, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeNotEqualTo(String value) {
            addCriterion("pic_prize <>", value, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeGreaterThan(String value) {
            addCriterion("pic_prize >", value, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeGreaterThanOrEqualTo(String value) {
            addCriterion("pic_prize >=", value, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeLessThan(String value) {
            addCriterion("pic_prize <", value, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeLessThanOrEqualTo(String value) {
            addCriterion("pic_prize <=", value, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeLike(String value) {
            addCriterion("pic_prize like", value, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeNotLike(String value) {
            addCriterion("pic_prize not like", value, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeIn(List<String> values) {
            addCriterion("pic_prize in", values, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeNotIn(List<String> values) {
            addCriterion("pic_prize not in", values, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeBetween(String value1, String value2) {
            addCriterion("pic_prize between", value1, value2, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicPrizeNotBetween(String value1, String value2) {
            addCriterion("pic_prize not between", value1, value2, "picPrize");
            return (Criteria) this;
        }

        public Criteria andPicUserNameIsNull() {
            addCriterion("pic_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPicUserNameIsNotNull() {
            addCriterion("pic_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPicUserNameEqualTo(String value) {
            addCriterion("pic_user_name =", value, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameNotEqualTo(String value) {
            addCriterion("pic_user_name <>", value, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameGreaterThan(String value) {
            addCriterion("pic_user_name >", value, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("pic_user_name >=", value, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameLessThan(String value) {
            addCriterion("pic_user_name <", value, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameLessThanOrEqualTo(String value) {
            addCriterion("pic_user_name <=", value, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameLike(String value) {
            addCriterion("pic_user_name like", value, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameNotLike(String value) {
            addCriterion("pic_user_name not like", value, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameIn(List<String> values) {
            addCriterion("pic_user_name in", values, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameNotIn(List<String> values) {
            addCriterion("pic_user_name not in", values, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameBetween(String value1, String value2) {
            addCriterion("pic_user_name between", value1, value2, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicUserNameNotBetween(String value1, String value2) {
            addCriterion("pic_user_name not between", value1, value2, "picUserName");
            return (Criteria) this;
        }

        public Criteria andPicDescribeIsNull() {
            addCriterion("pic_describe is null");
            return (Criteria) this;
        }

        public Criteria andPicDescribeIsNotNull() {
            addCriterion("pic_describe is not null");
            return (Criteria) this;
        }

        public Criteria andPicDescribeEqualTo(String value) {
            addCriterion("pic_describe =", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeNotEqualTo(String value) {
            addCriterion("pic_describe <>", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeGreaterThan(String value) {
            addCriterion("pic_describe >", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("pic_describe >=", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeLessThan(String value) {
            addCriterion("pic_describe <", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeLessThanOrEqualTo(String value) {
            addCriterion("pic_describe <=", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeLike(String value) {
            addCriterion("pic_describe like", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeNotLike(String value) {
            addCriterion("pic_describe not like", value, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeIn(List<String> values) {
            addCriterion("pic_describe in", values, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeNotIn(List<String> values) {
            addCriterion("pic_describe not in", values, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeBetween(String value1, String value2) {
            addCriterion("pic_describe between", value1, value2, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andPicDescribeNotBetween(String value1, String value2) {
            addCriterion("pic_describe not between", value1, value2, "picDescribe");
            return (Criteria) this;
        }

        public Criteria andSellOrNotIsNull() {
            addCriterion("sell_or_not is null");
            return (Criteria) this;
        }

        public Criteria andSellOrNotIsNotNull() {
            addCriterion("sell_or_not is not null");
            return (Criteria) this;
        }

        public Criteria andSellOrNotEqualTo(String value) {
            addCriterion("sell_or_not =", value, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotNotEqualTo(String value) {
            addCriterion("sell_or_not <>", value, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotGreaterThan(String value) {
            addCriterion("sell_or_not >", value, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotGreaterThanOrEqualTo(String value) {
            addCriterion("sell_or_not >=", value, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotLessThan(String value) {
            addCriterion("sell_or_not <", value, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotLessThanOrEqualTo(String value) {
            addCriterion("sell_or_not <=", value, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotLike(String value) {
            addCriterion("sell_or_not like", value, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotNotLike(String value) {
            addCriterion("sell_or_not not like", value, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotIn(List<String> values) {
            addCriterion("sell_or_not in", values, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotNotIn(List<String> values) {
            addCriterion("sell_or_not not in", values, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotBetween(String value1, String value2) {
            addCriterion("sell_or_not between", value1, value2, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andSellOrNotNotBetween(String value1, String value2) {
            addCriterion("sell_or_not not between", value1, value2, "sellOrNot");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdIsNull() {
            addCriterion("buy_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdIsNotNull() {
            addCriterion("buy_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdEqualTo(Integer value) {
            addCriterion("buy_user_id =", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotEqualTo(Integer value) {
            addCriterion("buy_user_id <>", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdGreaterThan(Integer value) {
            addCriterion("buy_user_id >", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_user_id >=", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdLessThan(Integer value) {
            addCriterion("buy_user_id <", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("buy_user_id <=", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdIn(List<Integer> values) {
            addCriterion("buy_user_id in", values, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotIn(List<Integer> values) {
            addCriterion("buy_user_id not in", values, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("buy_user_id between", value1, value2, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_user_id not between", value1, value2, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameIsNull() {
            addCriterion("buy_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameIsNotNull() {
            addCriterion("buy_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameEqualTo(String value) {
            addCriterion("buy_user_name =", value, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameNotEqualTo(String value) {
            addCriterion("buy_user_name <>", value, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameGreaterThan(String value) {
            addCriterion("buy_user_name >", value, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("buy_user_name >=", value, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameLessThan(String value) {
            addCriterion("buy_user_name <", value, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameLessThanOrEqualTo(String value) {
            addCriterion("buy_user_name <=", value, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameLike(String value) {
            addCriterion("buy_user_name like", value, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameNotLike(String value) {
            addCriterion("buy_user_name not like", value, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameIn(List<String> values) {
            addCriterion("buy_user_name in", values, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameNotIn(List<String> values) {
            addCriterion("buy_user_name not in", values, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameBetween(String value1, String value2) {
            addCriterion("buy_user_name between", value1, value2, "buyUserName");
            return (Criteria) this;
        }

        public Criteria andBuyUserNameNotBetween(String value1, String value2) {
            addCriterion("buy_user_name not between", value1, value2, "buyUserName");
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

        public Criteria andPicClassifyIdEqualTo(Integer value) {
            addCriterion("pic_classify_id =", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdNotEqualTo(Integer value) {
            addCriterion("pic_classify_id <>", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdGreaterThan(Integer value) {
            addCriterion("pic_classify_id >", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_classify_id >=", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdLessThan(Integer value) {
            addCriterion("pic_classify_id <", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("pic_classify_id <=", value, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdIn(List<Integer> values) {
            addCriterion("pic_classify_id in", values, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdNotIn(List<Integer> values) {
            addCriterion("pic_classify_id not in", values, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("pic_classify_id between", value1, value2, "picClassifyId");
            return (Criteria) this;
        }

        public Criteria andPicClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_classify_id not between", value1, value2, "picClassifyId");
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