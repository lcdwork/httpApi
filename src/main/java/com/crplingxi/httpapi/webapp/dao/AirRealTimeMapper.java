package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.AirRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

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

    public List<AirRealTime> findByWhere(AirRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
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
