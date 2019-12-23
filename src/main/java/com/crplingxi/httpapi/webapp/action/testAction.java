package com.crplingxi.httpapi.webapp.action;

import com.alibaba.fastjson.JSON;
import com.crplingxi.httpapi.tools.Des;
import com.crplingxi.httpapi.tools.ZlibUtils;
import com.crplingxi.httpapi.webapp.domain.TestDomain;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class testAction {

    @Scheduled(cron = "${test.cron}")
    public void putTest() {
        TestDomain testDomain = new TestDomain();
        testDomain.setId(111);
        testDomain.setName("测试");
        testDomain.setSn("2886631868423312");

        String jsonObject = JSON.toJSONString(testDomain);
        System.out.println(jsonObject);
        String encryptData = Des.encrypt(jsonObject, "utf8", "testtest");
        System.out.println(encryptData);
        byte[] zlibData = encryptData.getBytes();
        byte[] lib = ZlibUtils.compress(zlibData);
        byte[] output = ZlibUtils.decompress(lib);
        String outStr = new String(output);
        System.out.println(outStr);

    }
}
