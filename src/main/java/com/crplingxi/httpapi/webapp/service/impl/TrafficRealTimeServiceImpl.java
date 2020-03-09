package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.TrafficRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.TrafficRealTime;
import com.crplingxi.httpapi.webapp.service.TrafficRealTimeService;

import java.util.List;

@TransactionService
public class TrafficRealTimeServiceImpl implements TrafficRealTimeService {

    @TransactionDAO("httpOracle")
    private TrafficRealTimeMapper trafficRealTimeMapper;

    @Override
    public List<TrafficRealTime> findByWhere(TrafficRealTime t) {
        return trafficRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return trafficRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TrafficRealTime record) {
        return trafficRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(TrafficRealTime record) {
        return 0;
    }

    @Override
    public TrafficRealTime selectByPrimaryKey(String id) {
        return trafficRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TrafficRealTime record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TrafficRealTime record) {
        return trafficRealTimeMapper.updateByPrimaryKey(record);
    }

}

