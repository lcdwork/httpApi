package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class AirRealTimeMapper extends AbstractTransactionDAOSupport {
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(AirRealTime record) {
        return getPersistanceManager().insert(getNamespace() + ".insert", record);
    }

    public AirRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(AirRealTime record) {
        return 0;
    }

    public int insertSelective(AirRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(AirRealTime record) {
        return 0;
    }
}
