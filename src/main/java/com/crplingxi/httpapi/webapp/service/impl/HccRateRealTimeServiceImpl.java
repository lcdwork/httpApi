package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.HccRateRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.HccRateRealTime;
import com.crplingxi.httpapi.webapp.service.HccRateRealTimeService;

import java.util.List;

@TransactionService
public class HccRateRealTimeServiceImpl implements HccRateRealTimeService {

    @TransactionDAO("httpOracle")
    private HccRateRealTimeMapper hccRateRealTimeMapper;

    @Override
    public List<HccRateRealTime> findByWhere(HccRateRealTime t) {
        return hccRateRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return hccRateRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HccRateRealTime record) {
        return hccRateRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(HccRateRealTime record) {
        return hccRateRealTimeMapper.insertSelective(record);
    }

    @Override
    public HccRateRealTime selectByPrimaryKey(String id) {
        return hccRateRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HccRateRealTime record) {
        return hccRateRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HccRateRealTime record) {
        return hccRateRealTimeMapper.updateByPrimaryKey(record);
    }

}

