package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.tools.HttpTools;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurve;
import com.crplingxi.httpapi.webapp.service.EMpBmCurveService;
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
 * @date Create in: 19:05 2020/3/10
 * @description：
 * @modify:
 * @see: com.crplingxi.httpapi.webapp.action
 */
@ControllerAdvice
@RequestMapping("/empbmcurve")
public class EMpBmCurveAction {

    @Autowired
    @Qualifier("EMpBmCurveServiceImpl")
    private EMpBmCurveService eMpBmCurveService;

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @ResponseBody
    @RequestMapping()
    @Scheduled(cron = "${empbmcurve.cron}")
    public String putTest() {

        // 表名前缀
        String tableName = "E_MP_BM_CURVE";

        // 拼接查询对象
        EMpBmCurve eMpBmCurve = new EMpBmCurve();
        eMpBmCurve.setTableName1(tableName + "_" + DateUtils.getLastMonth());
        eMpBmCurve.setTableName2(tableName + "_" + DateUtils.getNowMonth());
        eMpBmCurve.setSavedatetime(sendLogService.getLastTime(tableName));
        List<EMpBmCurve> dataList = eMpBmCurveService.findByWhere(eMpBmCurve);

        if(dataList.size() > 0) {
            // List装Json
            String jsonDataList = JSONObject.toJSONString(dataList);
//            System.out.println(jsonDataList);
            // post方式发送数据
            String res = HttpTools.postData(jsonDataList);
            sendLogService.insertByRes(tableName,dataList.size(),jsonDataList,res);
//            System.out.println(res);
            return res;
        } else {
            return "没数数据可发送";
        }
    }
}
