package com.crplingxi.httpapi.webapp.action;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@RequestMapping("http")
public class testAction {

    @ResponseBody
    @RequestMapping(params = "method=test")
    public void putTest(@RequestBody String body) {
        System.out.println("1111");
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
