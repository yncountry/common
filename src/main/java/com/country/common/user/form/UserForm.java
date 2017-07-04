package com.country.common.user.form;

import cn.gfire.base.mvc.form.BaseForm;
import com.country.common.admin.domain.Role;
import com.country.common.user.domain.User;

/**
 * @author wust
 * @date 2017/6/8
 * @vsrsion
 * @desc
 */

public class UserForm extends BaseForm<User,Long> {

    private String userName;

    private String phoneNo;

    private String password;

    private String netName;
    private String wexNum;
    private String address;

    private Integer state;

    private Role role;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public String getWexNum() {
        return wexNum;
    }

    public void setWexNum(String wexNum) {
        this.wexNum = wexNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String getName() {
        return "用户";
    }
}


