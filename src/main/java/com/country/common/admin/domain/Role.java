package com.country.common.admin.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import cn.gfire.base.jpa.domain.DomainName;
import com.country.common.user.domain.User;
import org.hibernate.cfg.annotations.Comment;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
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
@DomainName("角色")
@EntityListeners(AuditingEntityListener.class)
public class Role extends BaseDomain<Long> {

    private String roleName;


    @CreatedBy
    @ManyToOne
    @JoinColumn(name="CREATE_USER",updatable = false)
    private AdminUser createUser;

    @Comment("登记时间")
    @CreatedDate
    @Column(updatable = false)
    private Date createTime;

    @Comment("对应的权限")
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "id" ))
    private List<Permission> permissions = new ArrayList<Permission>();

    @Comment("对应用户")
    @ManyToMany(mappedBy = "roles")
    private List<AdminUser> adminUsers = new ArrayList<>();

    @OneToMany(mappedBy = "role")
    private List<User> users;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public AdminUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(AdminUser createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<AdminUser> getAdminUsers() {
        return adminUsers;
    }

    public void setAdminUsers(List<AdminUser> adminUsers) {
        this.adminUsers = adminUsers;
    }
}
