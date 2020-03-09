package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.PowerDemandRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.PowerDemandRealTime;
import com.crplingxi.httpapi.webapp.service.PowerDemandRealTimeService;

import java.util.List;

@TransactionService
public class PowerDemandRealTimeServiceImpl implements PowerDemandRealTimeService {

    @TransactionDAO("httpOracle")
    private PowerDemandRealTimeMapper powerDemandRealTimeMapper;

    @Override
    public List<PowerDemandRealTime> findByWhere(PowerDemandRealTime t) {
        return powerDemandRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return powerDemandRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PowerDemandRealTime record) {
        return powerDemandRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(PowerDemandRealTime record) {
        return powerDemandRealTimeMapper.insertSelective(record);
    }

    @Override
    public PowerDemandRealTime selectByPrimaryKey(String id) {
        return powerDemandRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PowerDemandRealTime record) {
        return powerDemandRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PowerDemandRealTime record) {
        return powerDemandRealTimeMapper.updateByPrimaryKey(record);
    }

}

