package net.zgysrc.www.bean;

public class ArtPicClassify {
    private Integer id;

    private String picClassify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicClassify() {
        return picClassify;
    }

    public void setPicClassify(String picClassify) {
        this.picClassify = picClassify == null ? null : picClassify.trim();
    }
}