package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.domain.SteamRealTime;

import java.util.List;

public interface SteamRealTimeService {

    List<SteamRealTime> findByWhere(SteamRealTime t);

    int deleteByPrimaryKey(String id);

    int insert(SteamRealTime record);

    int insertSelective(SteamRealTime record);

    SteamRealTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SteamRealTime record);

    int updateByPrimaryKey(SteamRealTime record);

}

