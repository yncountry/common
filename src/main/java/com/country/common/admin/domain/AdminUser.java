package com.country.common.admin.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import cn.gfire.base.jpa.domain.DomainName;
import com.country.common.emmun.RegType;
import org.hibernate.cfg.annotations.Comment;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wust
 * @date 2017/5/16
 * @vsrsion
 * @desc
 */
@Entity
@DomainName("管理用户")
@EntityListeners(AuditingEntityListener.class)
public class AdminUser extends BaseDomain<Long>{

    @Comment("用户姓名")
    private String userName;

    @Comment("微信号")
    private String wxchatNum;

    @Comment("用户登录名")
    private String loginName;

    @Comment("用户密码")
    private String password;

    private String sex;

    @Comment("身份证号")
    private String idCardNum;

    @Comment("手机号")
    private String phoneNum;

    @Comment("详细地址")
    private String address;

    @Comment("状态,0 删除 1 正常")
    private String state;

    @Comment("登记时间")
    @CreatedDate
    @Column(updatable = false)
    private Date createTime;

    @Comment("修改时间")
    @LastModifiedDate
    private Date updateTime;

    @Comment("创建人")
    @CreatedBy
    @ManyToOne
    @JoinColumn(name = "CREATE_USER", updatable = false)
    private AdminUser createUser;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id" ))
    private List<Role> roles = new ArrayList<>();

    public String getWxchatNum() {
        return wxchatNum;
    }

    public void setWxchatNum(String wxchatNum) {
        this.wxchatNum = wxchatNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public AdminUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(AdminUser createUser) {
        this.createUser = createUser;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
