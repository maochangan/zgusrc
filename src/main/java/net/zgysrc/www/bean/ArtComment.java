package net.zgysrc.www.bean;

import java.util.Date;

public class ArtComment {
    private Integer id;

    private Integer fatherId;

    private String commentMessage;

    private Integer simpleUserId;

    private Integer likeNum;

    private String simpleUserName;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
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

    public String getSimpleUserName() {
        return simpleUserName;
    }

    public void setSimpleUserName(String simpleUserName) {
        this.simpleUserName = simpleUserName == null ? null : simpleUserName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}