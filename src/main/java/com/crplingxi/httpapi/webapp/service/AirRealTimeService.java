package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;

import java.util.List;

public interface AirRealTimeService {

    List<AirRealTime> findByWhere(AirRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(AirRealTime record);

    int insertSelective(AirRealTime record);

    AirRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AirRealTime record);

    int updateByPrimaryKey(AirRealTime record);

}

