package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.HccRealTime;

import java.util.List;

public interface HccRealTimeService {

    List<HccRealTime> findByWhere(HccRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(HccRealTime record);

    int insertSelective(HccRealTime record);

    HccRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HccRealTime record);

    int updateByPrimaryKey(HccRealTime record);

}

