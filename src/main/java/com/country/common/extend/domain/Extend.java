package com.country.common.extend.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import com.country.common.goods.domain.SaleGoodsInfo;
import com.country.common.user.domain.User;
import org.hibernate.cfg.annotations.Comment;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @author wust
 * @create 2017-07-04 21:26
 * ${desc}
 **/
@Entity
public class Extend extends BaseDomain<Long> {

    @Comment("推广标题")
    private String extendTitle;

    @Comment("销售价格")
    private Double salePrice;

    @Comment("推广认证token")
    private String extendToke;

    @ManyToOne
    private User createUser;

    @Comment("浏览次数")
    private Integer sanCount;

    @Comment("销售数量")
    private String saleNum;

    @Comment("推广的商品")
    @ManyToOne
    private SaleGoodsInfo saleGoods;

    @Comment("奖励")
    @ManyToOne
    private Reward reward;

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public String getExtendTitle() {
        return extendTitle;
    }

    public void setExtendTitle(String extendTitle) {
        this.extendTitle = extendTitle;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getExtendToke() {
        return extendToke;
    }

    public void setExtendToke(String extendToke) {
        this.extendToke = extendToke;
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

    public SaleGoodsInfo getSaleGoods() {
        return saleGoods;
    }

    public void setSaleGoods(SaleGoodsInfo saleGoods) {
        this.saleGoods = saleGoods;
    }
}
