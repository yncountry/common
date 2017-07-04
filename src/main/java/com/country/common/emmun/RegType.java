package com.country.common.emmun;

import cn.gfire.base.jpa.domain.StringRemarkEnmu;

/**
 * @author wust
 * @date 2017/6/22
 * @vsrsion
 * @desc
 */
public enum RegType implements StringRemarkEnmu {
    AGENT("001"),
    SUPlIE("002")
    ;

    RegType(String remark) {
        this.remark = remark;
    }

    private String remark;
    @Override
    public String getRemark() {
        return null;
    }
}
