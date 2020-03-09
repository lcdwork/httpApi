package com.crplingxi.httpapi.webapp.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.riozenc.titanTool.mybatis.MybatisEntity;

import java.util.Date;

public class SendLog implements MybatisEntity {
    /**
    * 操作表
    */
    private String tableName;
    /**
     * 错误代码
     */
    private String errCode;
    /**
     * 错误信息
     */
    private String errMsg;
    /**
     * 错误数据
     */
//    @JSONField(name = "GCA_ID") //命名数据
//    @JSONField(serialize = false) //忽略数据
    private String errData;

    /**
    * 更新条数
    */
    private int sendSize;

    /**
    * 更新时间
    */
    private Date sendTime;

    /**
    * 状态
    */
    private Short status;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getErrData() {
        return errData;
    }

    public void setErrData(String errData) {
        this.errData = errData;
    }

    public int getSendSize() {
        return sendSize;
    }

    public void setSendSize(int sendSize) {
        this.sendSize = sendSize;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
