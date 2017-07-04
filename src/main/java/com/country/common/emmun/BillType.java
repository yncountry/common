package com.country.common.emmun;

import cn.gfire.base.jpa.domain.StringRemarkEnmu;

/**
 * @author wust
 * @date 2017/6/22
 * @vsrsion
 * @desc
 */
public enum BillType implements StringRemarkEnmu {
    PAY("支出"),
    INCOME("收入")
    ;

    private String remark;

    BillType(String remark) {
        this.remark = remark;
    }

    @Override
    public String getRemark() {
        return remark;
    }
}
