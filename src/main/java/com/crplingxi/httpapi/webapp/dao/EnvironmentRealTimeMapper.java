package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EnvironmentRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class EnvironmentRealTimeMapper extends AbstractTransactionDAOSupport {
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
