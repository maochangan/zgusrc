package net.zgysrc.www.bean;

import java.util.ArrayList;
import java.util.List;

public class SimpleUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimpleUserExample() {
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIsNull() {
            addCriterion("simple_name is null");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIsNotNull() {
            addCriterion("simple_name is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleNameEqualTo(String value) {
            addCriterion("simple_name =", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotEqualTo(String value) {
            addCriterion("simple_name <>", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameGreaterThan(String value) {
            addCriterion("simple_name >", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("simple_name >=", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLessThan(String value) {
            addCriterion("simple_name <", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("simple_name <=", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLike(String value) {
            addCriterion("simple_name like", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotLike(String value) {
            addCriterion("simple_name not like", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIn(List<String> values) {
            addCriterion("simple_name in", values, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotIn(List<String> values) {
            addCriterion("simple_name not in", values, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameBetween(String value1, String value2) {
            addCriterion("simple_name between", value1, value2, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotBetween(String value1, String value2) {
            addCriterion("simple_name not between", value1, value2, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailIsNull() {
            addCriterion("simple_email is null");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailIsNotNull() {
            addCriterion("simple_email is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailEqualTo(String value) {
            addCriterion("simple_email =", value, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailNotEqualTo(String value) {
            addCriterion("simple_email <>", value, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailGreaterThan(String value) {
            addCriterion("simple_email >", value, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailGreaterThanOrEqualTo(String value) {
            addCriterion("simple_email >=", value, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailLessThan(String value) {
            addCriterion("simple_email <", value, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailLessThanOrEqualTo(String value) {
            addCriterion("simple_email <=", value, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailLike(String value) {
            addCriterion("simple_email like", value, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailNotLike(String value) {
            addCriterion("simple_email not like", value, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailIn(List<String> values) {
            addCriterion("simple_email in", values, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailNotIn(List<String> values) {
            addCriterion("simple_email not in", values, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailBetween(String value1, String value2) {
            addCriterion("simple_email between", value1, value2, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimpleEmailNotBetween(String value1, String value2) {
            addCriterion("simple_email not between", value1, value2, "simpleEmail");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordIsNull() {
            addCriterion("simple_password is null");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordIsNotNull() {
            addCriterion("simple_password is not null");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordEqualTo(String value) {
            addCriterion("simple_password =", value, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordNotEqualTo(String value) {
            addCriterion("simple_password <>", value, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordGreaterThan(String value) {
            addCriterion("simple_password >", value, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("simple_password >=", value, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordLessThan(String value) {
            addCriterion("simple_password <", value, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordLessThanOrEqualTo(String value) {
            addCriterion("simple_password <=", value, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordLike(String value) {
            addCriterion("simple_password like", value, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordNotLike(String value) {
            addCriterion("simple_password not like", value, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordIn(List<String> values) {
            addCriterion("simple_password in", values, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordNotIn(List<String> values) {
            addCriterion("simple_password not in", values, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordBetween(String value1, String value2) {
            addCriterion("simple_password between", value1, value2, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimplePasswordNotBetween(String value1, String value2) {
            addCriterion("simple_password not between", value1, value2, "simplePassword");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeIsNull() {
            addCriterion("simple_resume is null");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeIsNotNull() {
            addCriterion("simple_resume is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeEqualTo(String value) {
            addCriterion("simple_resume =", value, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeNotEqualTo(String value) {
            addCriterion("simple_resume <>", value, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeGreaterThan(String value) {
            addCriterion("simple_resume >", value, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeGreaterThanOrEqualTo(String value) {
            addCriterion("simple_resume >=", value, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeLessThan(String value) {
            addCriterion("simple_resume <", value, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeLessThanOrEqualTo(String value) {
            addCriterion("simple_resume <=", value, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeLike(String value) {
            addCriterion("simple_resume like", value, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeNotLike(String value) {
            addCriterion("simple_resume not like", value, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeIn(List<String> values) {
            addCriterion("simple_resume in", values, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeNotIn(List<String> values) {
            addCriterion("simple_resume not in", values, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeBetween(String value1, String value2) {
            addCriterion("simple_resume between", value1, value2, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSimpleResumeNotBetween(String value1, String value2) {
            addCriterion("simple_resume not between", value1, value2, "simpleResume");
            return (Criteria) this;
        }

        public Criteria andSrIdIsNull() {
            addCriterion("sr_id is null");
            return (Criteria) this;
        }

        public Criteria andSrIdIsNotNull() {
            addCriterion("sr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrIdEqualTo(Integer value) {
            addCriterion("sr_id =", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdNotEqualTo(Integer value) {
            addCriterion("sr_id <>", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdGreaterThan(Integer value) {
            addCriterion("sr_id >", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sr_id >=", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdLessThan(Integer value) {
            addCriterion("sr_id <", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdLessThanOrEqualTo(Integer value) {
            addCriterion("sr_id <=", value, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdIn(List<Integer> values) {
            addCriterion("sr_id in", values, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdNotIn(List<Integer> values) {
            addCriterion("sr_id not in", values, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdBetween(Integer value1, Integer value2) {
            addCriterion("sr_id between", value1, value2, "srId");
            return (Criteria) this;
        }

        public Criteria andSrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sr_id not between", value1, value2, "srId");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNull() {
            addCriterion("collection is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNotNull() {
            addCriterion("collection is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionEqualTo(Integer value) {
            addCriterion("collection =", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotEqualTo(Integer value) {
            addCriterion("collection <>", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThan(Integer value) {
            addCriterion("collection >", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection >=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThan(Integer value) {
            addCriterion("collection <", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThanOrEqualTo(Integer value) {
            addCriterion("collection <=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionIn(List<Integer> values) {
            addCriterion("collection in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotIn(List<Integer> values) {
            addCriterion("collection not in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionBetween(Integer value1, Integer value2) {
            addCriterion("collection between", value1, value2, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotBetween(Integer value1, Integer value2) {
            addCriterion("collection not between", value1, value2, "collection");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNull() {
            addCriterion("img_path is null");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNotNull() {
            addCriterion("img_path is not null");
            return (Criteria) this;
        }

        public Criteria andImgPathEqualTo(String value) {
            addCriterion("img_path =", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotEqualTo(String value) {
            addCriterion("img_path <>", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThan(String value) {
            addCriterion("img_path >", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("img_path >=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThan(String value) {
            addCriterion("img_path <", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThanOrEqualTo(String value) {
            addCriterion("img_path <=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLike(String value) {
            addCriterion("img_path like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotLike(String value) {
            addCriterion("img_path not like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathIn(List<String> values) {
            addCriterion("img_path in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotIn(List<String> values) {
            addCriterion("img_path not in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathBetween(String value1, String value2) {
            addCriterion("img_path between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotBetween(String value1, String value2) {
            addCriterion("img_path not between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andResumePathIsNull() {
            addCriterion("resume_path is null");
            return (Criteria) this;
        }

        public Criteria andResumePathIsNotNull() {
            addCriterion("resume_path is not null");
            return (Criteria) this;
        }

        public Criteria andResumePathEqualTo(String value) {
            addCriterion("resume_path =", value, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathNotEqualTo(String value) {
            addCriterion("resume_path <>", value, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathGreaterThan(String value) {
            addCriterion("resume_path >", value, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathGreaterThanOrEqualTo(String value) {
            addCriterion("resume_path >=", value, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathLessThan(String value) {
            addCriterion("resume_path <", value, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathLessThanOrEqualTo(String value) {
            addCriterion("resume_path <=", value, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathLike(String value) {
            addCriterion("resume_path like", value, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathNotLike(String value) {
            addCriterion("resume_path not like", value, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathIn(List<String> values) {
            addCriterion("resume_path in", values, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathNotIn(List<String> values) {
            addCriterion("resume_path not in", values, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathBetween(String value1, String value2) {
            addCriterion("resume_path between", value1, value2, "resumePath");
            return (Criteria) this;
        }

        public Criteria andResumePathNotBetween(String value1, String value2) {
            addCriterion("resume_path not between", value1, value2, "resumePath");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("register_time like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("register_time not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNull() {
            addCriterion("vip_type is null");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNotNull() {
            addCriterion("vip_type is not null");
            return (Criteria) this;
        }

        public Criteria andVipTypeEqualTo(String value) {
            addCriterion("vip_type =", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotEqualTo(String value) {
            addCriterion("vip_type <>", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThan(String value) {
            addCriterion("vip_type >", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vip_type >=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThan(String value) {
            addCriterion("vip_type <", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThanOrEqualTo(String value) {
            addCriterion("vip_type <=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLike(String value) {
            addCriterion("vip_type like", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotLike(String value) {
            addCriterion("vip_type not like", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeIn(List<String> values) {
            addCriterion("vip_type in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotIn(List<String> values) {
            addCriterion("vip_type not in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeBetween(String value1, String value2) {
            addCriterion("vip_type between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotBetween(String value1, String value2) {
            addCriterion("vip_type not between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(String value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(String value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(String value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(String value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(String value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(String value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLike(String value) {
            addCriterion("pay_price like", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotLike(String value) {
            addCriterion("pay_price not like", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<String> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<String> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(String value1, String value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(String value1, String value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("pay_time like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("pay_time not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeIsNull() {
            addCriterion("vip_end_time is null");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeIsNotNull() {
            addCriterion("vip_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeEqualTo(String value) {
            addCriterion("vip_end_time =", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeNotEqualTo(String value) {
            addCriterion("vip_end_time <>", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeGreaterThan(String value) {
            addCriterion("vip_end_time >", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("vip_end_time >=", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeLessThan(String value) {
            addCriterion("vip_end_time <", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeLessThanOrEqualTo(String value) {
            addCriterion("vip_end_time <=", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeLike(String value) {
            addCriterion("vip_end_time like", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeNotLike(String value) {
            addCriterion("vip_end_time not like", value, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeIn(List<String> values) {
            addCriterion("vip_end_time in", values, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeNotIn(List<String> values) {
            addCriterion("vip_end_time not in", values, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeBetween(String value1, String value2) {
            addCriterion("vip_end_time between", value1, value2, "vipEndTime");
            return (Criteria) this;
        }

        public Criteria andVipEndTimeNotBetween(String value1, String value2) {
            addCriterion("vip_end_time not between", value1, value2, "vipEndTime");
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