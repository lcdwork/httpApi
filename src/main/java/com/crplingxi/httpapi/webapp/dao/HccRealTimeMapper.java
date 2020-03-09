package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.HccRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class HccRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<HccRealTime> findByWhere(HccRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(HccRealTime record) {
        return 0;
    }

    public HccRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(HccRealTime record) {
        return 0;
    }

    public int insertSelective(HccRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(HccRealTime record) {
        return 0;
    }
}
