package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;
import java.util.Date;

public class PowerDemandRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 正向最大需量抄表时间
     */
    private Date kwhlxcemtime;

    /**
     * 反向最大需量抄表时间
     */
    private Date kwhlexemtime;

    /**
     * 正向有功最大需量
     */
    private BigDecimal kwhlidem;

    /**
     * 正向有功最大需量时刻
     */
    private Date kwhlidemtime;

    /**
     * 正向无功最大需量
     */
    private BigDecimal kvarhlidem;

    /**
     * 正向无功最大需量时刻
     */
    private Date kvarhlidemtime;

    /**
     * 反向有功最大需量
     */
    private BigDecimal kwhledem;

    /**
     * 反向有功最大需量时刻
     */
    private Date kwhledemtime;

    /**
     * 反向无功最大需量
     */
    private BigDecimal kvarhledem;

    /**
     * 反向无功最大需量时刻
     */
    private Date kvarhledemtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getKwhlxcemtime() {
        return kwhlxcemtime;
    }

    public void setKwhlxcemtime(Date kwhlxcemtime) {
        this.kwhlxcemtime = kwhlxcemtime;
    }

    public Date getKwhlexemtime() {
        return kwhlexemtime;
    }

    public void setKwhlexemtime(Date kwhlexemtime) {
        this.kwhlexemtime = kwhlexemtime;
    }

    public BigDecimal getKwhlidem() {
        return kwhlidem;
    }

    public void setKwhlidem(BigDecimal kwhlidem) {
        this.kwhlidem = kwhlidem;
    }

    public Date getKwhlidemtime() {
        return kwhlidemtime;
    }

    public void setKwhlidemtime(Date kwhlidemtime) {
        this.kwhlidemtime = kwhlidemtime;
    }

    public BigDecimal getKvarhlidem() {
        return kvarhlidem;
    }

    public void setKvarhlidem(BigDecimal kvarhlidem) {
        this.kvarhlidem = kvarhlidem;
    }

    public Date getKvarhlidemtime() {
        return kvarhlidemtime;
    }

    public void setKvarhlidemtime(Date kvarhlidemtime) {
        this.kvarhlidemtime = kvarhlidemtime;
    }

    public BigDecimal getKwhledem() {
        return kwhledem;
    }

    public void setKwhledem(BigDecimal kwhledem) {
        this.kwhledem = kwhledem;
    }

    public Date getKwhledemtime() {
        return kwhledemtime;
    }

    public void setKwhledemtime(Date kwhledemtime) {
        this.kwhledemtime = kwhledemtime;
    }

    public BigDecimal getKvarhledem() {
        return kvarhledem;
    }

    public void setKvarhledem(BigDecimal kvarhledem) {
        this.kvarhledem = kvarhledem;
    }

    public Date getKvarhledemtime() {
        return kvarhledemtime;
    }

    public void setKvarhledemtime(Date kvarhledemtime) {
        this.kvarhledemtime = kvarhledemtime;
    }
}
