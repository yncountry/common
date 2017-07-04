package com.country.common.goods.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import com.country.common.emmun.UnitType;
import com.country.common.extend.domain.Extend;
import com.country.common.user.domain.User;
import org.hibernate.cfg.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import sun.management.counter.Units;

import javax.lang.model.type.UnionType;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wust
 * @date 2017/5/28
 * @vsrsion
 * @desc 销售信息
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
public class SaleGoodsInfo extends BaseDomain<Long> {

    @Comment("销售单价")
    private Double salePrice;

    @Comment("展示标题")
    private String title;

    @Comment("展示描述")
    private String saleDesc;

    @Comment("销售单位数量")
    private Integer saleNum;

    @Comment("计量单位")
    private UnitType unitType;

    @Comment("库存")
    private Integer store;

    @Comment("销售量")
    private Integer saleCount;

    @Comment("代理人员")
    @ManyToMany(mappedBy = "agentSaleGoods")
    private List<User> agents = new ArrayList<>();

    @Comment("代理单价")
    private Double agentPrice;

    private String imageUrl_1;

    private String imageUrl_2;

    private String imageUrl_3;

    private String imageUrl_4;

    private String imageUrl_5;

    @Comment("详情")
    @Column(columnDefinition="TEXT")
    private String detail;

    @Comment("品牌")
    private String brand;

    private Long goodsId;

    @Comment("上架时间")
    @CreatedDate
    private Date createDate;

    @Comment("推广")
    @OneToMany(mappedBy = "saleGoods")
    private List<Extend> anExtends;


    public List<Extend> getAnExtends() {
        return anExtends;
    }

    public void setAnExtends(List<Extend> anExtends) {
        this.anExtends = anExtends;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImageUrl_1() {
        return imageUrl_1;
    }

    public void setImageUrl_1(String imageUrl_1) {
        this.imageUrl_1 = imageUrl_1;
    }

    public String getImageUrl_2() {
        return imageUrl_2;
    }

    public void setImageUrl_2(String imageUrl_2) {
        this.imageUrl_2 = imageUrl_2;
    }

    public String getImageUrl_3() {
        return imageUrl_3;
    }

    public void setImageUrl_3(String imageUrl_3) {
        this.imageUrl_3 = imageUrl_3;
    }

    public String getImageUrl_4() {
        return imageUrl_4;
    }

    public void setImageUrl_4(String imageUrl_4) {
        this.imageUrl_4 = imageUrl_4;
    }

    public String getImageUrl_5() {
        return imageUrl_5;
    }

    public void setImageUrl_5(String imageUrl_5) {
        this.imageUrl_5 = imageUrl_5;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<User> getAgents() {
        return agents;
    }

    public void setAgents(List<User> agents) {
        this.agents = agents;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSaleDesc() {
        return saleDesc;
    }

    public void setSaleDesc(String saleDesc) {
        this.saleDesc = saleDesc;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public Double getAgentPrice() {
        return agentPrice;
    }

    public void setAgentPrice(Double agentPrice) {
        this.agentPrice = agentPrice;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }
}
