package com.crplingxi.httpapi.webapp.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;
import java.util.Date;

public class EMpSslCurve implements MybatisEntity {
    @JSONField(name = "sn")
    private Long mpedId;

    @JSONField(name = "time")
    private Date dataTime;

    @JSONField(serialize = false)
    private String psFlag;

    @JSONField(name = "ua")
    private BigDecimal ua;

    @JSONField(name = "ub")
    private BigDecimal ub;

    @JSONField(name = "uc")
    private BigDecimal uc;

    @JSONField(name = "ia")
    private BigDecimal ia;

    @JSONField(name = "ib")
    private BigDecimal ib;

    @JSONField(name = "ic")
    private BigDecimal ic;

    @JSONField(serialize = false)
    private BigDecimal i0;

    @JSONField(name = "p")
    private BigDecimal p;

    @JSONField(serialize = false)
    private BigDecimal pa;

    @JSONField(serialize = false)
    private BigDecimal pb;

    @JSONField(serialize = false)
    private BigDecimal pc;

    @JSONField(name = "q")
    private BigDecimal q;

    @JSONField(serialize = false)
    private BigDecimal qa;

    @JSONField(serialize = false)
    private BigDecimal qb;

    @JSONField(serialize = false)
    private BigDecimal qc;

    @JSONField(name = "cos")
    private BigDecimal cos;

    @JSONField(serialize = false)
    private BigDecimal cosa;

    @JSONField(serialize = false)
    private BigDecimal cosb;

    @JSONField(serialize = false)
    private BigDecimal cosc;

    @JSONField(serialize = false)
    private BigDecimal sp;

    @JSONField(serialize = false)
    private BigDecimal spa;

    @JSONField(serialize = false)
    private BigDecimal spb;

    @JSONField(serialize = false)
    private BigDecimal spc;

    @JSONField(serialize = false)
    private BigDecimal fn;

    @JSONField(serialize = false)
    private BigDecimal paia;

    @JSONField(serialize = false)
    private BigDecimal paib;

    @JSONField(serialize = false)
    private BigDecimal paic;

    @JSONField(serialize = false)
    private BigDecimal paua;

    @JSONField(serialize = false)
    private BigDecimal paub;

    @JSONField(serialize = false)
    private BigDecimal pauc;

    @JSONField(serialize = false)
    private BigDecimal temple;

    @JSONField(serialize = false)
    private BigDecimal avgp;

    @JSONField(serialize = false)
    private BigDecimal avgq;

    @JSONField(serialize = false)
    private BigDecimal pCoef;

    @JSONField(serialize = false)
    private BigDecimal qCoef;

    @JSONField(serialize = false)
    private BigDecimal vCoef;

    @JSONField(serialize = false)
    private BigDecimal cCoef;

    @JSONField(serialize = false)
    private BigDecimal factorCoef;

    @JSONField(serialize = false)
    private Date savedatetime;

    @JSONField(serialize = false)
    private String areaCode;

    @JSONField(serialize = false)
    private String tableName1;

    @JSONField(serialize = false)
    private String tableName2;

    private String datatype;

    public String getDatatype() {
        return "01";
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
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

    public String getPsFlag() {
        return psFlag;
    }

    public void setPsFlag(String psFlag) {
        this.psFlag = psFlag;
    }

    public BigDecimal getUa() {
        return ua;
    }

    public void setUa(BigDecimal ua) {
        this.ua = ua;
    }

    public BigDecimal getUb() {
        return ub;
    }

    public void setUb(BigDecimal ub) {
        this.ub = ub;
    }

    public BigDecimal getUc() {
        return uc;
    }

    public void setUc(BigDecimal uc) {
        this.uc = uc;
    }

    public BigDecimal getIa() {
        return ia;
    }

    public void setIa(BigDecimal ia) {
        this.ia = ia;
    }

    public BigDecimal getIb() {
        return ib;
    }

    public void setIb(BigDecimal ib) {
        this.ib = ib;
    }

    public BigDecimal getIc() {
        return ic;
    }

    public void setIc(BigDecimal ic) {
        this.ic = ic;
    }

    public BigDecimal getI0() {
        return i0;
    }

    public void setI0(BigDecimal i0) {
        this.i0 = i0;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getPa() {
        return pa;
    }

    public void setPa(BigDecimal pa) {
        this.pa = pa;
    }

    public BigDecimal getPb() {
        return pb;
    }

    public void setPb(BigDecimal pb) {
        this.pb = pb;
    }

    public BigDecimal getPc() {
        return pc;
    }

    public void setPc(BigDecimal pc) {
        this.pc = pc;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getQa() {
        return qa;
    }

    public void setQa(BigDecimal qa) {
        this.qa = qa;
    }

    public BigDecimal getQb() {
        return qb;
    }

    public void setQb(BigDecimal qb) {
        this.qb = qb;
    }

    public BigDecimal getQc() {
        return qc;
    }

    public void setQc(BigDecimal qc) {
        this.qc = qc;
    }

    public BigDecimal getCos() {
        return cos;
    }

    public void setCos(BigDecimal cos) {
        this.cos = cos;
    }

    public BigDecimal getCosa() {
        return cosa;
    }

    public void setCosa(BigDecimal cosa) {
        this.cosa = cosa;
    }

    public BigDecimal getCosb() {
        return cosb;
    }

    public void setCosb(BigDecimal cosb) {
        this.cosb = cosb;
    }

    public BigDecimal getCosc() {
        return cosc;
    }

    public void setCosc(BigDecimal cosc) {
        this.cosc = cosc;
    }

    public BigDecimal getSp() {
        return sp;
    }

    public void setSp(BigDecimal sp) {
        this.sp = sp;
    }

    public BigDecimal getSpa() {
        return spa;
    }

    public void setSpa(BigDecimal spa) {
        this.spa = spa;
    }

    public BigDecimal getSpb() {
        return spb;
    }

    public void setSpb(BigDecimal spb) {
        this.spb = spb;
    }

    public BigDecimal getSpc() {
        return spc;
    }

    public void setSpc(BigDecimal spc) {
        this.spc = spc;
    }

    public BigDecimal getFn() {
        return fn;
    }

    public void setFn(BigDecimal fn) {
        this.fn = fn;
    }

    public BigDecimal getPaia() {
        return paia;
    }

    public void setPaia(BigDecimal paia) {
        this.paia = paia;
    }

    public BigDecimal getPaib() {
        return paib;
    }

    public void setPaib(BigDecimal paib) {
        this.paib = paib;
    }

    public BigDecimal getPaic() {
        return paic;
    }

    public void setPaic(BigDecimal paic) {
        this.paic = paic;
    }

    public BigDecimal getPaua() {
        return paua;
    }

    public void setPaua(BigDecimal paua) {
        this.paua = paua;
    }

    public BigDecimal getPaub() {
        return paub;
    }

    public void setPaub(BigDecimal paub) {
        this.paub = paub;
    }

    public BigDecimal getPauc() {
        return pauc;
    }

    public void setPauc(BigDecimal pauc) {
        this.pauc = pauc;
    }

    public BigDecimal getTemple() {
        return temple;
    }

    public void setTemple(BigDecimal temple) {
        this.temple = temple;
    }

    public BigDecimal getAvgp() {
        return avgp;
    }

    public void setAvgp(BigDecimal avgp) {
        this.avgp = avgp;
    }

    public BigDecimal getAvgq() {
        return avgq;
    }

    public void setAvgq(BigDecimal avgq) {
        this.avgq = avgq;
    }

    public BigDecimal getpCoef() {
        return pCoef;
    }

    public void setpCoef(BigDecimal pCoef) {
        this.pCoef = pCoef;
    }

    public BigDecimal getqCoef() {
        return qCoef;
    }

    public void setqCoef(BigDecimal qCoef) {
        this.qCoef = qCoef;
    }

    public BigDecimal getvCoef() {
        return vCoef;
    }

    public void setvCoef(BigDecimal vCoef) {
        this.vCoef = vCoef;
    }

    public BigDecimal getcCoef() {
        return cCoef;
    }

    public void setcCoef(BigDecimal cCoef) {
        this.cCoef = cCoef;
    }

    public BigDecimal getFactorCoef() {
        return factorCoef;
    }

    public void setFactorCoef(BigDecimal factorCoef) {
        this.factorCoef = factorCoef;
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
