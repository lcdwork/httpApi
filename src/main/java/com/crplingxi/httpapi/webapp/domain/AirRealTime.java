package com.crplingxi.httpapi.webapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class AirRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 二氧化硫浓度
     */
    private BigDecimal cso2;

    /**
     * 氮氧化物浓度
     */
    private BigDecimal cnox;

    /**
     * 一氧化碳浓度
     */
    private BigDecimal cco;

    /**
     * 碳排放量
     */
    private BigDecimal c;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getCso2() {
        return cso2;
    }

    public void setCso2(BigDecimal cso2) {
        this.cso2 = cso2;
    }

    public BigDecimal getCnox() {
        return cnox;
    }

    public void setCnox(BigDecimal cnox) {
        this.cnox = cnox;
    }

    public BigDecimal getCco() {
        return cco;
    }

    public void setCco(BigDecimal cco) {
        this.cco = cco;
    }

    public BigDecimal getC() {
        return c;
    }

    public void setC(BigDecimal c) {
        this.c = c;
    }
}
