package com.crplingxi.httpapi.webapp.domain;

import com.riozenc.titanTool.mybatis.MybatisEntity;
import java.math.BigDecimal;

public class ElectricRealTime implements MybatisEntity {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 总负荷（三相有功功率）
     */
    private BigDecimal pttl;

    /**
     * A相负荷（A相有功功率）
     */
    private BigDecimal pa;

    /**
     * B相负荷（B相有功功率）
     */
    private BigDecimal pb;

    /**
     * C相负荷（C相有功功率）
     */
    private BigDecimal pc;

    /**
     * 总无功（三相无功功率）
     */
    private BigDecimal qttl;

    /**
     * A相无功（A相无功功率）
     */
    private BigDecimal qa;

    /**
     * B相无功（B相无功功率）
     */
    private BigDecimal qb;

    /**
     * C相无功（C相无功功率）
     */
    private BigDecimal qc;

    /**
     * A相视在功率
     */
    private BigDecimal sa;

    /**
     * B相视在功率
     */
    private BigDecimal sb;

    /**
     * C相视在功率
     */
    private BigDecimal sc;

    /**
     * 三相视在功率
     */
    private BigDecimal sttl;

    /**
     * 总功率因数（三相总功率因数）
     */
    private BigDecimal costtl;

    /**
     * A相功率因数
     */
    private BigDecimal cosa;

    /**
     * B相功率因数
     */
    private BigDecimal cosb;

    /**
     * C相功率因数
     */
    private BigDecimal cosc;

    /**
     * A相电流（A相电流有效值）
     */
    private BigDecimal ia;

    /**
     * B相电流（B相电流有效值）
     */
    private BigDecimal ib;

    /**
     * C相电流（C相电流有效值）
     */
    private BigDecimal ic;

    /**
     * 零线电流（零序电流）
     */
    private BigDecimal zsc;

    /**
     * A相电压（A相的相电压有效值）
     */
    private BigDecimal ua;

    /**
     * B相电压（B相的相电压有效值）
     */
    private BigDecimal ub;

    /**
     * C项电压（C相的相电压有效值）
     */
    private BigDecimal uc;

    /**
     * Uab线电压（AB相电压）
     */
    private BigDecimal uab;

    /**
     * Ubc线电压（BC相电压）
     */
    private BigDecimal ubc;

    /**
     * Uca线电压（CA相电压）
     */
    private BigDecimal uca;

    /**
     * 负载率
     */
    private BigDecimal lr;

    /**
     * 频率（电网频率）
     */
    private BigDecimal freq;

    /**
     * 三相电流不平衡度
     */
    private BigDecimal ubli;

    /**
     * 三相电压不平衡度
     */
    private BigDecimal ublu;

    /**
     * A相电压偏差
     */
    private BigDecimal eua;

    /**
     * B相电压偏差
     */
    private BigDecimal eub;

    /**
     * C相电压偏差
     */
    private BigDecimal euc;

    /**
     * Uab线电压偏差（AB相电压偏差）
     */
    private BigDecimal euab;

    /**
     * Ubc线电压偏差（BC相电压偏差）
     */
    private BigDecimal eubc;

    /**
     * Uca线电压偏差（CA相电压偏差）
     */
    private BigDecimal euca;

    /**
     * 频率偏差
     */
    private BigDecimal efreq;

    /**
     * 温度一
     */
    private BigDecimal tem1;

    /**
     * 温度二
     */
    private BigDecimal tem2;

    /**
     * 温度三
     */
    private BigDecimal tem3;

    /**
     * 温度四
     */
    private BigDecimal tem4;

    /**
     * 温度五
     */
    private BigDecimal tem5;

    /**
     * 温度六
     */
    private BigDecimal tem6;

    /**
     * 温度七
     */
    private BigDecimal tem7;

    /**
     * 温度八
     */
    private BigDecimal tem8;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPttl() {
        return pttl;
    }

    public void setPttl(BigDecimal pttl) {
        this.pttl = pttl;
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

    public BigDecimal getQttl() {
        return qttl;
    }

    public void setQttl(BigDecimal qttl) {
        this.qttl = qttl;
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

    public BigDecimal getSa() {
        return sa;
    }

    public void setSa(BigDecimal sa) {
        this.sa = sa;
    }

    public BigDecimal getSb() {
        return sb;
    }

    public void setSb(BigDecimal sb) {
        this.sb = sb;
    }

    public BigDecimal getSc() {
        return sc;
    }

    public void setSc(BigDecimal sc) {
        this.sc = sc;
    }

    public BigDecimal getSttl() {
        return sttl;
    }

    public void setSttl(BigDecimal sttl) {
        this.sttl = sttl;
    }

    public BigDecimal getCosttl() {
        return costtl;
    }

    public void setCosttl(BigDecimal costtl) {
        this.costtl = costtl;
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

    public BigDecimal getZsc() {
        return zsc;
    }

    public void setZsc(BigDecimal zsc) {
        this.zsc = zsc;
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

    public BigDecimal getUab() {
        return uab;
    }

    public void setUab(BigDecimal uab) {
        this.uab = uab;
    }

    public BigDecimal getUbc() {
        return ubc;
    }

    public void setUbc(BigDecimal ubc) {
        this.ubc = ubc;
    }

    public BigDecimal getUca() {
        return uca;
    }

    public void setUca(BigDecimal uca) {
        this.uca = uca;
    }

    public BigDecimal getLr() {
        return lr;
    }

    public void setLr(BigDecimal lr) {
        this.lr = lr;
    }

    public BigDecimal getFreq() {
        return freq;
    }

    public void setFreq(BigDecimal freq) {
        this.freq = freq;
    }

    public BigDecimal getUbli() {
        return ubli;
    }

    public void setUbli(BigDecimal ubli) {
        this.ubli = ubli;
    }

    public BigDecimal getUblu() {
        return ublu;
    }

    public void setUblu(BigDecimal ublu) {
        this.ublu = ublu;
    }

    public BigDecimal getEua() {
        return eua;
    }

    public void setEua(BigDecimal eua) {
        this.eua = eua;
    }

    public BigDecimal getEub() {
        return eub;
    }

    public void setEub(BigDecimal eub) {
        this.eub = eub;
    }

    public BigDecimal getEuc() {
        return euc;
    }

    public void setEuc(BigDecimal euc) {
        this.euc = euc;
    }

    public BigDecimal getEuab() {
        return euab;
    }

    public void setEuab(BigDecimal euab) {
        this.euab = euab;
    }

    public BigDecimal getEubc() {
        return eubc;
    }

    public void setEubc(BigDecimal eubc) {
        this.eubc = eubc;
    }

    public BigDecimal getEuca() {
        return euca;
    }

    public void setEuca(BigDecimal euca) {
        this.euca = euca;
    }

    public BigDecimal getEfreq() {
        return efreq;
    }

    public void setEfreq(BigDecimal efreq) {
        this.efreq = efreq;
    }

    public BigDecimal getTem1() {
        return tem1;
    }

    public void setTem1(BigDecimal tem1) {
        this.tem1 = tem1;
    }

    public BigDecimal getTem2() {
        return tem2;
    }

    public void setTem2(BigDecimal tem2) {
        this.tem2 = tem2;
    }

    public BigDecimal getTem3() {
        return tem3;
    }

    public void setTem3(BigDecimal tem3) {
        this.tem3 = tem3;
    }

    public BigDecimal getTem4() {
        return tem4;
    }

    public void setTem4(BigDecimal tem4) {
        this.tem4 = tem4;
    }

    public BigDecimal getTem5() {
        return tem5;
    }

    public void setTem5(BigDecimal tem5) {
        this.tem5 = tem5;
    }

    public BigDecimal getTem6() {
        return tem6;
    }

    public void setTem6(BigDecimal tem6) {
        this.tem6 = tem6;
    }

    public BigDecimal getTem7() {
        return tem7;
    }

    public void setTem7(BigDecimal tem7) {
        this.tem7 = tem7;
    }

    public BigDecimal getTem8() {
        return tem8;
    }

    public void setTem8(BigDecimal tem8) {
        this.tem8 = tem8;
    }
}
