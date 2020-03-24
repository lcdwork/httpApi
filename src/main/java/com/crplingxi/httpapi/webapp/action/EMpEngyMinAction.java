package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.tools.HttpTools;
import com.crplingxi.httpapi.webapp.domain.EMpEngyMin;
import com.crplingxi.httpapi.webapp.service.EMpEngyMinService;
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
@RequestMapping("/empengymin")
public class EMpEngyMinAction {

    @Autowired
    @Qualifier("EMpEngyMinServiceImpl")
    private EMpEngyMinService eMpEngyMinService;

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @ResponseBody
    @RequestMapping()
//    @Scheduled(cron = "${addr.cron}")
    public String putTest() {

        // 表名前缀
        String tableName = "E_MP_ENGY_MIN";

        // 拼接查询对象
        EMpEngyMin eMpEngyMin = new EMpEngyMin();
        eMpEngyMin.setTableName1(tableName + "_" + DateUtils.getLastMonth());
        eMpEngyMin.setTableName2(tableName + "_" + DateUtils.getNowMonth());
        eMpEngyMin.setSavedatetime(sendLogService.getLastTime(tableName));
        List<EMpEngyMin> dataList = eMpEngyMinService.findByWhere(eMpEngyMin);

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
