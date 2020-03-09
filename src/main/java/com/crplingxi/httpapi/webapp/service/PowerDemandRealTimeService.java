package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.PowerDemandRealTime;

import java.util.List;

public interface PowerDemandRealTimeService {

    List<PowerDemandRealTime> findByWhere(PowerDemandRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(PowerDemandRealTime record);

    int insertSelective(PowerDemandRealTime record);

    PowerDemandRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PowerDemandRealTime record);

    int updateByPrimaryKey(PowerDemandRealTime record);

}

