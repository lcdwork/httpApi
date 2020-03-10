package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.ELmpEngyDay;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class ELmpEngyDayMapper extends AbstractTransactionDAOSupport {
    public int insert(ELmpEngyDay record) {
        return 0;
    }
    public List<ELmpEngyDay> findByWhere(ELmpEngyDay record) {
        return getPersistanceManager().find(getNamespace() + ".findByWhere", record);
    }
}
