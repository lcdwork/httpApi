package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.domain.ELmpBmDay;
import com.crplingxi.httpapi.webapp.dao.ELmpBmDayMapper;
import com.crplingxi.httpapi.webapp.service.ELmpBmDayService;

import java.util.List;

@TransactionService
public class ELmpBmDayServiceImpl implements ELmpBmDayService{

    @TransactionDAO("httpOracle")
    private ELmpBmDayMapper eLmpBmDayMapper;

    @Override
    public int insert(ELmpBmDay record) {
        return eLmpBmDayMapper.insert(record);
    }

    @Override
    public List<ELmpBmDay> findByWhere(ELmpBmDay record) {
        return eLmpBmDayMapper.findByWhere(record);
    }

}
