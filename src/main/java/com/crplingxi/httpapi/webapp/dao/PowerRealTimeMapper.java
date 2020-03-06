package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.PowerRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class PowerRealTimeMapper extends AbstractTransactionDAOSupport {
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(PowerRealTime record) {
        return 0;
    }

    public PowerRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(PowerRealTime record) {
        return 0;
    }

    public int insertSelective(PowerRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(PowerRealTime record) {
        return 0;
    }
}
