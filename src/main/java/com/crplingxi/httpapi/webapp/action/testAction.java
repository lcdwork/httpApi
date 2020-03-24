package com.crplingxi.httpapi.webapp.action;

import com.crplingxi.httpapi.tools.DateUtils;
import com.crplingxi.httpapi.webapp.domain.SendLog;
import com.crplingxi.httpapi.webapp.service.SendLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@ControllerAdvice
@RequestMapping("/test")
public class testAction {

    @Autowired
    @Qualifier("sendLogServiceImpl")
    private SendLogService sendLogService;

    @ResponseBody
    @RequestMapping()
    public void putTest() {
        Date date = DateUtils.initDateByMonth();
        System.out.println(date);
        SendLog sendLog = new SendLog();
        sendLog.setStatus((short) 1);
        sendLog.setTableName("w");
        sendLog.setSendTime(new Date());
        sendLogService.insert(sendLog);
//        TestDomain testDomain = new TestDomain();
//        testDomain.setId(111);
//        testDomain.setName("测试");
//        testDomain.setSn("2886631868423312");
//
//        String jsonObject = JSON.toJSONString(testDomain);
//        System.out.println(jsonObject);
//        String encryptData1 = DESUtil.encrypt("testtest", jsonObject);
//        String encryptData2 = DESUtils.encrypt(jsonObject, "testtest");
//        System.out.println(encryptData1);
//        System.out.println(encryptData2);
//        byte[] zlibData = encryptData1.getBytes();
//        byte[] lib = ZlibUtils.compress(zlibData);
//        byte[] output = ZlibUtils.decompress(lib);
//        String outStr = new String(output);
//        System.out.println(outStr);

    }
}
