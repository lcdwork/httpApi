package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSON;
import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.webapp.domain.SendLog;
import com.crplingxi.httpapi.webapp.service.AirRealTimeService;
import com.crplingxi.httpapi.webapp.service.SendLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @Value("${lingxi.url}")
    public String url;

    @ResponseBody
    @RequestMapping("/send")
    // 定时设置
//    @Scheduled(cron = "${test.cron}")
    public String putTest() {

        SendLog sendLog = new SendLog();
        sendLog.setTableName("AirRealTime");
        String json = JSON.toJSONString(sendLogService.getLastLog(sendLog));
        System.out.println(json);
        System.out.println(DateUtils.getLastMonth());
        System.out.println(DateUtils.getNowMonth());
        return null;

//        List<AirRealTime> dataList = airRealTimeService.findByWhere(null);
//        if(dataList.size() > 0) {
//            // List装Json
//            String jsonDataList = JSONObject.toJSONString(dataList);
//            System.out.println(jsonDataList);
//            // post方式发送数据
//            String res = HttpTools.postData(url, jsonDataList);
//            sendLogService.insertByRes("AirRealTime",dataList.size(),jsonDataList,res);
//            System.out.println(res);
//            return res;
//        } else {
//            return "没数数据可发送";
//        }
    }
}
