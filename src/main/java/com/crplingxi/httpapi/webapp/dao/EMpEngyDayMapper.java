package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EMpEngyDay;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EMpEngyDayMapper extends AbstractTransactionDAOSupport {
    public int insert(EMpEngyDay record) {
        return 0;
    }
    public List<EMpEngyDay> findByWhere(EMpEngyDay record) {
        return getPersistanceManager().find(getNamespace() + ".findByWhere", record);
    }
}
