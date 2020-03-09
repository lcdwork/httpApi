package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.domain.HcvRealTime;
import com.crplingxi.httpapi.webapp.dao.HcvRealTimeMapper;
import com.crplingxi.httpapi.webapp.service.HcvRealTimeService;

import java.util.List;

@TransactionService
public class HcvRealTimeServiceImpl implements HcvRealTimeService {

    @TransactionDAO("httpOracle")
    private HcvRealTimeMapper hcvRealTimeMapper;

    @Override
    public List<HcvRealTime> findByWhere(HcvRealTime t) {
        return hcvRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return hcvRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HcvRealTime record) {
        return hcvRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(HcvRealTime record) {
        return hcvRealTimeMapper.insertSelective(record);
    }

    @Override
    public HcvRealTime selectByPrimaryKey(String id) {
        return hcvRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HcvRealTime record) {
        return hcvRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HcvRealTime record) {
        return hcvRealTimeMapper.updateByPrimaryKey(record);
    }

}

