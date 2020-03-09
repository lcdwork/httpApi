package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.EnvironmentRealTime;

import java.util.List;

public interface EnvironmentRealTimeService {

    List<EnvironmentRealTime> findByWhere(EnvironmentRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(EnvironmentRealTime record);

    int insertSelective(EnvironmentRealTime record);

    EnvironmentRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EnvironmentRealTime record);

    int updateByPrimaryKey(EnvironmentRealTime record);

}

