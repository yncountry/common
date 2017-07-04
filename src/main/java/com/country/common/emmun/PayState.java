package com.country.common.emmun;

import cn.gfire.base.jpa.domain.StringRemarkEnmu;

/**
 * @author wust
 * @date 2017/6/19
 * @vsrsion
 * @desc
 */
public enum PayState implements StringRemarkEnmu {
    PAY_END("已支付"),
    PAY_ING("支付中"),
    PAY_NOT("未付中")
    ;

    private String remark;

    PayState(String remark) {
        this.remark = remark;
    }

    @Override
    public String getRemark() {
        return remark;
    }
}
