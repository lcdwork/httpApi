package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EMpBmCurveByWater;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EMpBmCurveByWaterMapper extends AbstractTransactionDAOSupport {

    public int insert(EMpBmCurveByWater record) {
        return 0;
    }

    public List<EMpBmCurveByWater> findWaterByWhere(EMpBmCurveByWater record) {
        return getPersistanceManager().find(getNamespace() + ".findWaterByWhere", record);
    }
}
