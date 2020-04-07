package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.dao.EMpBmCurveByWaterMapper;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurveByWater;
import com.crplingxi.httpapi.webapp.service.EMpBmCurveByWaterService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

import java.util.List;

@TransactionService
public class EMpBmCurveByWaterServiceImpl implements EMpBmCurveByWaterService {

    @TransactionDAO("httpOracle")
    private EMpBmCurveByWaterMapper eMpBmCurveByWaterMapper;

    @Override
    public int insert(EMpBmCurveByWater record) {
        return eMpBmCurveByWaterMapper.insert(record);
    }

    @Override
    public List<EMpBmCurveByWater> findWaterByWhere(EMpBmCurveByWater record) {
        return eMpBmCurveByWaterMapper.findWaterByWhere(record);
    }

}
