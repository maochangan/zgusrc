package net.zgysrc.www.bean;

public class IndustryCategory {
    private Integer id;

    private String industryCategory;

    private Integer child;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustryCategory() {
        return industryCategory;
    }

    public void setIndustryCategory(String industryCategory) {
        this.industryCategory = industryCategory == null ? null : industryCategory.trim();
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }
}