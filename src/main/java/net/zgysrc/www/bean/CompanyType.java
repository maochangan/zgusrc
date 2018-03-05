package net.zgysrc.www.bean;

public class CompanyType {
    private Integer id;

    private String conpanyType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConpanyType() {
        return conpanyType;
    }

    public void setConpanyType(String conpanyType) {
        this.conpanyType = conpanyType == null ? null : conpanyType.trim();
    }
}