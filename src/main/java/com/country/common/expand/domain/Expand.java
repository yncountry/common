package com.country.common.expand.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import cn.gfire.base.jpa.domain.DomainName;
import com.country.common.emmun.ExpandType;
import com.country.common.user.domain.User;
import org.hibernate.cfg.annotations.Comment;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author wust
 * @date 2017/6/15
 * @vsrsion
 * @desc
 */
@Entity
@DomainName("推广")
public class Expand extends BaseDomain<Long> {

    private String storeName;

    private Double salePrice;

    private ExpandType expandType;

    @Comment("推广认证token")
    private String expanToke;

    private Long goodsId;

    @ManyToOne
    private User createUser;

    @Comment("浏览次数")
    private Integer sanCount;

    @Comment("销售数量")
    private String saleNum;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public ExpandType getExpandType() {
        return expandType;
    }

    public void setExpandType(ExpandType expandType) {
        this.expandType = expandType;
    }

    public String getExpanToke() {
        return expanToke;
    }

    public void setExpanToke(String expanToke) {
        this.expanToke = expanToke;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public Integer getSanCount() {
        return sanCount;
    }

    public void setSanCount(Integer sanCount) {
        this.sanCount = sanCount;
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum;
    }
}
