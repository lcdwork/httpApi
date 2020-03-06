package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.HcvRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class HcvRealTimeMapper extends AbstractTransactionDAOSupport {
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(HcvRealTime record) {
        return 0;
    }

    public HcvRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(HcvRealTime record) {
        return 0;
    }

    public int insertSelective(HcvRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(HcvRealTime record) {
        return 0;
    }
}
