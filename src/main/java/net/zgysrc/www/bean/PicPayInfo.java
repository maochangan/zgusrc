package net.zgysrc.www.bean;

public class PicPayInfo {
    private Integer id;

    private Integer userId;

    private String userType;

    private Integer goodsId;

    private String price;

    private String createDate;

    private String tradeNo;

    private String outTradeNo;

    private String tradeStatus;

    private String cus;

    private String mailStatus;

    private String isGetGoods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public String getCus() {
        return cus;
    }

    public void setCus(String cus) {
        this.cus = cus == null ? null : cus.trim();
    }

    public String getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(String mailStatus) {
        this.mailStatus = mailStatus == null ? null : mailStatus.trim();
    }

    public String getIsGetGoods() {
        return isGetGoods;
    }

    public void setIsGetGoods(String isGetGoods) {
        this.isGetGoods = isGetGoods == null ? null : isGetGoods.trim();
    }
}