package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.dao.EMpBmDayMapper;
import com.crplingxi.httpapi.webapp.domain.EMpBmDay;
import com.crplingxi.httpapi.webapp.service.EMpBmDayService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

import java.util.List;

@TransactionService
public class EMpBmDayServiceImpl implements EMpBmDayService{

    @TransactionDAO("httpOracle")
    private EMpBmDayMapper eMpBmDayMapper;

    @Override
    public int insert(EMpBmDay record) {
        return eMpBmDayMapper.insert(record);
    }
    @Override
    public List<EMpBmDay> findByWhere(EMpBmDay record) {
        return eMpBmDayMapper.findByWhere(record);
    }

}
