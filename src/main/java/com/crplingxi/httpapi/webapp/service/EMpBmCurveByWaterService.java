package com.crplingxi.httpapi.webapp.service;

import com.crplingxi.httpapi.webapp.domain.EMpBmCurveByWater;

import java.util.List;

public interface EMpBmCurveByWaterService {

    int insert(EMpBmCurveByWater record);

    List<EMpBmCurveByWater> findWaterByWhere(EMpBmCurveByWater record);

}
