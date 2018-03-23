package net.zgysrc.www.bean;

public class UserReceivingAddress {
    private Integer id;

    private Integer userId;

    private String userAddress;

    private String userTelephone;

    private String userName;

    private String isProvideInvoice;

    private Integer goodsId;

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

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone == null ? null : userTelephone.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getIsProvideInvoice() {
        return isProvideInvoice;
    }

    public void setIsProvideInvoice(String isProvideInvoice) {
        this.isProvideInvoice = isProvideInvoice == null ? null : isProvideInvoice.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}