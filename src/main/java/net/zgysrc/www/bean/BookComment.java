package net.zgysrc.www.bean;

public class BookComment {
    private Integer id;

    private String commentMessage;

    private Integer simpleUserId;

    private Integer likeNum;

    private Integer fatherId;

    private String userName;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentMessage() {
        return commentMessage;
    }

    public void setCommentMessage(String commentMessage) {
        this.commentMessage = commentMessage == null ? null : commentMessage.trim();
    }

    public Integer getSimpleUserId() {
        return simpleUserId;
    }

    public void setSimpleUserId(Integer simpleUserId) {
        this.simpleUserId = simpleUserId;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}