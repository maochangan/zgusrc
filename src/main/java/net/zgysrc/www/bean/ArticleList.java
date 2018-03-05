package net.zgysrc.www.bean;

public class ArticleList {
    private Integer id;

    private String articleListName;

    private Integer articleListClickNum;

    private String articleListWriter;

    private String articleListCreateTime;

    private Integer articleListFatherId;

    private String articleImagePath;

    private String articleFatherName;

    private String articleInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleListName() {
        return articleListName;
    }

    public void setArticleListName(String articleListName) {
        this.articleListName = articleListName == null ? null : articleListName.trim();
    }

    public Integer getArticleListClickNum() {
        return articleListClickNum;
    }

    public void setArticleListClickNum(Integer articleListClickNum) {
        this.articleListClickNum = articleListClickNum;
    }

    public String getArticleListWriter() {
        return articleListWriter;
    }

    public void setArticleListWriter(String articleListWriter) {
        this.articleListWriter = articleListWriter == null ? null : articleListWriter.trim();
    }

    public String getArticleListCreateTime() {
        return articleListCreateTime;
    }

    public void setArticleListCreateTime(String articleListCreateTime) {
        this.articleListCreateTime = articleListCreateTime == null ? null : articleListCreateTime.trim();
    }

    public Integer getArticleListFatherId() {
        return articleListFatherId;
    }

    public void setArticleListFatherId(Integer articleListFatherId) {
        this.articleListFatherId = articleListFatherId;
    }

    public String getArticleImagePath() {
        return articleImagePath;
    }

    public void setArticleImagePath(String articleImagePath) {
        this.articleImagePath = articleImagePath == null ? null : articleImagePath.trim();
    }

    public String getArticleFatherName() {
        return articleFatherName;
    }

    public void setArticleFatherName(String articleFatherName) {
        this.articleFatherName = articleFatherName == null ? null : articleFatherName.trim();
    }

    public String getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(String articleInfo) {
        this.articleInfo = articleInfo == null ? null : articleInfo.trim();
    }
}