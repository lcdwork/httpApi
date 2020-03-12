package com.crplingxi.httpapi.webapp.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.riozenc.titanTool.mybatis.MybatisEntity;

import java.math.BigDecimal;
import java.util.Date;

public class ELmpEngyDay implements MybatisEntity {
    @JSONField(name = "sn")
    private Long mpedId;

    @JSONField(name = "time")
    private Date dataTime;

    @JSONField(serialize = false)
    private String datasaveType;

    @JSONField(serialize = false)
    private Short schemeId;

    @JSONField(serialize = false)
    private String eType;

    @JSONField(serialize = false)
    private String primaryFlag;

    @JSONField(name = "kwhttli")
    private BigDecimal p1r0;

    @JSONField(name = "kwhttle")
    private BigDecimal p2r0;

    @JSONField(name = "kvarhttli")
    private BigDecimal p3r0;

    @JSONField(name = "kvarhttle")
    private BigDecimal p4r0;

    @JSONField(name = "kwhttli1")
    private BigDecimal p1r1;

    @JSONField(name = "kwhttle1")
    private BigDecimal p2r1;

    @JSONField(name = "kvarhttli1")
    private BigDecimal p3r1;

    @JSONField(name = "kvarhttle1")
    private BigDecimal p4r1;

    @JSONField(name = "kwhttli2")
    private BigDecimal p1r2;

    @JSONField(name = "kwhttle2")
    private BigDecimal p2r2;

    @JSONField(name = "kvarhttli2")
    private BigDecimal p3r2;

    @JSONField(name = "kvarhttle2")
    private BigDecimal p4r2;

    @JSONField(name = "kwhttli3")
    private BigDecimal p1r3;

    @JSONField(name = "kwhttle3")
    private BigDecimal p2r3;

    @JSONField(name = "kvarhttli3")
    private BigDecimal p3r3;

    @JSONField(name = "kvarhttle3")
    private BigDecimal p4r3;

    @JSONField(name = "kwhttli4")
    private BigDecimal p1r4;

    @JSONField(name = "kwhttle4")
    private BigDecimal p2r4;

    @JSONField(name = "kvarhttli4")
    private BigDecimal p3r4;

    @JSONField(name = "kvarhttle4")
    private BigDecimal p4r4;

    @JSONField(serialize = false)
    private BigDecimal p1r5;

    @JSONField(serialize = false)
    private BigDecimal p2r5;

    @JSONField(serialize = false)
    private BigDecimal p3r5;

    @JSONField(serialize = false)
    private BigDecimal p4r5;

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

    private String dataType;

    public String getDataType() {
        return "82";
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Long getMpedId() {
        return mpedId;
    }

    public void setMpedId(Long mpedId) {
        this.mpedId = mpedId;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getDatasaveType() {
        return datasaveType;
    }

    public void setDatasaveType(String datasaveType) {
        this.datasaveType = datasaveType;
    }

    public Short getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Short schemeId) {
        this.schemeId = schemeId;
    }

    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType;
    }

    public String getPrimaryFlag() {
        return primaryFlag;
    }

    public void setPrimaryFlag(String primaryFlag) {
        this.primaryFlag = primaryFlag;
    }

    public BigDecimal getP1r0() {
        return p1r0;
    }

    public void setP1r0(BigDecimal p1r0) {
        this.p1r0 = p1r0;
    }

    public BigDecimal getP2r0() {
        return p2r0;
    }

    public void setP2r0(BigDecimal p2r0) {
        this.p2r0 = p2r0;
    }

    public BigDecimal getP3r0() {
        return p3r0;
    }

    public void setP3r0(BigDecimal p3r0) {
        this.p3r0 = p3r0;
    }

    public BigDecimal getP4r0() {
        return p4r0;
    }

    public void setP4r0(BigDecimal p4r0) {
        this.p4r0 = p4r0;
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
}
