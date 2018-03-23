package net.zgysrc.www.bean;

public class ArtPicInfo {
    private Integer id;

    private Integer fatherId;

    private String picName;

    private String picPath;

    private String picType;

    private Integer picLikeNum;

    private String picUploadTime;

    private Integer picClickNum;

    private String picPrice;

    private String picUserName;

    private String picDescribe;

    private String sellOrNot;

    private Integer buyUserId;

    private String buyUserName;

    private String picSpec;

    private String picAc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType == null ? null : picType.trim();
    }

    public Integer getPicLikeNum() {
        return picLikeNum;
    }

    public void setPicLikeNum(Integer picLikeNum) {
        this.picLikeNum = picLikeNum;
    }

    public String getPicUploadTime() {
        return picUploadTime;
    }

    public void setPicUploadTime(String picUploadTime) {
        this.picUploadTime = picUploadTime == null ? null : picUploadTime.trim();
    }

    public Integer getPicClickNum() {
        return picClickNum;
    }

    public void setPicClickNum(Integer picClickNum) {
        this.picClickNum = picClickNum;
    }

    public String getPicPrice() {
        return picPrice;
    }

    public void setPicPrice(String picPrice) {
        this.picPrice = picPrice == null ? null : picPrice.trim();
    }

    public String getPicUserName() {
        return picUserName;
    }

    public void setPicUserName(String picUserName) {
        this.picUserName = picUserName == null ? null : picUserName.trim();
    }

    public String getPicDescribe() {
        return picDescribe;
    }

    public void setPicDescribe(String picDescribe) {
        this.picDescribe = picDescribe == null ? null : picDescribe.trim();
    }

    public String getSellOrNot() {
        return sellOrNot;
    }

    public void setSellOrNot(String sellOrNot) {
        this.sellOrNot = sellOrNot == null ? null : sellOrNot.trim();
    }

    public Integer getBuyUserId() {
        return buyUserId;
    }

    public void setBuyUserId(Integer buyUserId) {
        this.buyUserId = buyUserId;
    }

    public String getBuyUserName() {
        return buyUserName;
    }

    public void setBuyUserName(String buyUserName) {
        this.buyUserName = buyUserName == null ? null : buyUserName.trim();
    }

    public String getPicSpec() {
        return picSpec;
    }

    public void setPicSpec(String picSpec) {
        this.picSpec = picSpec == null ? null : picSpec.trim();
    }

    public String getPicAc() {
        return picAc;
    }

    public void setPicAc(String picAc) {
        this.picAc = picAc == null ? null : picAc.trim();
    }
}