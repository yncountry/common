package com.country.common.activity.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import cn.gfire.base.jpa.domain.DomainName;
import com.country.common.emmun.ActivityType;

import javax.persistence.Entity;
import java.util.Date;

/**
 * @author wust
 * @date 2017/6/15
 * @vsrsion
 * @desc
 */
@Entity
public class Activity extends BaseDomain<Long> {

    private String actName;
    private ActivityType activityType;
    private Date startDate;
    private Date endDate;
    private Double fullFee;
    private Double lessFee;
    private Double totalFee;

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getFullFee() {
        return fullFee;
    }

    public void setFullFee(Double fullFee) {
        this.fullFee = fullFee;
    }

    public Double getLessFee() {
        return lessFee;
    }

    public void setLessFee(Double lessFee) {
        this.lessFee = lessFee;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }
}
