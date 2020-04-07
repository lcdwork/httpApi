package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.tools.HttpTools;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurve;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurveBySteam;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurveByWater;
import com.crplingxi.httpapi.webapp.service.EMpBmCurveByWaterService;
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
@RequestMapping("/empbmcurvebywater")
public class EMpBmCurveByWaterAction {

    @Autowired
    @Qualifier("EMpBmCurveByWaterServiceImpl")
    private EMpBmCurveByWaterService eMpBmCurveByWaterService;

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @ResponseBody
    @RequestMapping()
    @Scheduled(cron = "${empbmcurvebywater.cron}")
    public String putTest() {

        // 表名前缀
        String tableName = "E_MP_BM_CURVE";
        String remark = "#WATER";

        // 拼接查询对象
        EMpBmCurveByWater eMpBmCurveByWater = new EMpBmCurveByWater();
        eMpBmCurveByWater.setTableName1(tableName + "_" + DateUtils.getLastMonth());
        eMpBmCurveByWater.setTableName2(tableName + "_" + DateUtils.getNowMonth());
        eMpBmCurveByWater.setSavedatetime(sendLogService.getLastTime(tableName + remark));
        List<EMpBmCurveByWater> dataList = eMpBmCurveByWaterService.findWaterByWhere(eMpBmCurveByWater);

        sendLogService.insertByRes(tableName + remark, dataList.size(),null);

        if(dataList.size() > 0) {
            // List装Json
            String jsonDataList = JSONObject.toJSONString(dataList);
//            System.out.println(jsonDataList);
            // post方式发送数据
            String res = HttpTools.postData(jsonDataList);
            sendLogService.insertByRes(tableName,dataList.size(),res);
//            System.out.println(res);
            return res;
        } else {
            return "没数数据可发送";
        }
    }
}
