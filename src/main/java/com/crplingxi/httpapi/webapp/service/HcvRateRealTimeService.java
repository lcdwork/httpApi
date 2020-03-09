package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.HcvRateRealTime;

import java.util.List;

public interface HcvRateRealTimeService {

    List<HcvRateRealTime> findByWhere(HcvRateRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(HcvRateRealTime record);

    int insertSelective(HcvRateRealTime record);

    HcvRateRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HcvRateRealTime record);

    int updateByPrimaryKey(HcvRateRealTime record);

}

