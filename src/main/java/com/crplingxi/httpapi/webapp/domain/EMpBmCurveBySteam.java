package com.crplingxi.httpapi.webapp.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.riozenc.titanTool.mybatis.MybatisEntity;

import java.math.BigDecimal;
import java.util.Date;

public class EMpBmCurveBySteam implements MybatisEntity {
    @JSONField(name = "sn")
    private String mpedId;

    private String uid;

    @JSONField(name = "time")
    private Date dataTime;

    @JSONField(serialize = false)
    private String modifyFlag;

    @JSONField(name = "steamsf")
    private BigDecimal p1r0;

    @JSONField(serialize = false)
    private Integer p1r0P;

    @JSONField(name = "steamsh")
    private BigDecimal p2r0;

    @JSONField(serialize = false)
    private Integer p2r0P;

    @JSONField(name = "steamif")
    private BigDecimal p3r0;

    @JSONField(serialize = false)
    private Integer p3r0P;

    @JSONField(name = "steamih")
    private BigDecimal p4r0;

    @JSONField(serialize = false)
    private Integer p4r0P;

    @JSONField(name = "steamtemp")
    private BigDecimal p5r0;

    @JSONField(serialize = false)
    private Integer p5r0P;

    @JSONField(name = "steampr")
    private BigDecimal p6r0;

    @JSONField(serialize = false)
    private Integer p6r0P;

    @JSONField(name = "dens")
    private BigDecimal p7r0;

    @JSONField(serialize = false)
    private Integer p7r0P;

    @JSONField(serialize = false)
    private BigDecimal p8r0;

    @JSONField(serialize = false)
    private Integer p8r0P;

    @JSONField(serialize = false)
    private BigDecimal p1r1;

    @JSONField(serialize = false)
    private BigDecimal p2r1;

    @JSONField(serialize = false)
    private BigDecimal p3r1;

    @JSONField(serialize = false)
    private BigDecimal p4r1;

    @JSONField(serialize = false)
    private BigDecimal p5r1;

    @JSONField(serialize = false)
    private BigDecimal p6r1;

    @JSONField(serialize = false)
    private BigDecimal p7r1;

    @JSONField(serialize = false)
    private BigDecimal p8r1;

    @JSONField(serialize = false)
    private BigDecimal p1r2;

    @JSONField(serialize = false)
    private BigDecimal p2r2;

    @JSONField(serialize = false)
    private BigDecimal p3r2;

    @JSONField(serialize = false)
    private BigDecimal p4r2;

    @JSONField(serialize = false)
    private BigDecimal p5r2;

    @JSONField(serialize = false)
    private BigDecimal p6r2;

    @JSONField(serialize = false)
    private BigDecimal p7r2;

    @JSONField(serialize = false)
    private BigDecimal p8r2;

    @JSONField(serialize = false)
    private BigDecimal p1r3;

    @JSONField(serialize = false)
    private BigDecimal p2r3;

    @JSONField(serialize = false)
    private BigDecimal p3r3;

    @JSONField(serialize = false)
    private BigDecimal p4r3;

    @JSONField(serialize = false)
    private BigDecimal p5r3;

    @JSONField(serialize = false)
    private BigDecimal p6r3;

    @JSONField(serialize = false)
    private BigDecimal p7r3;

    @JSONField(serialize = false)
    private BigDecimal p8r3;

    @JSONField(serialize = false)
    private BigDecimal p1r4;

    @JSONField(serialize = false)
    private BigDecimal p2r4;

    @JSONField(serialize = false)
    private BigDecimal p3r4;

    @JSONField(serialize = false)
    private BigDecimal p4r4;

    @JSONField(serialize = false)
    private BigDecimal p5r4;

    @JSONField(serialize = false)
    private BigDecimal p6r4;

    @JSONField(serialize = false)
    private BigDecimal p7r4;

    @JSONField(serialize = false)
    private BigDecimal p8r4;

    @JSONField(serialize = false)
    private BigDecimal p1r5;

    @JSONField(serialize = false)
    private BigDecimal p2r5;

    @JSONField(serialize = false)
    private BigDecimal p3r5;

    @JSONField(serialize = false)
    private BigDecimal p4r5;

    @JSONField(serialize = false)
    private BigDecimal p5r5;

    @JSONField(serialize = false)
    private BigDecimal p6r5;

    @JSONField(serialize = false)
    private BigDecimal p7r5;

    @JSONField(serialize = false)
    private BigDecimal p8r5;

    @JSONField(serialize = false)
    private BigDecimal apCoef;

    @JSONField(serialize = false)
    private BigDecimal rpCoef;

    @JSONField(serialize = false)
    private Date savedatetime;

    @JSONField(serialize = false)
    private String areaCode;

    @JSONField(serialize = false)
    private String status;

    @JSONField(serialize = false)
    private String tableName1;

    @JSONField(serialize = false)
    private String tableName2;

    public String getMpedId() {
        return "crphz" + mpedId;
    }

    public void setMpedId(String mpedId) {
        this.mpedId = mpedId;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(String modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    public BigDecimal getP1r0() {
        return p1r0;
    }

    public void setP1r0(BigDecimal p1r0) {
        this.p1r0 = p1r0;
    }

    public Integer getP1r0P() {
        return p1r0P;
    }

    public void setP1r0P(Integer p1r0P) {
        this.p1r0P = p1r0P;
    }

    public BigDecimal getP2r0() {
        return p2r0;
    }

    public void setP2r0(BigDecimal p2r0) {
        this.p2r0 = p2r0;
    }

    public Integer getP2r0P() {
        return p2r0P;
    }

    public void setP2r0P(Integer p2r0P) {
        this.p2r0P = p2r0P;
    }

    public BigDecimal getP3r0() {
        return p3r0;
    }

    public void setP3r0(BigDecimal p3r0) {
        this.p3r0 = p3r0;
    }

    public Integer getP3r0P() {
        return p3r0P;
    }

    public void setP3r0P(Integer p3r0P) {
        this.p3r0P = p3r0P;
    }

    public BigDecimal getP4r0() {
        return p4r0;
    }

    public void setP4r0(BigDecimal p4r0) {
        this.p4r0 = p4r0;
    }

    public Integer getP4r0P() {
        return p4r0P;
    }

    public void setP4r0P(Integer p4r0P) {
        this.p4r0P = p4r0P;
    }

    public BigDecimal getP5r0() {
        return p5r0;
    }

    public void setP5r0(BigDecimal p5r0) {
        this.p5r0 = p5r0;
    }

    public Integer getP5r0P() {
        return p5r0P;
    }

    public void setP5r0P(Integer p5r0P) {
        this.p5r0P = p5r0P;
    }

    public BigDecimal getP6r0() {
        return p6r0;
    }

    public void setP6r0(BigDecimal p6r0) {
        this.p6r0 = p6r0;
    }

    public Integer getP6r0P() {
        return p6r0P;
    }

    public void setP6r0P(Integer p6r0P) {
        this.p6r0P = p6r0P;
    }

    public BigDecimal getP7r0() {
        return p7r0;
    }

    public void setP7r0(BigDecimal p7r0) {
        this.p7r0 = p7r0;
    }

    public Integer getP7r0P() {
        return p7r0P;
    }

    public void setP7r0P(Integer p7r0P) {
        this.p7r0P = p7r0P;
    }

    public BigDecimal getP8r0() {
        return p8r0;
    }

    public void setP8r0(BigDecimal p8r0) {
        this.p8r0 = p8r0;
    }

    public Integer getP8r0P() {
        return p8r0P;
    }

    public void setP8r0P(Integer p8r0P) {
        this.p8r0P = p8r0P;
    }

    public BigDecimal getP1r1() {
        return p1r1;
    }

    public void setP1r1(BigDecimal p1r1) {
        this.p1r1 = p1r1;
    }

    public BigDecimal getP2r1() {
        return p2r1;
    }

    public void setP2r1(BigDecimal p2r1) {
        this.p2r1 = p2r1;
    }

    public BigDecimal getP3r1() {
        return p3r1;
    }

    public void setP3r1(BigDecimal p3r1) {
        this.p3r1 = p3r1;
    }

    public BigDecimal getP4r1() {
        return p4r1;
    }

    public void setP4r1(BigDecimal p4r1) {
        this.p4r1 = p4r1;
    }

    public BigDecimal getP5r1() {
        return p5r1;
    }

    public void setP5r1(BigDecimal p5r1) {
        this.p5r1 = p5r1;
    }

    public BigDecimal getP6r1() {
        return p6r1;
    }

    public void setP6r1(BigDecimal p6r1) {
        this.p6r1 = p6r1;
    }

    public BigDecimal getP7r1() {
        return p7r1;
    }

    public void setP7r1(BigDecimal p7r1) {
        this.p7r1 = p7r1;
    }

    public BigDecimal getP8r1() {
        return p8r1;
    }

    public void setP8r1(BigDecimal p8r1) {
        this.p8r1 = p8r1;
    }

    public BigDecimal getP1r2() {
        return p1r2;
    }

    public void setP1r2(BigDecimal p1r2) {
        this.p1r2 = p1r2;
    }

    public BigDecimal getP2r2() {
        return p2r2;
    }

    public void setP2r2(BigDecimal p2r2) {
        this.p2r2 = p2r2;
    }

    public BigDecimal getP3r2() {
        return p3r2;
    }

    public void setP3r2(BigDecimal p3r2) {
        this.p3r2 = p3r2;
    }

    public BigDecimal getP4r2() {
        return p4r2;
    }

    public void setP4r2(BigDecimal p4r2) {
        this.p4r2 = p4r2;
    }

    public BigDecimal getP5r2() {
        return p5r2;
    }

    public void setP5r2(BigDecimal p5r2) {
        this.p5r2 = p5r2;
    }

    public BigDecimal getP6r2() {
        return p6r2;
    }

    public void setP6r2(BigDecimal p6r2) {
        this.p6r2 = p6r2;
    }

    public BigDecimal getP7r2() {
        return p7r2;
    }

    public void setP7r2(BigDecimal p7r2) {
        this.p7r2 = p7r2;
    }

    public BigDecimal getP8r2() {
        return p8r2;
    }

    public void setP8r2(BigDecimal p8r2) {
        this.p8r2 = p8r2;
    }

    public BigDecimal getP1r3() {
        return p1r3;
    }

    public void setP1r3(BigDecimal p1r3) {
        this.p1r3 = p1r3;
    }

    public BigDecimal getP2r3() {
        return p2r3;
    }

    public void setP2r3(BigDecimal p2r3) {
        this.p2r3 = p2r3;
    }

    public BigDecimal getP3r3() {
        return p3r3;
    }

    public void setP3r3(BigDecimal p3r3) {
        this.p3r3 = p3r3;
    }

    public BigDecimal getP4r3() {
        return p4r3;
    }

    public void setP4r3(BigDecimal p4r3) {
        this.p4r3 = p4r3;
    }

    public BigDecimal getP5r3() {
        return p5r3;
    }

    public void setP5r3(BigDecimal p5r3) {
        this.p5r3 = p5r3;
    }

    public BigDecimal getP6r3() {
        return p6r3;
    }

    public void setP6r3(BigDecimal p6r3) {
        this.p6r3 = p6r3;
    }

    public BigDecimal getP7r3() {
        return p7r3;
    }

    public void setP7r3(BigDecimal p7r3) {
        this.p7r3 = p7r3;
    }

    public BigDecimal getP8r3() {
        return p8r3;
    }

    public void setP8r3(BigDecimal p8r3) {
        this.p8r3 = p8r3;
    }

    public BigDecimal getP1r4() {
        return p1r4;
    }

    public void setP1r4(BigDecimal p1r4) {
        this.p1r4 = p1r4;
    }

    public BigDecimal getP2r4() {
        return p2r4;
    }

    public void setP2r4(BigDecimal p2r4) {
        this.p2r4 = p2r4;
    }

    public BigDecimal getP3r4() {
        return p3r4;
    }

    public void setP3r4(BigDecimal p3r4) {
        this.p3r4 = p3r4;
    }

    public BigDecimal getP4r4() {
        return p4r4;
    }

    public void setP4r4(BigDecimal p4r4) {
        this.p4r4 = p4r4;
    }

    public BigDecimal getP5r4() {
        return p5r4;
    }

    public void setP5r4(BigDecimal p5r4) {
        this.p5r4 = p5r4;
    }

    public BigDecimal getP6r4() {
        return p6r4;
    }

    public void setP6r4(BigDecimal p6r4) {
        this.p6r4 = p6r4;
    }

    public BigDecimal getP7r4() {
        return p7r4;
    }

    public void setP7r4(BigDecimal p7r4) {
        this.p7r4 = p7r4;
    }

    public BigDecimal getP8r4() {
        return p8r4;
    }

    public void setP8r4(BigDecimal p8r4) {
        this.p8r4 = p8r4;
    }

    public BigDecimal getP1r5() {
        return p1r5;
    }

    public void setP1r5(BigDecimal p1r5) {
        this.p1r5 = p1r5;
    }

    public BigDecimal getP2r5() {
        return p2r5;
    }

    public void setP2r5(BigDecimal p2r5) {
        this.p2r5 = p2r5;
    }

    public BigDecimal getP3r5() {
        return p3r5;
    }

    public void setP3r5(BigDecimal p3r5) {
        this.p3r5 = p3r5;
    }

    public BigDecimal getP4r5() {
        return p4r5;
    }

    public void setP4r5(BigDecimal p4r5) {
        this.p4r5 = p4r5;
    }

    public BigDecimal getP5r5() {
        return p5r5;
    }

    public void setP5r5(BigDecimal p5r5) {
        this.p5r5 = p5r5;
    }

    public BigDecimal getP6r5() {
        return p6r5;
    }

    public void setP6r5(BigDecimal p6r5) {
        this.p6r5 = p6r5;
    }

    public BigDecimal getP7r5() {
        return p7r5;
    }

    public void setP7r5(BigDecimal p7r5) {
        this.p7r5 = p7r5;
    }

    public BigDecimal getP8r5() {
        return p8r5;
    }

    public void setP8r5(BigDecimal p8r5) {
        this.p8r5 = p8r5;
    }

    public BigDecimal getApCoef() {
        return apCoef;
    }

    public void setApCoef(BigDecimal apCoef) {
        this.apCoef = apCoef;
    }

    public BigDecimal getRpCoef() {
        return rpCoef;
    }

    public void setRpCoef(BigDecimal rpCoef) {
        this.rpCoef = rpCoef;
    }

    public Date getSavedatetime() {
        return savedatetime;
    }

    public void setSavedatetime(Date savedatetime) {
        this.savedatetime = savedatetime;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTableName1() {
        return tableName1;
    }

    public void setTableName1(String tableName1) {
        this.tableName1 = tableName1;
    }

    public String getTableName2() {
        return tableName2;
    }

    public void setTableName2(String tableName2) {
        this.tableName2 = tableName2;
    }

    public String getUid() {
        return this.mpedId;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
