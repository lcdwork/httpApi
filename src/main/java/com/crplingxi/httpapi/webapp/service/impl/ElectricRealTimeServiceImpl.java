package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.domain.ElectricRealTime;
import com.crplingxi.httpapi.webapp.dao.ElectricRealTimeMapper;
import com.crplingxi.httpapi.webapp.service.ElectricRealTimeService;

import java.util.List;

@TransactionService
public class ElectricRealTimeServiceImpl implements ElectricRealTimeService {

    @TransactionDAO("httpOracle")
    private ElectricRealTimeMapper electricRealTimeMapper;

    @Override
    public List<ElectricRealTime> findByWhere(ElectricRealTime t) {
        return electricRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return electricRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ElectricRealTime record) {
        return electricRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(ElectricRealTime record) {
        return electricRealTimeMapper.insertSelective(record);
    }

    @Override
    public ElectricRealTime selectByPrimaryKey(String id) {
        return electricRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ElectricRealTime record) {
        return electricRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ElectricRealTime record) {
        return electricRealTimeMapper.updateByPrimaryKey(record);
    }

}

