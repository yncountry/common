package com.country.common.emmun;

import cn.gfire.base.jpa.domain.StringRemarkEnmu;

/**
 * @author wust
 * @date 2017/6/15
 * @vsrsion
 * @desc
 */
public enum ExpandType implements StringRemarkEnmu {
    GENE("常规"),
    SPEC("自定义")
    ;

    private String remark;

    ExpandType(String remark) {
        this.remark = remark;
    }

    @Override
    public String getRemark() {
        return remark;
    }
}
