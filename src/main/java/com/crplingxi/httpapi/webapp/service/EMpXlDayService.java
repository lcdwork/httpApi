package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.EMpXlDay;

import java.util.List;

public interface EMpXlDayService{

    int insert(EMpXlDay record);

    List<EMpXlDay> findByWhere(EMpXlDay record);

}
