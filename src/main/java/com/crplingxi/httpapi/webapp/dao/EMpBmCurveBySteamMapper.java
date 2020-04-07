package com.crplingxi.httpapi.webapp.dao;

import com.crplingxi.httpapi.webapp.domain.EMpBmCurveBySteam;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;

import java.util.List;

@TransactionDAO
public class EMpBmCurveBySteamMapper extends AbstractTransactionDAOSupport {

    public int insert(EMpBmCurveBySteam record) {
        return 0;
    }

    public List<EMpBmCurveBySteam> findSteamByWhere(EMpBmCurveBySteam record) {
        return getPersistanceManager().find(getNamespace() + ".findSteamByWhere", record);
    }
}
