package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.tools.HttpTools;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurve;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurveBySteam;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurveByWater;
import com.crplingxi.httpapi.webapp.service.EMpBmCurveBySteamService;
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
@RequestMapping("/empbmcurvebysteam")
public class EMpBmCurveBySteamAction {

    @Autowired
    @Qualifier("EMpBmCurveBySteamServiceImpl")
    private EMpBmCurveBySteamService eMpBmCurveBySteamService;

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @ResponseBody
    @RequestMapping()
    @Scheduled(cron = "${empbmcurvebysteam.cron}")
    public String putEMpBmCurveBySteam() {

        // 表名前缀
        String tableName = "E_MP_BM_CURVE";
        String remark = "#STEAM";

        // 拼接查询对象
        EMpBmCurveBySteam eMpBmCurveBySteam = new EMpBmCurveBySteam();
        eMpBmCurveBySteam.setTableName1(tableName + "_" + DateUtils.getLastMonth());
        eMpBmCurveBySteam.setTableName2(tableName + "_" + DateUtils.getNowMonth());
        eMpBmCurveBySteam.setSavedatetime(sendLogService.getLastTime(tableName + remark));
        List<EMpBmCurveBySteam> dataList = eMpBmCurveBySteamService.findSteamByWhere(eMpBmCurveBySteam);

        if(dataList.size() > 0) {
            // List装Json
            String jsonDataList = JSONObject.toJSONString(dataList);
//            System.out.println(jsonDataList);
            // post方式发送数据
            String res = HttpTools.postData(jsonDataList);
            sendLogService.insertByRes(tableName + remark, dataList.size(), res);
//            System.out.println(res);
            return res;
        } else {
            return "没数数据可发送";
        }
    }
}
