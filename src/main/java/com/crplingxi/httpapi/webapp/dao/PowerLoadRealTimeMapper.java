package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.PowerLoadRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class PowerLoadRealTimeMapper extends AbstractTransactionDAOSupport {
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(PowerLoadRealTime record) {
        return 0;
    }

    public PowerLoadRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(PowerLoadRealTime record) {
        return 0;
    }

    public int insertSelective(PowerLoadRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(PowerLoadRealTime record) {
        return 0;
    }
}
