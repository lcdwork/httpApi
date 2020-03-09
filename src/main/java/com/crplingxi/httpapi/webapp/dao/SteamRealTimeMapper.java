package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.SteamRealTime;
import com.crplingxi.httpapi.webapp.domain.WaterRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class SteamRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<SteamRealTime> findByWhere(SteamRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(SteamRealTime record) {
        return 0;
    }

    public SteamRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(SteamRealTime record) {
        return 0;
    }

    public int insertSelective(SteamRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(SteamRealTime record) {
        return 0;
    }
}
