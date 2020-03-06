package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.WaterRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.WaterRealTime;
import com.crplingxi.httpapi.webapp.service.WaterRealTimeService;

@TransactionService
public class WaterRealTimeServiceImpl implements WaterRealTimeService {

    @TransactionDAO("gffpOracle")
    private WaterRealTimeMapper waterRealTimeMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return waterRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WaterRealTime record) {
        return waterRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(WaterRealTime record) {
        return 0;
    }

    @Override
    public WaterRealTime selectByPrimaryKey(String id) {
        return waterRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WaterRealTime record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(WaterRealTime record) {
        return waterRealTimeMapper.updateByPrimaryKey(record);
    }

}

