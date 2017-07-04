package com.country.common.goods.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import com.country.common.user.domain.User;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author wust
 * @date 2017/6/26
 * @vsrsion
 * @desc
 */

@Entity
@EntityListeners(AuditingEntityListener.class)
public class ExtendGoods extends BaseDomain<Long> {

    private Double salePrice;

    private Integer saleCount;

    private String showTitle;

    @ManyToOne
    @JoinColumn(name = "SALE_GOODS_ID")
    private SaleGoodsInfo saleGoodsInfo;

    @OneToMany
    private List<Order> orders;

    @CreatedBy
    @ManyToOne
    private User createUser;

    @CreatedDate
    private Date createDate;


    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public SaleGoodsInfo getSaleGoodsInfo() {
        return saleGoodsInfo;
    }

    public void setSaleGoodsInfo(SaleGoodsInfo saleGoodsInfo) {
        this.saleGoodsInfo = saleGoodsInfo;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
