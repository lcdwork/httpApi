package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.PowerDemandRealTime;
import com.crplingxi.httpapi.webapp.domain.WaterRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class PowerDemandRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<PowerDemandRealTime> findByWhere(PowerDemandRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(PowerDemandRealTime record) {
        return 0;
    }

    public PowerDemandRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(PowerDemandRealTime record) {
        return 0;
    }

    public int insertSelective(PowerDemandRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(PowerDemandRealTime record) {
        return 0;
    }
}
