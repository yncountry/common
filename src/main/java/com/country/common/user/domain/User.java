package com.country.common.user.domain;

import cn.gfire.base.jpa.domain.BaseDomain;
import com.country.common.admin.domain.Role;
import com.country.common.credit.domain.Credit;
import com.country.common.extend.domain.Extend;
import com.country.common.goods.domain.SaleGoodsInfo;
import org.hibernate.cfg.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author wust
 * @date 2017/6/8
 * @vsrsion
 * @desc
 */

@Entity
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseDomain<Long> {

    @Comment("平台会员名")
    private String userName;

    @Comment("手机号")
    private String phoneNo;

    @Comment("密码")
    private String password;

    @Comment("微信网名")
    private String netName;

    @Comment("微信号")
    private String wexNum;

    @Comment("支付宝账户")
    private String aliPayNo;

    @Comment("旺旺号")
    private String wangWangNo;

    @Comment("淘宝会员名")
    private String taobaoName;

    @Comment("所在省份")
    private String provice;

    @Comment("所在城市")
    private String city;

    @Comment("县区")
    private String county;

    @Comment("详细地址")
    private String address;

    @Comment("登记时间")
    @CreatedDate
    @Column(updatable = false)
    private Date createTime;

    @Comment("最新登录时间")
    private Date updateTime;


    @Comment("1正常 2 审核中 0 停用")
    private Integer state;

    @ManyToOne
    @JoinColumn(name = "role")
    private Role role;

    @OneToMany
    @JoinColumn(name = "EXPAND_ID")
    private List<Extend> expands;

    @OneToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private UserAccount userAccount;

    @OneToOne
    @JoinColumn(name = "USER_BILL_ID")
    private UserBill userBill;

    /**
     * 多对多
     */
    @ManyToMany
    @JoinTable(
            name = "GOODS_AGENT",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "GOODS_ID")
    )
    private List<SaleGoodsInfo> agentSaleGoods = new ArrayList<>();

    @OneToMany(mappedBy = "createUser")
    private List<Extend> extendList = new ArrayList<>();

    @Comment("用户信用")
    @OneToOne(cascade = CascadeType.PERSIST)
    private Credit credit;

    public List<SaleGoodsInfo> getAgentSaleGoods() {
        return agentSaleGoods;
    }

    public void setAgentSaleGoods(List<SaleGoodsInfo> agentSaleGoods) {
        this.agentSaleGoods = agentSaleGoods;
    }

    public List<Extend> getExtendList() {
        return extendList;
    }

    public void setExtendList(List<Extend> extendList) {
        this.extendList = extendList;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public UserBill getUserBill() {
        return userBill;
    }

    public void setUserBill(UserBill userBill) {
        this.userBill = userBill;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Extend> getExpands() {
        return expands;
    }

    public void setExpands(List<Extend> expands) {
        this.expands = expands;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAliPayNo() {
        return aliPayNo;
    }

    public void setAliPayNo(String aliPayNo) {
        this.aliPayNo = aliPayNo;
    }

    public String getWangWangNo() {
        return wangWangNo;
    }

    public void setWangWangNo(String wangWangNo) {
        this.wangWangNo = wangWangNo;
    }

    public String getTaobaoName() {
        return taobaoName;
    }

    public void setTaobaoName(String taobaoName) {
        this.taobaoName = taobaoName;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
