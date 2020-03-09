package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.WaterRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class WaterRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<WaterRealTime> findByWhere(WaterRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(WaterRealTime record) {
        return 0;
    }

    public WaterRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(WaterRealTime record) {
        return 0;
    }
}
