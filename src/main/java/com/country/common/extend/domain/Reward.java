package com.country.common.extend.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import org.hibernate.cfg.annotations.Comment;

import javax.persistence.Entity;
import java.util.List;

/**
 * @author wust
 * @create 2017-07-05 0:04
 * desc 定义奖励制度
 **/
@Entity
public class Reward extends BaseDomain<Long> {

    private String rewardName;

    @Comment("奖励的内容信息")
    private String rewardContent;

    @Comment("奖励金额")
    private Double rewardFee;

    @Comment("奖励的类型1 现金奖励 2 奖品奖励 多少件货，送多少")
    private Integer rewardType;

    @Comment("满多少奖励")
    private Integer totalNum;

    @Comment("奖励的数量")
    private Integer rewardNum;

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    public String getRewardContent() {
        return rewardContent;
    }

    public void setRewardContent(String rewardContent) {
        this.rewardContent = rewardContent;
    }

    public Double getRewardFee() {
        return rewardFee;
    }

    public void setRewardFee(Double rewardFee) {
        this.rewardFee = rewardFee;
    }

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getRewardNum() {
        return rewardNum;
    }

    public void setRewardNum(Integer rewardNum) {
        this.rewardNum = rewardNum;
    }
}
