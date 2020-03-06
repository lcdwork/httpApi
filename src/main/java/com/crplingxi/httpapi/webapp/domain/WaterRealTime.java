package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class WaterRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 瞬时流量
     */
    private BigDecimal waterif;

    /**
     * 累计流量
     */
    private BigDecimal watersf;

    /**
     * 温度
     */
    private BigDecimal watertemp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getWaterif() {
        return waterif;
    }

    public void setWaterif(BigDecimal waterif) {
        this.waterif = waterif;
    }

    public BigDecimal getWatersf() {
        return watersf;
    }

    public void setWatersf(BigDecimal watersf) {
        this.watersf = watersf;
    }

    public BigDecimal getWatertemp() {
        return watertemp;
    }

    public void setWatertemp(BigDecimal watertemp) {
        this.watertemp = watertemp;
    }
}
