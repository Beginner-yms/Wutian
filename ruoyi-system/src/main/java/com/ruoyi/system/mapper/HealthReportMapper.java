package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.HealthReport;
import com.ruoyi.system.domain.SearchHealthReport;

import java.util.List;

/**
 * @author Ymir
 * @version 1.0
 * @date 2023/2/8 11:47
 * @description HealthReportMapper
 */
public interface HealthReportMapper {

    /***
     * 把所有全部查找出来，默认降序，未分页优化
     * @return
     */
    public List<HealthReport> selectAllHealthReport();

    /**
     * 插入一个报备
     * @param healthReport
     * @return
     */
    public int insertHealthReport(HealthReport healthReport);

    /**
     * 条件查询
     * @param searchHealthReport
     * @return
     */
    public List<HealthReport> searchHealthReport(SearchHealthReport searchHealthReport);
}
