package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.dao.EMpBmCurveMapper;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurve;
import com.crplingxi.httpapi.webapp.service.EMpBmCurveService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

import java.util.List;

@TransactionService
public class EMpBmCurveServiceImpl implements EMpBmCurveService{

    @TransactionDAO("httpOracle")
    private EMpBmCurveMapper eMpBmCurveMapper;

    @Override
    public int insert(EMpBmCurve record) {
        return eMpBmCurveMapper.insert(record);
    }

    @Override
    public List<EMpBmCurve> findByWhere(EMpBmCurve record) {
        return eMpBmCurveMapper.findByWhere(record);
    }

}
