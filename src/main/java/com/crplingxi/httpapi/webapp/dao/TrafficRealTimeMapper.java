package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.TrafficRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class TrafficRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<TrafficRealTime> findByWhere(TrafficRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

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
