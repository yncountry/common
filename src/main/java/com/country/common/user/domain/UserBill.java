package com.country.common.user.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import com.country.common.emmun.BillType;
import org.hibernate.cfg.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * @author wust
 * @date 2017/6/22
 * @vsrsion
 * @desc
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
public class UserBill extends BaseDomain<Long> {

    @Comment("金额")
    private Double billFee;

    @Comment("描述")
    private String billDesc;

    @Comment("类型")
    private BillType billType;

    @OneToOne(mappedBy = "userBill")
    private User user;

    @CreatedDate
    private Date createDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getBillFee() {
        return billFee;
    }

    public void setBillFee(Double billFee) {
        this.billFee = billFee;
    }

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
