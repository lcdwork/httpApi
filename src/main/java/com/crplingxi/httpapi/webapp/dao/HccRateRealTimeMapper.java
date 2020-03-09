package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.HccRateRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class HccRateRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<HccRateRealTime> findByWhere(HccRateRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(HccRateRealTime record) {
        return 0;
    }

    public HccRateRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(HccRateRealTime record) {
        return 0;
    }

    public int insertSelective(HccRateRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(HccRateRealTime record) {
        return 0;
    }
}
