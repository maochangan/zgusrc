package net.zgysrc.www.bean;

public class SimpleUser {
    private Integer id;

    private String mobile;

    private String simpleName;

    private String simpleEmail;

    private String simplePassword;

    private String simpleResume;

    private Integer srId;

    private Integer collection;

    private String imgPath;

    private String resumePath;

    private String registerTime;

    private String sex;

    private String age;

    private String vipType;

    private String payPrice;

    private String payTime;

    private String vipEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    public String getSimpleEmail() {
        return simpleEmail;
    }

    public void setSimpleEmail(String simpleEmail) {
        this.simpleEmail = simpleEmail == null ? null : simpleEmail.trim();
    }

    public String getSimplePassword() {
        return simplePassword;
    }

    public void setSimplePassword(String simplePassword) {
        this.simplePassword = simplePassword == null ? null : simplePassword.trim();
    }

    public String getSimpleResume() {
        return simpleResume;
    }

    public void setSimpleResume(String simpleResume) {
        this.simpleResume = simpleResume == null ? null : simpleResume.trim();
    }

    public Integer getSrId() {
        return srId;
    }

    public void setSrId(Integer srId) {
        this.srId = srId;
    }

    public Integer getCollection() {
        return collection;
    }

    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getResumePath() {
        return resumePath;
    }

    public void setResumePath(String resumePath) {
        this.resumePath = resumePath == null ? null : resumePath.trim();
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType == null ? null : vipType.trim();
    }

    public String getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(String payPrice) {
        this.payPrice = payPrice == null ? null : payPrice.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getVipEndTime() {
        return vipEndTime;
    }

    public void setVipEndTime(String vipEndTime) {
        this.vipEndTime = vipEndTime == null ? null : vipEndTime.trim();
    }
}