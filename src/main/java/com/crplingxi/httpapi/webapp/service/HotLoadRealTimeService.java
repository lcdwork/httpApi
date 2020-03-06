package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.HotLoadRealTime;

public interface HotLoadRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(HotLoadRealTime record);

    int insertSelective(HotLoadRealTime record);

    HotLoadRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HotLoadRealTime record);

    int updateByPrimaryKey(HotLoadRealTime record);

}

