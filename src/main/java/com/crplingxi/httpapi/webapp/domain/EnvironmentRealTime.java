package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class EnvironmentRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 温度
     */
    private BigDecimal envtpr;

    /**
     * 压力
     */
    private BigDecimal envp;

    /**
     * 粉尘
     */
    private BigDecimal dust;

    /**
     * 湿度
     */
    private BigDecimal h;

    /**
     * 风速
     */
    private BigDecimal ws;

    /**
     * 天气状况
     */
    private String wc;

    /**
     * 风向
     */
    private String wd;

    /**
     * 二氧化碳浓度
     */
    private BigDecimal cco2;

    /**
     * 光照强度
     */
    private BigDecimal gzqd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getEnvtpr() {
        return envtpr;
    }

    public void setEnvtpr(BigDecimal envtpr) {
        this.envtpr = envtpr;
    }

    public BigDecimal getEnvp() {
        return envp;
    }

    public void setEnvp(BigDecimal envp) {
        this.envp = envp;
    }

    public BigDecimal getDust() {
        return dust;
    }

    public void setDust(BigDecimal dust) {
        this.dust = dust;
    }

    public BigDecimal getH() {
        return h;
    }

    public void setH(BigDecimal h) {
        this.h = h;
    }

    public BigDecimal getWs() {
        return ws;
    }

    public void setWs(BigDecimal ws) {
        this.ws = ws;
    }

    public String getWc() {
        return wc;
    }

    public void setWc(String wc) {
        this.wc = wc;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public BigDecimal getCco2() {
        return cco2;
    }

    public void setCco2(BigDecimal cco2) {
        this.cco2 = cco2;
    }

    public BigDecimal getGzqd() {
        return gzqd;
    }

    public void setGzqd(BigDecimal gzqd) {
        this.gzqd = gzqd;
    }
}
