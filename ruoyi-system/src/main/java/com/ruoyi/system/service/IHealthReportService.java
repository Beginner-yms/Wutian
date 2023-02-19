package com.ruoyi.system.service;

import com.ruoyi.system.domain.HealthReport;
import com.ruoyi.system.domain.SearchHealthReport;

import java.util.List;
/**
 * @author Ymir
 * @version 1.0
 * @date 2023/2/8 15:05
 * @description IHealthReportService
 */
public interface IHealthReportService {

    public List<HealthReport> selectAllHealthReports();

    public Boolean insertHealthReport(HealthReport healthReport);

    public List<HealthReport> searchHealthReports(String userName,Boolean exception);
}
