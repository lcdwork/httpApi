package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.EMpBmDay;

import java.util.List;

public interface EMpBmDayService{

    int insert(EMpBmDay record);

    List<EMpBmDay> findByWhere(EMpBmDay record);

}
