package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.ElectricRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class ElectricRealTimeMapper extends AbstractTransactionDAOSupport {

    public List<ElectricRealTime> findByWhere(ElectricRealTime t) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", t);
    }

    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    public int insert(ElectricRealTime record) {
        return 0;
    }

    public ElectricRealTime selectByPrimaryKey(String id) {
        return null;
    }

    public int updateByPrimaryKey(ElectricRealTime record) {
        return 0;
    }

    public int insertSelective(ElectricRealTime record) {
        return 0;
    }

    public int updateByPrimaryKeySelective(ElectricRealTime record) {
        return 0;
    }
}
