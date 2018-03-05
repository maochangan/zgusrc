package net.zgysrc.www.bean;

import java.util.Date;

public class CompanyUser {
    private Integer id;

    private String cVipName;

    private String cUserName;

    private String cPassword;

    private String cImage;

    private String cNickName;

    private String cName;

    private String cPositionName;

    private String cSex;

    private String cTelephoneNumber;

    private String cEmail;

    private String cQq;

    private String emailCode;

    private String authentication;

    private String emailKey;

    private String emailAc;

    private Date acTime;

    private String token;

    private Date createDate;

    private Long emainAcTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcVipName() {
        return cVipName;
    }

    public void setcVipName(String cVipName) {
        this.cVipName = cVipName == null ? null : cVipName.trim();
    }

    public String getcUserName() {
        return cUserName;
    }

    public void setcUserName(String cUserName) {
        this.cUserName = cUserName == null ? null : cUserName.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public String getcImage() {
        return cImage;
    }

    public void setcImage(String cImage) {
        this.cImage = cImage == null ? null : cImage.trim();
    }

    public String getcNickName() {
        return cNickName;
    }

    public void setcNickName(String cNickName) {
        this.cNickName = cNickName == null ? null : cNickName.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcPositionName() {
        return cPositionName;
    }

    public void setcPositionName(String cPositionName) {
        this.cPositionName = cPositionName == null ? null : cPositionName.trim();
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex == null ? null : cSex.trim();
    }

    public String getcTelephoneNumber() {
        return cTelephoneNumber;
    }

    public void setcTelephoneNumber(String cTelephoneNumber) {
        this.cTelephoneNumber = cTelephoneNumber == null ? null : cTelephoneNumber.trim();
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail == null ? null : cEmail.trim();
    }

    public String getcQq() {
        return cQq;
    }

    public void setcQq(String cQq) {
        this.cQq = cQq == null ? null : cQq.trim();
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode == null ? null : emailCode.trim();
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication == null ? null : authentication.trim();
    }

    public String getEmailKey() {
        return emailKey;
    }

    public void setEmailKey(String emailKey) {
        this.emailKey = emailKey == null ? null : emailKey.trim();
    }

    public String getEmailAc() {
        return emailAc;
    }

    public void setEmailAc(String emailAc) {
        this.emailAc = emailAc == null ? null : emailAc.trim();
    }

    public Date getAcTime() {
        return acTime;
    }

    public void setAcTime(Date acTime) {
        this.acTime = acTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getEmainAcTime() {
        return emainAcTime;
    }

    public void setEmainAcTime(Long emainAcTime) {
        this.emainAcTime = emainAcTime;
    }
}