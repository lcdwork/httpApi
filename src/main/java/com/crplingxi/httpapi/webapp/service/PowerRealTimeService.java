package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.PowerRealTime;

public interface PowerRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(PowerRealTime record);

    int insertSelective(PowerRealTime record);

    PowerRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PowerRealTime record);

    int updateByPrimaryKey(PowerRealTime record);

}

