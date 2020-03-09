package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.EnvironmentRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.EnvironmentRealTime;
import com.crplingxi.httpapi.webapp.service.EnvironmentRealTimeService;

import java.util.List;

@TransactionService
public class EnvironmentRealTimeServiceImpl implements EnvironmentRealTimeService {

    @TransactionDAO("httpOracle")
    private EnvironmentRealTimeMapper environmentRealTimeMapper;

    @Override
    public List<EnvironmentRealTime> findByWhere(EnvironmentRealTime t) {
        return environmentRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return environmentRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EnvironmentRealTime record) {
        return environmentRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(EnvironmentRealTime record) {
        return environmentRealTimeMapper.insertSelective(record);
    }

    @Override
    public EnvironmentRealTime selectByPrimaryKey(String id) {
        return environmentRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(EnvironmentRealTime record) {
        return environmentRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EnvironmentRealTime record) {
        return environmentRealTimeMapper.updateByPrimaryKey(record);
    }

}

