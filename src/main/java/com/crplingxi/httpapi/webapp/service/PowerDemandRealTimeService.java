package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.PowerDemandRealTime;

public interface PowerDemandRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(PowerDemandRealTime record);

    int insertSelective(PowerDemandRealTime record);

    PowerDemandRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PowerDemandRealTime record);

    int updateByPrimaryKey(PowerDemandRealTime record);

}

