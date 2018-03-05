package net.zgysrc.www.bean;

public class SimplePrice {
    private Integer id;

    private String simpleVipType;

    private String simpleVipPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSimpleVipType() {
        return simpleVipType;
    }

    public void setSimpleVipType(String simpleVipType) {
        this.simpleVipType = simpleVipType == null ? null : simpleVipType.trim();
    }

    public String getSimpleVipPrice() {
        return simpleVipPrice;
    }

    public void setSimpleVipPrice(String simpleVipPrice) {
        this.simpleVipPrice = simpleVipPrice == null ? null : simpleVipPrice.trim();
    }
}