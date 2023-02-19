package com.ruoyi.system.domain;

/**
 * @author Ymir
 * @version 1.0
 * @date 2023/2/8 19:18
 * @description SearchHealthReport
 */
public class SearchHealthReport extends HealthReport{

    /**是否异常查询**/
    public Boolean exception;

    public Boolean getException() {
        return exception;
    }

    public void setException(Boolean exception) {
        this.exception = exception;
    }
}
