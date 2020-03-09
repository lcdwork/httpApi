package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EnvironmentRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EnvironmentRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<EnvironmentRealTime> findByWhere(EnvironmentRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(EnvironmentRealTime record) {
        return 0;
    }

    public EnvironmentRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(EnvironmentRealTime record) {
        return 0;
    }

    public int insertSelective(EnvironmentRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(EnvironmentRealTime record) {
        return 0;
    }
}
