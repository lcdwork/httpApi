package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.HcvRateRealTime;

public interface HcvRateRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(HcvRateRealTime record);

    int insertSelective(HcvRateRealTime record);

    HcvRateRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HcvRateRealTime record);

    int updateByPrimaryKey(HcvRateRealTime record);

}

