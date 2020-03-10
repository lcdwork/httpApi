package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EMpSslCurve;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EMpSslCurveMapper extends AbstractTransactionDAOSupport {
    public int insert(EMpSslCurve record) {
        return 0;
    }
    public List<EMpSslCurve> findByWhere(EMpSslCurve record) {
        return getPersistanceManager().find(getNamespace() + ".findByWhere", record);
    }
}
