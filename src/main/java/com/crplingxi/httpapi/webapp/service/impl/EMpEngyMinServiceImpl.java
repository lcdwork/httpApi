package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.domain.EMpBmCurve;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.dao.EMpEngyMinMapper;
import com.crplingxi.httpapi.webapp.domain.EMpEngyMin;
import com.crplingxi.httpapi.webapp.service.EMpEngyMinService;

import java.util.List;

@TransactionService
public class EMpEngyMinServiceImpl implements EMpEngyMinService{

    @TransactionDAO("httpOracle")
    private EMpEngyMinMapper eMpEngyMinMapper;

    @Override
    public int insert(EMpEngyMin record) {
        return eMpEngyMinMapper.insert(record);
    }

    @Override
    public List<EMpEngyMin> findByWhere(EMpEngyMin record) {
        return eMpEngyMinMapper.findByWhere(record);
    }

}
