package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.HcvRateRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class HcvRateRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<HcvRateRealTime> findByWhere(HcvRateRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(HcvRateRealTime record) {
        return 0;
    }

    public HcvRateRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(HcvRateRealTime record) {
        return 0;
    }

    public int insertSelective(HcvRateRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(HcvRateRealTime record) {
        return 0;
    }
}
