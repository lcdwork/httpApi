package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class TrafficRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 瞬时流速
     */
    private BigDecimal iv;

    /**
     * 瞬时流量
     */
    private BigDecimal ifr;

    /**
     * 累计用量
     */
    private BigDecimal cd;

    /**
     * 压力
     */
    private BigDecimal p;

    /**
     * 温度
     */
    private BigDecimal tpr;

    /**
     * 热值
     */
    private BigDecimal cv;

    /**
     * 当天系统COP
     */
    private BigDecimal daysystemcop;

    /**
     * 当月系统COP
     */
    private BigDecimal monsystemcop;

    /**
     * 当年系统COP
     */
    private BigDecimal yearsystemcop;

    /**
     * 瞬时系统COP
     */
    private BigDecimal instsystemcop;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getIv() {
        return iv;
    }

    public void setIv(BigDecimal iv) {
        this.iv = iv;
    }

    public BigDecimal getIfr() {
        return ifr;
    }

    public void setIfr(BigDecimal ifr) {
        this.ifr = ifr;
    }

    public BigDecimal getCd() {
        return cd;
    }

    public void setCd(BigDecimal cd) {
        this.cd = cd;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getTpr() {
        return tpr;
    }

    public void setTpr(BigDecimal tpr) {
        this.tpr = tpr;
    }

    public BigDecimal getCv() {
        return cv;
    }

    public void setCv(BigDecimal cv) {
        this.cv = cv;
    }

    public BigDecimal getDaysystemcop() {
        return daysystemcop;
    }

    public void setDaysystemcop(BigDecimal daysystemcop) {
        this.daysystemcop = daysystemcop;
    }

    public BigDecimal getMonsystemcop() {
        return monsystemcop;
    }

    public void setMonsystemcop(BigDecimal monsystemcop) {
        this.monsystemcop = monsystemcop;
    }

    public BigDecimal getYearsystemcop() {
        return yearsystemcop;
    }

    public void setYearsystemcop(BigDecimal yearsystemcop) {
        this.yearsystemcop = yearsystemcop;
    }

    public BigDecimal getInstsystemcop() {
        return instsystemcop;
    }

    public void setInstsystemcop(BigDecimal instsystemcop) {
        this.instsystemcop = instsystemcop;
    }
}
