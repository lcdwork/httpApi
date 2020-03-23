package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.tools.HttpTools;
import com.crplingxi.httpapi.webapp.domain.ELmpBmDay;
import com.crplingxi.httpapi.webapp.service.ELmpBmDayService;
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
 * @date Create in: 14:42 2020/3/10
 * @description：
 * @modify:
 * @see: com.crplingxi.httpapi.webapp.action
 */
@ControllerAdvice
@RequestMapping("/elmpbmday")
public class ELmpBmDayAction {

    @Autowired
    @Qualifier("ELmpBmDayServiceImpl")
    private ELmpBmDayService eLmpBmDayService;

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @ResponseBody
    @RequestMapping()
    @Scheduled(cron = "${elmpbmday.cron}")
    public String putTest() {

        // 表名前缀
        String tableName = "E_LMP_BM_DAY";

        // 拼接查询对象
        ELmpBmDay eLmpBmDay = new ELmpBmDay();
        eLmpBmDay.setTableName1(tableName + "_" + DateUtils.getLastMonth());
        eLmpBmDay.setTableName2(tableName + "_" + DateUtils.getNowMonth());
        eLmpBmDay.setSavedatetime(sendLogService.getLastTime(tableName));
        List<ELmpBmDay> dataList = eLmpBmDayService.findByWhere(eLmpBmDay);

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
