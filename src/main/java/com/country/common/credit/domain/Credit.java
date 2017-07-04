package com.country.common.credit.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import com.country.common.user.domain.User;
import org.hibernate.cfg.annotations.Comment;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author wust
 * @date 2017/5/25
 * @vsrsion
 * @desc 信用
 */
@Entity
public class Credit extends BaseDomain<Long> {

    private Integer countryCredit;

    private Integer creditClass;

    @Comment("失信次数")
    private Integer dishonestyCount;

    @OneToOne(mappedBy = "credit")
    @JoinColumn(name = "USER_ID")
    private User user;

    public Integer getCountryCredit() {
        return countryCredit;
    }

    public void setCountryCredit(Integer countryCredit) {
        this.countryCredit = countryCredit;
    }

    public Integer getCreditClass() {
        return creditClass;
    }

    public void setCreditClass(Integer creditClass) {
        this.creditClass = creditClass;
    }

    public Integer getDishonestyCount() {
        return dishonestyCount;
    }

    public void setDishonestyCount(Integer dishonestyCount) {
        this.dishonestyCount = dishonestyCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
