package net.zgysrc.www.bean;

public class ArtGallery {
    private Integer id;

    private String artGalleryName;

    private String artGalleryImgPath;

    private Integer click;

    private String studioName;

    private Integer likeNum;

    private String indexInfo;

    private String artAddress;

    private String artSell;

    private String artInfo;

    private String artDate;

    private String artTime;

    private String picClassify;

    private String picClassifyId;

    private String picTypeAnother;

    private Integer userId;

    private String userAc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtGalleryName() {
        return artGalleryName;
    }

    public void setArtGalleryName(String artGalleryName) {
        this.artGalleryName = artGalleryName == null ? null : artGalleryName.trim();
    }

    public String getArtGalleryImgPath() {
        return artGalleryImgPath;
    }

    public void setArtGalleryImgPath(String artGalleryImgPath) {
        this.artGalleryImgPath = artGalleryImgPath == null ? null : artGalleryImgPath.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName == null ? null : studioName.trim();
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public String getIndexInfo() {
        return indexInfo;
    }

    public void setIndexInfo(String indexInfo) {
        this.indexInfo = indexInfo == null ? null : indexInfo.trim();
    }

    public String getArtAddress() {
        return artAddress;
    }

    public void setArtAddress(String artAddress) {
        this.artAddress = artAddress == null ? null : artAddress.trim();
    }

    public String getArtSell() {
        return artSell;
    }

    public void setArtSell(String artSell) {
        this.artSell = artSell == null ? null : artSell.trim();
    }

    public String getArtInfo() {
        return artInfo;
    }

    public void setArtInfo(String artInfo) {
        this.artInfo = artInfo == null ? null : artInfo.trim();
    }

    public String getArtDate() {
        return artDate;
    }

    public void setArtDate(String artDate) {
        this.artDate = artDate == null ? null : artDate.trim();
    }

    public String getArtTime() {
        return artTime;
    }

    public void setArtTime(String artTime) {
        this.artTime = artTime == null ? null : artTime.trim();
    }

    public String getPicClassify() {
        return picClassify;
    }

    public void setPicClassify(String picClassify) {
        this.picClassify = picClassify == null ? null : picClassify.trim();
    }

    public String getPicClassifyId() {
        return picClassifyId;
    }

    public void setPicClassifyId(String picClassifyId) {
        this.picClassifyId = picClassifyId == null ? null : picClassifyId.trim();
    }

    public String getPicTypeAnother() {
        return picTypeAnother;
    }

    public void setPicTypeAnother(String picTypeAnother) {
        this.picTypeAnother = picTypeAnother == null ? null : picTypeAnother.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAc() {
        return userAc;
    }

    public void setUserAc(String userAc) {
        this.userAc = userAc == null ? null : userAc.trim();
    }
}