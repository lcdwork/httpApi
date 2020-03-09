package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.HcvRealTime;
import com.crplingxi.httpapi.webapp.domain.WaterRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class HcvRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<HcvRealTime> findByWhere(HcvRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

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
