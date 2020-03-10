package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.domain.ELmpBmDay;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.ELmpEngyDayMapper;
import com.crplingxi.httpapi.webapp.domain.ELmpEngyDay;
import com.crplingxi.httpapi.webapp.service.ELmpEngyDayService;

import java.util.List;

@TransactionService
public class ELmpEngyDayServiceImpl implements ELmpEngyDayService{

    @TransactionDAO("httpOracle")
    private ELmpEngyDayMapper eLmpEngyDayMapper;

    @Override
    public int insert(ELmpEngyDay record) {
        return eLmpEngyDayMapper.insert(record);
    }

    @Override
    public List<ELmpEngyDay> findByWhere(ELmpEngyDay record) {
        return eLmpEngyDayMapper.findByWhere(record);
    }

}
