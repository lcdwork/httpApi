package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.ColdLoadRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.ColdLoadRealTime;
import com.crplingxi.httpapi.webapp.service.ColdLoadRealTimeService;

@TransactionService
public class ColdLoadRealTimeServiceImpl implements ColdLoadRealTimeService {

    @TransactionDAO("gffpOracle")
    private ColdLoadRealTimeMapper coldLoadRealTimeMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return coldLoadRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ColdLoadRealTime record) {
        return coldLoadRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(ColdLoadRealTime record) {
        return coldLoadRealTimeMapper.insertSelective(record);
    }

    @Override
    public ColdLoadRealTime selectByPrimaryKey(String id) {
        return coldLoadRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ColdLoadRealTime record) {
        return coldLoadRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ColdLoadRealTime record) {
        return coldLoadRealTimeMapper.updateByPrimaryKey(record);
    }

}

