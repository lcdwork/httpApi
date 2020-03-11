package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EMpXlDay;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EMpXlDayMapper extends AbstractTransactionDAOSupport {
    public int insert(EMpXlDay record) {
        return 0;
    }

    public List<EMpXlDay> findByWhere(EMpXlDay record) {
        return getPersistanceManager().find(getNamespace() + ".findByWhere", record);
    }
}
