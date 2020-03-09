package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.HotLoadRealTimeMapper;
import com.crplingxi.httpapi.webapp.domain.HotLoadRealTime;
import com.crplingxi.httpapi.webapp.service.HotLoadRealTimeService;

import java.util.List;

@TransactionService
public class HotLoadRealTimeServiceImpl implements HotLoadRealTimeService {

    @TransactionDAO("httpOracle")
    private HotLoadRealTimeMapper hotLoadRealTimeMapper;

    @Override
    public List<HotLoadRealTime> findByWhere(HotLoadRealTime t) {
        return hotLoadRealTimeMapper.findByWhere(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return hotLoadRealTimeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HotLoadRealTime record) {
        return hotLoadRealTimeMapper.insert(record);
    }

    @Override
    public int insertSelective(HotLoadRealTime record) {
        return hotLoadRealTimeMapper.insertSelective(record);
    }

    @Override
    public HotLoadRealTime selectByPrimaryKey(String id) {
        return hotLoadRealTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HotLoadRealTime record) {
        return hotLoadRealTimeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(HotLoadRealTime record) {
        return hotLoadRealTimeMapper.updateByPrimaryKey(record);
    }

}

