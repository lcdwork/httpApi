package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.HcvRealTime;

import java.util.List;

public interface HcvRealTimeService {

    List<HcvRealTime> findByWhere(HcvRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(HcvRealTime record);

    int insertSelective(HcvRealTime record);

    HcvRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HcvRealTime record);

    int updateByPrimaryKey(HcvRealTime record);

}

