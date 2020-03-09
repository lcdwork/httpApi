package com.crplingxi.httpapi.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.crplingxi.httpapi.webapp.domain.SendLog;
import com.crplingxi.httpapi.webapp.dao.SendLogMapper;
import com.crplingxi.httpapi.webapp.service.SendLogService;
@TransactionService
public class SendLogServiceImpl implements SendLogService{

    @TransactionDAO("httpOracle")
    private SendLogMapper sendLogMapper;

    @Override
    public int insert(SendLog record) {
        return sendLogMapper.insert(record);
    }

}
