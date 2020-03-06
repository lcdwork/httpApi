package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.TrafficRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class TrafficRealTimeMapper extends AbstractTransactionDAOSupport {
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(TrafficRealTime record) {
        return 0;
    }

    public TrafficRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(TrafficRealTime record) {
        return 0;
    }
}
