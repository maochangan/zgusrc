package net.zgysrc.www.bean;

public class FollowList {
    private Integer id;

    private Integer followUserId;

    private Integer followCompanyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(Integer followUserId) {
        this.followUserId = followUserId;
    }

    public Integer getFollowCompanyId() {
        return followCompanyId;
    }

    public void setFollowCompanyId(Integer followCompanyId) {
        this.followCompanyId = followCompanyId;
    }
}