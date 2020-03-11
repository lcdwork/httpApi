package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EMpBmDay;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EMpBmDayMapper extends AbstractTransactionDAOSupport {
    public int insert(EMpBmDay record) {
        return 0;
    }
    public List<EMpBmDay> findByWhere(EMpBmDay record) {
        return getPersistanceManager().find(getNamespace() + ".findByWhere", record);
    }
}
