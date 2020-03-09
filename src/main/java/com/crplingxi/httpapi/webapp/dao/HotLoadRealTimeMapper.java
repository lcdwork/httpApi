package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.HotLoadRealTime;
import com.crplingxi.httpapi.webapp.domain.WaterRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class HotLoadRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<HotLoadRealTime> findByWhere(HotLoadRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(HotLoadRealTime record) {
        return 0;
    }

    public HotLoadRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(HotLoadRealTime record) {
        return 0;
    }

    public int insertSelective(HotLoadRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(HotLoadRealTime record) {
        return 0;
    }
}
