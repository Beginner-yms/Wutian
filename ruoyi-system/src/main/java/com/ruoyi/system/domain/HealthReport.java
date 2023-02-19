package com.ruoyi.system.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Ymir
 * @version 1.0
 * @date 2023/2/8 11:41
 * @description HealthReport
 * 健康打开domain
 */
public class HealthReport implements Serializable {
    /**
     * id
     */
    private Long reportId;
    private String userName;
    private Boolean xunma;
    private Boolean shuidou;

    private Boolean yigang;

    private Boolean other;


    private Boolean aids;
    private String userWxId;

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserWxId() {
        return userWxId;
    }

    public void setUserWxId(String userWxId) {
        this.userWxId = userWxId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date date) {
        this.createTime = date;
    }

    private Date createTime;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getXunma() {
        return xunma;
    }

    public void setXunma(Boolean xunma) {
        this.xunma = xunma;
    }

    public Boolean getShuidou() {
        return shuidou;
    }

    public void setShuidou(Boolean shuidou) {
        this.shuidou = shuidou;
    }


    public Boolean getYigang() {
        return yigang;
    }

    public void setYigang(Boolean yigang) {
        this.yigang = yigang;
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }

    public Boolean getAids() {
        return aids;
    }

    public void setAids(Boolean aids) {
        this.aids = aids;
    }

    public Boolean getXinguang() {
        return xinguang;
    }

    public void setXinguang(Boolean xinguang) {
        this.xinguang = xinguang;
    }

    private Boolean xinguang;


}
