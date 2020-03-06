package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.PowerLoadRealTime;

public interface PowerLoadRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(PowerLoadRealTime record);

    int insertSelective(PowerLoadRealTime record);

    PowerLoadRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PowerLoadRealTime record);

    int updateByPrimaryKey(PowerLoadRealTime record);

}

