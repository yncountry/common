package com.country.common.emmun;

import cn.gfire.base.jpa.domain.StringRemarkEnmu;

/**
 * @author wust
 * @date 2017/5/25
 * @vsrsion
 * @desc
 */

public enum UnitType implements StringRemarkEnmu {

    KG("千克"),
    PCIE("件"),
    BAG("袋"),
    JIN("斤"),
    ONE("个");

    private String remark;

    UnitType(String remark){
        this.remark=remark;
    }

    @Override
    public String getRemark() {
        return remark;
    }
}
