package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.domain.HcvRateRealTime;
import com.crplingxi.httpapi.webapp.dao.HcvRateRealTimeMapper;
import com.crplingxi.httpapi.webapp.service.HcvRateRealTimeService;

@TransactionService
public class HcvRateRealTimeServiceImpl implements HcvRateRealTimeService {

    @TransactionDAO("gffpOracle")
    private HcvRateRealTimeMapper hcvRateRealTimeMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return hcvRateRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HcvRateRealTime record) {
        return hcvRateRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(HcvRateRealTime record) {
        return hcvRateRealTimeMapper.insertSelective(record);
    }

    @Override
    public HcvRateRealTime selectByPrimaryKey(String id) {
        return hcvRateRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HcvRateRealTime record) {
        return hcvRateRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HcvRateRealTime record) {
        return hcvRateRealTimeMapper.updateByPrimaryKey(record);
    }

}

