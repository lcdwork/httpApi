package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.HccRateRealTime;

public interface HccRateRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(HccRateRealTime record);

    int insertSelective(HccRateRealTime record);

    HccRateRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HccRateRealTime record);

    int updateByPrimaryKey(HccRateRealTime record);

}

