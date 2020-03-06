package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.EnvironmentRealTime;

public interface EnvironmentRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(EnvironmentRealTime record);

    int insertSelective(EnvironmentRealTime record);

    EnvironmentRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EnvironmentRealTime record);

    int updateByPrimaryKey(EnvironmentRealTime record);

}

