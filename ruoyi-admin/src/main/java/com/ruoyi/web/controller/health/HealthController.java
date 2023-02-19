package com.ruoyi.web.controller.health;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysDept;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.HealthReport;
import com.ruoyi.system.service.impl.HealthReportsServiceImpl;
import io.swagger.annotations.SwaggerDefinition;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author Ymir
 * @version 1.0
 * @date 2023/2/8 15:27
 * @description HealthController
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @Autowired
    private HealthReportsServiceImpl healthReportsService;

    @GetMapping()
    public AjaxResult getHealthyReport() throws Exception
    {
        return AjaxResult.success(healthReportsService.selectAllHealthReports());
    }

    @PostMapping()
    public AjaxResult insertHealthyReport(@RequestBody HealthReport healthReport) throws Exception
    {
        return AjaxResult.success(healthReportsService.insertHealthReport(healthReport));
    }

    /**
     * 过滤查询
     * @param userName
     * @param exception
     * @return
     */
    @GetMapping("/search")
    public AjaxResult searchHealthReport(@RequestParam(value = "userName") String userName,@RequestParam(value = "exception") Boolean exception){

        return AjaxResult.success(healthReportsService.searchHealthReports(userName, exception));
    }
}
