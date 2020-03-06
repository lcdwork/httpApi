package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.PowerDemandRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class PowerDemandRealTimeMapper extends AbstractTransactionDAOSupport {
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
