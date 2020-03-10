package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.ELmpBmDay;

import java.util.List;

public interface ELmpBmDayService{

    int insert(ELmpBmDay record);

    List<ELmpBmDay> findByWhere(ELmpBmDay record);

}
