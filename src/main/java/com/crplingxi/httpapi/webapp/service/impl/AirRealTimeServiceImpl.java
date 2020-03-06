package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.service.AirRealTimeService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.crplingxi.httpapi.webapp.dao.AirRealTimeMapper;

@TransactionService
public class AirRealTimeServiceImpl implements AirRealTimeService {

    @TransactionDAO("gffpOracle")
    private AirRealTimeMapper airRealTimeMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return airRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AirRealTime record) {
        return airRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(AirRealTime record) {
        return airRealTimeMapper.insertSelective(record);
    }

    @Override
    public AirRealTime selectByPrimaryKey(String id) {
        return airRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AirRealTime record) {
        return airRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AirRealTime record) {
        return airRealTimeMapper.updateByPrimaryKey(record);
    }

}

