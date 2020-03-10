package com.crplingxi.httpapi.tools;

import com.crplingxi.httpapi.configurationFile.ConfigurationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class HttpTools {

    // 推送数据方法
    @Retryable
    public static String postData(String json) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        try {
             HttpEntity<String> request = new HttpEntity<>(json, headers);
             ResponseEntity<String> response = restTemplate.postForEntity(ConfigurationProperties.url, request , String.class );
            // ResponseEntity<Map> response = restTemplate.postForEntity( url, request , Map.class );
             return response.getBody();
        } catch (Exception e) {
            e.printStackTrace();
//            return e.toString();
            return null;
        }
    }
}
