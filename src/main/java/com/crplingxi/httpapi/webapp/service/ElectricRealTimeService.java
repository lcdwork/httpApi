package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.ElectricRealTime;

import java.util.List;

public interface ElectricRealTimeService {

    List<ElectricRealTime> findByWhere(ElectricRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(ElectricRealTime record);

    int insertSelective(ElectricRealTime record);

    ElectricRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ElectricRealTime record);

    int updateByPrimaryKey(ElectricRealTime record);

}

