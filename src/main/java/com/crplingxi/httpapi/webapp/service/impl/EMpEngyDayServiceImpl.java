package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.dao.EMpEngyDayMapper;
import com.crplingxi.httpapi.webapp.domain.EMpEngyDay;
import com.crplingxi.httpapi.webapp.service.EMpEngyDayService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

import java.util.List;

@TransactionService
public class EMpEngyDayServiceImpl implements EMpEngyDayService{

    @TransactionDAO("httpOracle")
    private EMpEngyDayMapper eMpEngyDayMapper;

    @Override
    public int insert(EMpEngyDay record) {
        return eMpEngyDayMapper.insert(record);
    }

    @Override
    public List<EMpEngyDay> findByWhere(EMpEngyDay record) {
        return eMpEngyDayMapper.findByWhere(record);
    }

}
