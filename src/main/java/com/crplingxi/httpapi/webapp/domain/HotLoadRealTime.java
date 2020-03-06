package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class HotLoadRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 负荷
     */
    private BigDecimal hload;

    /**
     * 用热用量
     */
    private BigDecimal hetpc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getHload() {
        return hload;
    }

    public void setHload(BigDecimal hload) {
        this.hload = hload;
    }

    public BigDecimal getHetpc() {
        return hetpc;
    }

    public void setHetpc(BigDecimal hetpc) {
        this.hetpc = hetpc;
    }
}
