package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.PowerRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.PowerRealTime;
import com.crplingxi.httpapi.webapp.service.PowerRealTimeService;

import java.util.List;

@TransactionService
public class PowerRealTimeServiceImpl implements PowerRealTimeService {

    @TransactionDAO("httpOracle")
    private PowerRealTimeMapper powerRealTimeMapper;

    @Override
    public List<PowerRealTime> findByWhere(PowerRealTime t) {
        return powerRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return powerRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PowerRealTime record) {
        return powerRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(PowerRealTime record) {
        return powerRealTimeMapper.insertSelective(record);
    }

    @Override
    public PowerRealTime selectByPrimaryKey(String id) {
        return powerRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PowerRealTime record) {
        return powerRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PowerRealTime record) {
        return powerRealTimeMapper.updateByPrimaryKey(record);
    }

}

