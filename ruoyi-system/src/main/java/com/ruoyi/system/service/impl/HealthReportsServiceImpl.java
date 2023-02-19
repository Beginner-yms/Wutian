package com.ruoyi.system.service.impl;

import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.system.domain.HealthReport;
import com.ruoyi.system.domain.SearchHealthReport;
import com.ruoyi.system.mapper.HealthReportMapper;
import com.ruoyi.system.service.IHealthReportService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ymir
 * @version 1.0
 * @date 2023/2/8 15:08
 * @description HealthReportsServiceImpl
 */
@Service
public class HealthReportsServiceImpl implements IHealthReportService {
    @Autowired
    private HealthReportMapper healthReportMapper;

    @Override
    public List<HealthReport> selectAllHealthReports() {
        List ret = healthReportMapper.selectAllHealthReport();
        if(ret== null){
            return new ArrayList<>();
        }
        return ret;
    }

    @Override
    public Boolean insertHealthReport(HealthReport healthReport) {
        healthReport.setCreateTime(new Date());
        int row = healthReportMapper.insertHealthReport(healthReport);
        if (row > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<HealthReport> searchHealthReports(String name,Boolean exception ) {
        SearchHealthReport searchHealthReport = new SearchHealthReport();
        if(exception!=null&& exception){
            searchHealthReport.setException(true);
        }
        else{
            // 方便动态SQL 判断...
            searchHealthReport.setException(null);
        }
        searchHealthReport.setUserName(name);
        return healthReportMapper.searchHealthReport(searchHealthReport);
    }

}
