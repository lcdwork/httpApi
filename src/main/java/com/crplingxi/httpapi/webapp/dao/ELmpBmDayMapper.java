package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.ELmpBmDay;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class ELmpBmDayMapper extends AbstractTransactionDAOSupport {
    public int insert(ELmpBmDay record) {
        return 0;
    }
    public List<ELmpBmDay> findByWhere(ELmpBmDay record) {
        return getPersistanceManager().find(getNamespace() + ".findByWhere", record);
    }
}
