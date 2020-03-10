package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EMpEngyMin;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EMpEngyMinMapper extends AbstractTransactionDAOSupport {
    public int insert(EMpEngyMin record) {
        return 0;
    }
    public List<EMpEngyMin> findByWhere(EMpEngyMin record) {
        return getPersistanceManager().find(getNamespace() + ".findByWhere", record);
    }
}
