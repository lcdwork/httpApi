package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.WaterRealTime;

public interface WaterRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(WaterRealTime record);

    int insertSelective(WaterRealTime record);

    WaterRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WaterRealTime record);

    int updateByPrimaryKey(WaterRealTime record);

}

