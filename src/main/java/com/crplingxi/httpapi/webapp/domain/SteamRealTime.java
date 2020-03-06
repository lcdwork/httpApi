package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class SteamRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 瞬时流量
     */
    private BigDecimal steamif;

    /**
     * 累计流量
     */
    private BigDecimal steamsf;

    /**
     * 温度
     */
    private BigDecimal steamtemp;

    /**
     * 压力
     */
    private BigDecimal steampr;

    /**
     * 累计热量
     */
    private BigDecimal steamsh;

    /**
     * 瞬时热量
     */
    private BigDecimal steamih;

    /**
     * 密度
     */
    private BigDecimal dens;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getSteamif() {
        return steamif;
    }

    public void setSteamif(BigDecimal steamif) {
        this.steamif = steamif;
    }

    public BigDecimal getSteamsf() {
        return steamsf;
    }

    public void setSteamsf(BigDecimal steamsf) {
        this.steamsf = steamsf;
    }

    public BigDecimal getSteamtemp() {
        return steamtemp;
    }

    public void setSteamtemp(BigDecimal steamtemp) {
        this.steamtemp = steamtemp;
    }

    public BigDecimal getSteampr() {
        return steampr;
    }

    public void setSteampr(BigDecimal steampr) {
        this.steampr = steampr;
    }

    public BigDecimal getSteamsh() {
        return steamsh;
    }

    public void setSteamsh(BigDecimal steamsh) {
        this.steamsh = steamsh;
    }

    public BigDecimal getSteamih() {
        return steamih;
    }

    public void setSteamih(BigDecimal steamih) {
        this.steamih = steamih;
    }

    public BigDecimal getDens() {
        return dens;
    }

    public void setDens(BigDecimal dens) {
        this.dens = dens;
    }
}
