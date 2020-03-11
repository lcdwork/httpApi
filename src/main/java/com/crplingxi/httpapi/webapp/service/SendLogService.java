package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.SendLog;

import java.util.Date;

public interface SendLogService{


    int insert(SendLog record);

    int insertByRes(String tableName, int size, String jsonList, String res);

    Date getLastTime(String tableName);

}
