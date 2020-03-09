package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.HotLoadRealTime;

import java.util.List;

public interface HotLoadRealTimeService {

    List<HotLoadRealTime> findByWhere(HotLoadRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(HotLoadRealTime record);

    int insertSelective(HotLoadRealTime record);

    HotLoadRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HotLoadRealTime record);

    int updateByPrimaryKey(HotLoadRealTime record);

}

