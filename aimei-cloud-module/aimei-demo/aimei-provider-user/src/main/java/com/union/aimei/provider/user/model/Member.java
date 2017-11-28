package com.union.aimei.provider.user.model;

import java.util.Date;

public class Member {
    private Long id;

    private String userName;

    private Long pid;

    private String realName;

    private String nikename;

    private String avatarUrl;

    private String sex;

    private Date birthday;

    private String password;

    private String paypword;

    private String email;

    private String mobile;

    private String qrcodeAddressUrl;

    private String grade;

    private String certification;

    private String openId;

    private Integer status;

    private Integer loginNum;

    private Date registerTime;

    private String registerIp;

    private Date createTime;

    private Long creater;

    private Date updateTime;

    private Long updater;

    public Member(Long id, String userName, Long pid, String realName, String nikename, String avatarUrl, String sex, Date birthday, String password, String paypword, String email, String mobile, String qrcodeAddressUrl, String grade, String certification, String openId, Integer status, Integer loginNum, Date registerTime, String registerIp, Date createTime, Long creater, Date updateTime, Long updater) {
        this.id = id;
        this.userName = userName;
        this.pid = pid;
        this.realName = realName;
        this.nikename = nikename;
        this.avatarUrl = avatarUrl;
        this.sex = sex;
        this.birthday = birthday;
        this.password = password;
        this.paypword = paypword;
        this.email = email;
        this.mobile = mobile;
        this.qrcodeAddressUrl = qrcodeAddressUrl;
        this.grade = grade;
        this.certification = certification;
        this.openId = openId;
        this.status = status;
        this.loginNum = loginNum;
        this.registerTime = registerTime;
        this.registerIp = registerIp;
        this.createTime = createTime;
        this.creater = creater;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public Member() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPaypword() {
        return paypword;
    }

    public void setPaypword(String paypword) {
        this.paypword = paypword == null ? null : paypword.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getQrcodeAddressUrl() {
        return qrcodeAddressUrl;
    }

    public void setQrcodeAddressUrl(String qrcodeAddressUrl) {
        this.qrcodeAddressUrl = qrcodeAddressUrl == null ? null : qrcodeAddressUrl.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification == null ? null : certification.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdater() {
        return updater;
    }

    public void setUpdater(Long updater) {
        this.updater = updater;
    }
}