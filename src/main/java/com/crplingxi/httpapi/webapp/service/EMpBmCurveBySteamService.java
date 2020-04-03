package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.EMpBmCurveBySteam;

import java.util.List;

public interface EMpBmCurveBySteamService {

    int insert(EMpBmCurveBySteam record);

    List<EMpBmCurveBySteam> findSteamByWhere(EMpBmCurveBySteam record);

}
