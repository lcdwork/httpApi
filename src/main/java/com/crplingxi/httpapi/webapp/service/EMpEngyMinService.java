package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.EMpEngyMin;

import java.util.List;

public interface EMpEngyMinService{

    int insert(EMpEngyMin record);

    List<EMpEngyMin> findByWhere(EMpEngyMin record);

}
