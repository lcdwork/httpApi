package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.tools.HttpTools;
import com.crplingxi.httpapi.webapp.domain.EMpBmDay;
import com.crplingxi.httpapi.webapp.domain.EMpEngyDay;
import com.crplingxi.httpapi.webapp.service.EMpBmDayService;
import com.crplingxi.httpapi.webapp.service.EMpEngyDayService;
import com.crplingxi.httpapi.webapp.service.SendLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: LCD
 * @date Create in: 16:42 2020/3/11
 * @description：
 * @modify:
 * @see: com.crplingxi.httpapi.webapp.action
 */
@ControllerAdvice
@RequestMapping("/empengyday")
public class EMpEngyDayAction {

    @Autowired
    @Qualifier("EMpEngyDayServiceImpl")
    private EMpEngyDayService eMpEngyDayService;

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @ResponseBody
    @RequestMapping()
    @Scheduled(cron = "${empengyday.cron}")
    public String putTest() {

        // 表名前缀
        String tableName = "E_MP_ENGY_DAY";

        // 拼接查询对象
        EMpEngyDay eMpEngyDay = new EMpEngyDay();
        eMpEngyDay.setTableName1(tableName + "_" + DateUtils.getLastYear());
        eMpEngyDay.setTableName2(tableName + "_" + DateUtils.getNowYear());
        eMpEngyDay.setSavedatetime(sendLogService.getLastTime(tableName));
        List<EMpEngyDay> dataList = eMpEngyDayService.findByWhere(eMpEngyDay);

        if(dataList.size() > 0) {
            // List装Json
            String jsonDataList = JSONObject.toJSONString(dataList);
            System.out.println(jsonDataList);
            // post方式发送数据
            String res = HttpTools.postData(jsonDataList);
            sendLogService.insertByRes(tableName,dataList.size(),jsonDataList,res);
            System.out.println(res);
            return res;
        } else {
            return "没数数据可发送";
        }
    }
}
