package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.dao.EMpSslCurveMapper;
import com.crplingxi.httpapi.webapp.domain.EMpSslCurve;
import com.crplingxi.httpapi.webapp.service.EMpSslCurveService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

import java.util.List;

@TransactionService
public class EMpSslCurveServiceImpl implements EMpSslCurveService{

    @TransactionDAO("httpOracle")
    private EMpSslCurveMapper eMpSslCurveMapper;

    @Override
    public int insert(EMpSslCurve record) {
        return eMpSslCurveMapper.insert(record);
    }

    @Override
    public List<EMpSslCurve> findByWhere(EMpSslCurve record) {
        return eMpSslCurveMapper.findByWhere(record);
    }

}
