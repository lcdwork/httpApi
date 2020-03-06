package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.ElectricRealTime;

public interface ElectricRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(ElectricRealTime record);

    int insertSelective(ElectricRealTime record);

    ElectricRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ElectricRealTime record);

    int updateByPrimaryKey(ElectricRealTime record);

}

