package com.country.common.emmun;

import cn.gfire.base.jpa.domain.StringRemarkEnmu;

/**
 * @author wust
 * @date 2017/6/15
 * @vsrsion
 * @desc
 */
public enum ActivityType implements StringRemarkEnmu{
    FULL_CUT("满减"),
    ;



    private String remark;

    ActivityType(String remark) {
        this.remark = remark;
    }

    @Override
    public String getRemark() {
        return remark;
    }
}
