package com.country.common.admin.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import cn.gfire.base.jpa.domain.DomainName;
import org.hibernate.cfg.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wust
 * @date 2017/5/16
 * @vsrsion
 * @desc 权限
 */
@Entity
@DomainName("权限")
@EntityListeners(AuditingEntityListener.class)
public class Permission extends BaseDomain<Long> {

    @Column(name = "MOD_CODE")
    private String modCode; //功能模块编码 格式 功能_模块 eg  USER_ADD

    @Column(name = "PREM_STATE")
    private String permState;   //权限的状态 1 可用 0 停用

    @Comment("模块名称")
    private String modName;

    @Comment("所属父模块")
    private String parentModeName;

//
//    @CreatedBy
//    @ManyToOne
//    @JoinColumn(name="CREATE_USER",updatable = false)
//    private AdminUser createUser;

//    @Comment("登记时间")
//    @CreatedDate
//    @Column(updatable = false)
//    private Date createTime;

    @Comment("关联的角色")
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "permissions")
    private List<Role> roles = new ArrayList<Role>();

    public String getModCode() {
        return modCode;
    }

    public void setModCode(String modCode) {
        this.modCode = modCode;
    }

    public String getPermState() {
        return permState;
    }

    public void setPermState(String permState) {
        this.permState = permState;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

//    public AdminUser getCreateUser() {
//        return createUser;
//    }
//
//    public void setCreateUser(AdminUser createUser) {
//        this.createUser = createUser;
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getParentModeName() {
        return parentModeName;
    }

    public void setParentModeName(String parentModeName) {
        this.parentModeName = parentModeName;
    }
}
