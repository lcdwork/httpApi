package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.WaterRealTime;

import java.util.List;

public interface WaterRealTimeService {

    List<WaterRealTime> findByWhere(WaterRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(WaterRealTime record);

    int insertSelective(WaterRealTime record);

    WaterRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WaterRealTime record);

    int updateByPrimaryKey(WaterRealTime record);

}

