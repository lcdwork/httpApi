package com.crplingxi.httpapi.webapp.action;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.service.AirRealTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

/**
 * @author: LCD
 * @date Create in: 21:49 2020/3/6
 * @description：
 * @modify:
 * @see: com.crplingxi.httpapi.webapp.action
 */
@ControllerAdvice
@RequestMapping("/air")
public class AirRealTimeAction {

    @Autowired
    @Qualifier("airRealTimeServiceImpl")
    private AirRealTimeService airRealTimeService;

    @ResponseBody
    @RequestMapping(params = "method=test")
    public void putTest() {
        AirRealTime airRealTime = new AirRealTime();
        airRealTime.setId("21222");
        airRealTime.setC(BigDecimal.valueOf(22));
        airRealTime.setCco(BigDecimal.valueOf(33));
        int a = airRealTimeService.insert(airRealTime);
        System.out.println(a);
    }
}
