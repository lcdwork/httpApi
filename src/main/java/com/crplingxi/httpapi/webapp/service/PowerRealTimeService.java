package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.PowerRealTime;

import java.util.List;

public interface PowerRealTimeService {

    List<PowerRealTime> findByWhere(PowerRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(PowerRealTime record);

    int insertSelective(PowerRealTime record);

    PowerRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PowerRealTime record);

    int updateByPrimaryKey(PowerRealTime record);

}

