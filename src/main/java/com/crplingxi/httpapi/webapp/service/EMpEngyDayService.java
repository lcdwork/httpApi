package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.EMpEngyDay;

import java.util.List;

public interface EMpEngyDayService{

    int insert(EMpEngyDay record);

    List<EMpEngyDay> findByWhere(EMpEngyDay record);

}
