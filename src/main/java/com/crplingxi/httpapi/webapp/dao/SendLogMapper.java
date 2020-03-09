package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.SendLog;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

@TransactionDAO
public class SendLogMapper extends AbstractTransactionDAOSupport {
    public int insert(SendLog record) {
        return getPersistanceManager().insert(getNamespace() + ".insert", record);
    }
}
