package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.ELmpEngyDay;
import com.crplingxi.httpapi.webapp.domain.EMpBmCurve;

import java.util.List;

public interface EMpBmCurveService{

    int insert(EMpBmCurve record);

    List<EMpBmCurve> findByWhere(EMpBmCurve record);

}
