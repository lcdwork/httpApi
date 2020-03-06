package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.domain.HccRealTime;
import com.crplingxi.httpapi.webapp.dao.HccRealTimeMapper;
import com.crplingxi.httpapi.webapp.service.HccRealTimeService;

@TransactionService
public class HccRealTimeServiceImpl implements HccRealTimeService {

    @TransactionDAO("gffpOracle")
    private HccRealTimeMapper hccRealTimeMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return hccRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HccRealTime record) {
        return hccRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(HccRealTime record) {
        return hccRealTimeMapper.insertSelective(record);
    }

    @Override
    public HccRealTime selectByPrimaryKey(String id) {
        return hccRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HccRealTime record) {
        return hccRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HccRealTime record) {
        return hccRealTimeMapper.updateByPrimaryKey(record);
    }

}

