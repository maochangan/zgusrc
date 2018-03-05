package net.zgysrc.www.bean;

public class Article {
    private Integer id;

    private String articleName;

    private Integer articleClickNum;

    private Integer articleLikeNum;

    private String articleType;

    private String articleCreateTime;

    private String articleImagePath;

    private String iconPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName == null ? null : articleName.trim();
    }

    public Integer getArticleClickNum() {
        return articleClickNum;
    }

    public void setArticleClickNum(Integer articleClickNum) {
        this.articleClickNum = articleClickNum;
    }

    public Integer getArticleLikeNum() {
        return articleLikeNum;
    }

    public void setArticleLikeNum(Integer articleLikeNum) {
        this.articleLikeNum = articleLikeNum;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType == null ? null : articleType.trim();
    }

    public String getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(String articleCreateTime) {
        this.articleCreateTime = articleCreateTime == null ? null : articleCreateTime.trim();
    }

    public String getArticleImagePath() {
        return articleImagePath;
    }

    public void setArticleImagePath(String articleImagePath) {
        this.articleImagePath = articleImagePath == null ? null : articleImagePath.trim();
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath == null ? null : iconPath.trim();
    }
}