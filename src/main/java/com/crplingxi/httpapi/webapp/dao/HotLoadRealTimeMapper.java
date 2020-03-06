package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.HotLoadRealTime;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
@TransactionDAO
public class HotLoadRealTimeMapper extends AbstractTransactionDAOSupport {
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
