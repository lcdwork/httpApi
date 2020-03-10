package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.EMpSslCurve;

import java.util.List;

public interface EMpSslCurveService{

    int insert(EMpSslCurve record);

    List<EMpSslCurve> findByWhere(EMpSslCurve record);

}
