package com.crplingxi.httpapi;

import com.riozenc.titanTool.properties.Global;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableRetry
public class HttpapiApplication {

    public static void main(String[] args) {
        Global.getConfig("namespace");
        SpringApplication.run(HttpapiApplication.class, args);
    }

}
