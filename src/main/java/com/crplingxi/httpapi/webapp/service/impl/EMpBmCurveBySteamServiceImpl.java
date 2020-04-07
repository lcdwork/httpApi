package com.crplingxi.httpapi.webapp.service.impl;

import com.crplingxi.httpapi.webapp.dao.EMpBmCurveBySteamMapper;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurveBySteam;
import com.crplingxi.httpapi.webapp.service.EMpBmCurveBySteamService;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

import java.util.List;

@TransactionService
public class EMpBmCurveBySteamServiceImpl implements EMpBmCurveBySteamService {

    @TransactionDAO("httpOracle")
    private EMpBmCurveBySteamMapper eMpBmCurveBySteamMapper;

    @Override
    public int insert(EMpBmCurveBySteam record) {
        return eMpBmCurveBySteamMapper.insert(record);
    }

    @Override
    public List<EMpBmCurveBySteam> findSteamByWhere(EMpBmCurveBySteam record) {
        return eMpBmCurveBySteamMapper.findSteamByWhere(record);
    }

}
