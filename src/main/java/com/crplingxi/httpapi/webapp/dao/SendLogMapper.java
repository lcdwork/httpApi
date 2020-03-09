package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.SendLog;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

@TransactionDAO
public class SendLogMapper extends AbstractTransactionDAOSupport {
    public int insert(SendLog record) {
        return getPersistanceManager().insert(getNamespace() + ".insert", record);
    }

    public SendLog getLastLog(SendLog record){
        return getPersistanceManager().load(getNamespace() + ".findLast", record);
    }
}
