package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.SteamRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.SteamRealTime;
import com.crplingxi.httpapi.webapp.service.SteamRealTimeService;

import java.util.List;

@TransactionService
public class SteamRealTimeServiceImpl implements SteamRealTimeService {

    @TransactionDAO("httpOracle")
    private SteamRealTimeMapper steamRealTimeMapper;

    @Override
    public List<SteamRealTime> findByWhere(SteamRealTime t) {
        return steamRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return steamRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SteamRealTime record) {
        return steamRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(SteamRealTime record) {
        return steamRealTimeMapper.insertSelective(record);
    }

    @Override
    public SteamRealTime selectByPrimaryKey(String id) {
        return steamRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SteamRealTime record) {
        return steamRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SteamRealTime record) {
        return steamRealTimeMapper.updateByPrimaryKey(record);
    }

}

