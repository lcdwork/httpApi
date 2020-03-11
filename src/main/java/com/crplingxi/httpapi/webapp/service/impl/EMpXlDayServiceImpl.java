package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.dao.EMpXlDayMapper;
import com.crplingxi.httpapi.webapp.domain.EMpXlDay;
import com.crplingxi.httpapi.webapp.service.EMpXlDayService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

import java.util.List;

@TransactionService
public class EMpXlDayServiceImpl implements EMpXlDayService{

    @TransactionDAO("httpOracle")
    private EMpXlDayMapper eMpXlDayMapper;

    @Override
    public int insert(EMpXlDay record) {
        return eMpXlDayMapper.insert(record);
    }

    @Override
    public List<EMpXlDay> findByWhere(EMpXlDay record) {
        return eMpXlDayMapper.findByWhere(record);
    }

}
