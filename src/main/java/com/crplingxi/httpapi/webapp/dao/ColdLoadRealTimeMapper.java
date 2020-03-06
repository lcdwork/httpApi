package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.ColdLoadRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class ColdLoadRealTimeMapper extends AbstractTransactionDAOSupport {
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(ColdLoadRealTime record) {
        return 0;
    }

    public ColdLoadRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(ColdLoadRealTime record) {
        return 0;
    }

    public int insertSelective(ColdLoadRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(ColdLoadRealTime record) {
        return 0;
    }
}
