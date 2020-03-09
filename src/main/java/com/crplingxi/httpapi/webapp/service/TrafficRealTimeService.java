package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.TrafficRealTime;

import java.util.List;

public interface TrafficRealTimeService {

    List<TrafficRealTime> findByWhere(TrafficRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(TrafficRealTime record);

    int insertSelective(TrafficRealTime record);

    TrafficRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TrafficRealTime record);

    int updateByPrimaryKey(TrafficRealTime record);

}

