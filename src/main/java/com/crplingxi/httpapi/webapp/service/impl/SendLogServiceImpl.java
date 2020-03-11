package com.crplingxi.httpapi.webapp.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.webapp.dao.SendLogMapper;
import com.crplingxi.httpapi.webapp.domain.SendLog;
import com.crplingxi.httpapi.webapp.service.SendLogService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

import java.util.Date;

@TransactionService
public class SendLogServiceImpl implements SendLogService{

    @TransactionDAO("httpOracle")
    private SendLogMapper sendLogMapper;

    @Override
    public int insert(SendLog record) {
        return sendLogMapper.insert(record);
    }

    @Override
    public int insertByRes(String tableName, int size, String jsonList, String res) {
        SendLog sendLog = new SendLog();
        sendLog.setTableName(tableName);
        sendLog.setSendTime(new Date());
        sendLog.setSendSize(size);
        int result = 0;
        if(res != null) {
            JSONObject jsonObject = JSON.parseObject(res);
            if (jsonObject.getBoolean("success")) {
                sendLog.setStatus((short) 1);
                result = sendLogMapper.insert(sendLog);
            } else {
                sendLog.setErrCode(jsonObject.getString("errCode"));
                sendLog.setErrMsg(jsonObject.getString("errMsg"));
                sendLog.setErrData(jsonList);
                sendLog.setStatus((short) 0);
                result = sendLogMapper.insert(sendLog);
            }
        } else {
            sendLog.setErrMsg("数据发送失败！请检查数据或网络！");
            sendLog.setErrData(jsonList);
            sendLog.setStatus((short) 0);
            result = sendLogMapper.insert(sendLog);
        }

        return result;
    }

    @Override
    public Date getLastTime(String tableName) {
        SendLog sendLog = new SendLog();
        sendLog.setTableName(tableName);
        // 获取当前时间
//        Date date = new Date();
        // 获取当月1号时间
        Date date = DateUtils.initDateByMonth();
        sendLog = sendLogMapper.getLastLog(sendLog);
        if(sendLog != null) {
            date = sendLog.getSendTime();
        }
        return date;
    }

}
