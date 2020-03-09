package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.SendLog;
public interface SendLogService{


    int insert(SendLog record);

    int insertByRes(String tableName, int size, String jsonList, String res);

    SendLog getLastLog(SendLog record);

}
