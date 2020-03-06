package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class ColdLoadRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 负荷
     */
    private BigDecimal cload;

    /**
     * 用冷用量
     */
    private BigDecimal ctpc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getCload() {
        return cload;
    }

    public void setCload(BigDecimal cload) {
        this.cload = cload;
    }

    public BigDecimal getCtpc() {
        return ctpc;
    }

    public void setCtpc(BigDecimal ctpc) {
        this.ctpc = ctpc;
    }
}
