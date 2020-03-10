package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EMpBmCurve;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EMpBmCurveMapper extends AbstractTransactionDAOSupport {
    public int insert(EMpBmCurve record) {
        return 0;
    }
    public List<EMpBmCurve> findByWhere(EMpBmCurve record) {
        return getPersistanceManager().find(getNamespace() + ".findByWhere", record);
    }
}
