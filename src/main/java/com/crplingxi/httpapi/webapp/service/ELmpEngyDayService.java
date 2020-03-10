package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.ELmpBmDay;
import com.crplingxi.httpapi.webapp.domain.ELmpEngyDay;

import java.util.List;

public interface ELmpEngyDayService{

    int insert(ELmpEngyDay record);

    List<ELmpEngyDay> findByWhere(ELmpEngyDay record);

}
