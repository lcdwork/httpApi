package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class PowerLoadRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 负荷
     */
    private BigDecimal eload;

    /**
     * 用电用量
     */
    private BigDecimal etpc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getEload() {
        return eload;
    }

    public void setEload(BigDecimal eload) {
        this.eload = eload;
    }

    public BigDecimal getEtpc() {
        return etpc;
    }

    public void setEtpc(BigDecimal etpc) {
        this.etpc = etpc;
    }
}
