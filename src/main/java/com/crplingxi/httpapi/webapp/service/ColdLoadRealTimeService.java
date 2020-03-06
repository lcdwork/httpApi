package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.ColdLoadRealTime;

public interface ColdLoadRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(ColdLoadRealTime record);

    int insertSelective(ColdLoadRealTime record);

    ColdLoadRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ColdLoadRealTime record);

    int updateByPrimaryKey(ColdLoadRealTime record);

}

