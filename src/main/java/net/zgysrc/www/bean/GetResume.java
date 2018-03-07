package net.zgysrc.www.bean;

public class GetResume {
    private Integer id;

    private String postUserName;

    private Integer simpleUserId;

    private Integer postId;

    private Integer postSimpleResumeId;

    private Integer postCompanyId;

    private Integer postUserIds;

    private String sendTime;

    private String viewState;

    private String resumeMatching;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName == null ? null : postUserName.trim();
    }

    public Integer getSimpleUserId() {
        return simpleUserId;
    }

    public void setSimpleUserId(Integer simpleUserId) {
        this.simpleUserId = simpleUserId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getPostSimpleResumeId() {
        return postSimpleResumeId;
    }

    public void setPostSimpleResumeId(Integer postSimpleResumeId) {
        this.postSimpleResumeId = postSimpleResumeId;
    }

    public Integer getPostCompanyId() {
        return postCompanyId;
    }

    public void setPostCompanyId(Integer postCompanyId) {
        this.postCompanyId = postCompanyId;
    }

    public Integer getPostUserIds() {
        return postUserIds;
    }

    public void setPostUserIds(Integer postUserIds) {
        this.postUserIds = postUserIds;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime == null ? null : sendTime.trim();
    }

    public String getViewState() {
        return viewState;
    }

    public void setViewState(String viewState) {
        this.viewState = viewState == null ? null : viewState.trim();
    }

    public String getResumeMatching() {
        return resumeMatching;
    }

    public void setResumeMatching(String resumeMatching) {
        this.resumeMatching = resumeMatching == null ? null : resumeMatching.trim();
    }
}