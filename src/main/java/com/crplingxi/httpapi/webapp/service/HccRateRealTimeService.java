package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.HccRateRealTime;

import java.util.List;

public interface HccRateRealTimeService {

    List<HccRateRealTime> findByWhere(HccRateRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(HccRateRealTime record);

    int insertSelective(HccRateRealTime record);

    HccRateRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HccRateRealTime record);

    int updateByPrimaryKey(HccRateRealTime record);

}

