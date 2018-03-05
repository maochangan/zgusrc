package net.zgysrc.www.bean;

public class CompanyVip {
    private Integer id;

    private String companyVipType;

    private String companyVipPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyVipType() {
        return companyVipType;
    }

    public void setCompanyVipType(String companyVipType) {
        this.companyVipType = companyVipType == null ? null : companyVipType.trim();
    }

    public String getCompanyVipPrice() {
        return companyVipPrice;
    }

    public void setCompanyVipPrice(String companyVipPrice) {
        this.companyVipPrice = companyVipPrice == null ? null : companyVipPrice.trim();
    }
}