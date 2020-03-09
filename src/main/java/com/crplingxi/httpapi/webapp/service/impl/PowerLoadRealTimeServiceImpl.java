package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.domain.PowerLoadRealTime;
import com.crplingxi.httpapi.webapp.dao.PowerLoadRealTimeMapper;
import com.crplingxi.httpapi.webapp.service.PowerLoadRealTimeService;

import java.util.List;

@TransactionService
public class PowerLoadRealTimeServiceImpl implements PowerLoadRealTimeService {

    @TransactionDAO("httpOracle")
    private PowerLoadRealTimeMapper powerLoadRealTimeMapper;

    @Override
    public List<PowerLoadRealTime> findByWhere(PowerLoadRealTime t) {
        return powerLoadRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return powerLoadRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PowerLoadRealTime record) {
        return powerLoadRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(PowerLoadRealTime record) {
        return powerLoadRealTimeMapper.insertSelective(record);
    }

    @Override
    public PowerLoadRealTime selectByPrimaryKey(String id) {
        return powerLoadRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PowerLoadRealTime record) {
        return powerLoadRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PowerLoadRealTime record) {
        return powerLoadRealTimeMapper.updateByPrimaryKey(record);
    }

}

