package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.HttpTools;
import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.SendLog;
import com.crplingxi.httpapi.webapp.service.AirRealTimeService;
import com.crplingxi.httpapi.webapp.service.SendLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
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

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @Value("${lingxi.url}")
    public String url;

    @ResponseBody
    @RequestMapping("/send")
    // 定时设置
    @Scheduled(cron = "${test.cron}")
    public String putTest() {

        List<AirRealTime> dataList = airRealTimeService.findByWhere(null);
        if(dataList.size() > 0) {
            // 操作记录
            SendLog sendLog = new SendLog();
            sendLog.setTableName("AirRealTime");
            sendLog.setSendTime(new Date());
            sendLog.setSendSize(dataList.size());
            // List装Json
            String jsonDataList = JSONObject.toJSONString(dataList);
            System.out.println(jsonDataList);
            // post方式发送数据
            String res = HttpTools.postData(url, jsonDataList);
            if(res != null) {
                JSONObject jsonObject = JSON.parseObject(res);
                if (jsonObject.getBoolean("success")) {
                    sendLog.setStatus((short) 1);
                    sendLogService.insert(sendLog);
                } else {
                    sendLog.setErrCode(jsonObject.getString("errCode"));
                    sendLog.setErrMsg(jsonObject.getString("errMsg"));
                    sendLog.setErrData(jsonDataList);
                    sendLog.setStatus((short) 0);
                    sendLogService.insert(sendLog);
                }
            } else {
                sendLog.setErrMsg("数据发送失败！请检查数据或本地网络！");
                sendLog.setErrData(jsonDataList);
                sendLog.setStatus((short) 0);
                System.out.println("数据发送失败！请检查数据或本地网络！");
            }
            System.out.println(res);
            return res;
        } else {
            return "没数数据可发送";
        }
    }
}
