package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.PowerLoadRealTime;

import java.util.List;

public interface PowerLoadRealTimeService {

    List<PowerLoadRealTime> findByWhere(PowerLoadRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(PowerLoadRealTime record);

    int insertSelective(PowerLoadRealTime record);

    PowerLoadRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PowerLoadRealTime record);

    int updateByPrimaryKey(PowerLoadRealTime record);

}

