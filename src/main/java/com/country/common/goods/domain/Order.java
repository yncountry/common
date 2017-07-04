package com.country.common.goods.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
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
@Table(name = "TB_ORDER")
@EntityListeners(AuditingEntityListener.class)
public class Order extends BaseDomain<Long> {

    private String orderNum;
    private Integer totalFee;
    private Integer count;
    @OneToMany
    @JoinColumn(name = "saleGoodsInfos")
    private List<SaleGoodsInfo> saleGoodsInfos;

    @CreatedDate
    private Date createDate;


    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<SaleGoodsInfo> getSaleGoodsInfos() {
        return saleGoodsInfos;
    }

    public void setSaleGoodsInfos(List<SaleGoodsInfo> saleGoodsInfos) {
        this.saleGoodsInfos = saleGoodsInfos;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
