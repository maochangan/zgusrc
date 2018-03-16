package net.zgysrc.www.bean;

public class ArtCarousel {
    private Integer id;

    private String artCarouselImgPath;

    private String artCarouselLinkPath;

    private Integer artCarouselType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtCarouselImgPath() {
        return artCarouselImgPath;
    }

    public void setArtCarouselImgPath(String artCarouselImgPath) {
        this.artCarouselImgPath = artCarouselImgPath == null ? null : artCarouselImgPath.trim();
    }

    public String getArtCarouselLinkPath() {
        return artCarouselLinkPath;
    }

    public void setArtCarouselLinkPath(String artCarouselLinkPath) {
        this.artCarouselLinkPath = artCarouselLinkPath == null ? null : artCarouselLinkPath.trim();
    }

    public Integer getArtCarouselType() {
        return artCarouselType;
    }

    public void setArtCarouselType(Integer artCarouselType) {
        this.artCarouselType = artCarouselType;
    }
}