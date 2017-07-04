package com.country.common.user.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import org.hibernate.cfg.annotations.Comment;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author wust
 * @date 2017/6/22
 * @vsrsion
 * @desc
 */
@Entity
public class UserAccount extends BaseDomain<Long> {

    @Comment("账户总金额")
    private Double accountFee;

    @OneToOne(mappedBy = "userAccount")
    private User user;

    public Double getAccountFee() {
        return accountFee;
    }

    public void setAccountFee(Double accountFee) {
        this.accountFee = accountFee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
