package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.HttpTools;
import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.service.AirRealTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

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

    @Value("${lingxi.url}")
    public String url;

    @ResponseBody
    @RequestMapping(params = "method=test")
    public void putTest() {

        List<AirRealTime> dataList = airRealTimeService.findByWhere(null);
        if(dataList.size() > 0) {
            String jsonDataList = JSONObject.toJSONString(dataList);
            System.out.println(jsonDataList);
            String res = HttpTools.postData(url, jsonDataList);
            System.out.println(res);
        }
//        AirRealTime airRealTime = new AirRealTime();
//        airRealTime.setId("21222");
//        airRealTime.setC(BigDecimal.valueOf(22));
//        airRealTime.setCco(BigDecimal.valueOf(33));
//        int a = airRealTimeService.insert(airRealTime);
        System.out.println(dataList.size());
    }
}
