package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.webapp.domain.SendLog;
import com.crplingxi.httpapi.webapp.service.SendLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Date;

/**
 * @author: LCD
 * @date Create in: 16:21 2020/3/9
 * @description：
 * @modify:
 * @see: com.crplingxi.httpapi.webapp.action
 */
public  class SendLogsAction {

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    public void insertLogs(String tableName, int size, String jsonList, String res) {
        SendLog sendLog = new SendLog();
        sendLog.setTableName(tableName);
        sendLog.setSendTime(new Date());
        sendLog.setSendSize(size);
        if(res != null) {
            JSONObject jsonObject = JSON.parseObject(res);
            if (jsonObject.getBoolean("success")) {
                sendLog.setStatus((short) 1);
                sendLogService.insert(sendLog);
            } else {
                sendLog.setErrCode(jsonObject.getString("errCode"));
                sendLog.setErrMsg(jsonObject.getString("errMsg"));
                sendLog.setErrData(jsonList);
                sendLog.setStatus((short) 0);
                sendLogService.insert(sendLog);
            }
        } else {
            sendLog.setErrMsg("数据发送失败！请检查数据或本地网络！");
            sendLog.setErrData(jsonList);
            sendLog.setStatus((short) 0);
            System.out.println("数据发送失败！请检查数据或本地网络！");
        }
    }
}
