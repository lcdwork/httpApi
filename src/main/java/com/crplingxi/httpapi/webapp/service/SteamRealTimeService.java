package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.SteamRealTime;

public interface SteamRealTimeService {


    int deleteByPrimaryKey(String id);

    int insert(SteamRealTime record);

    int insertSelective(SteamRealTime record);

    SteamRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SteamRealTime record);

    int updateByPrimaryKey(SteamRealTime record);

}

