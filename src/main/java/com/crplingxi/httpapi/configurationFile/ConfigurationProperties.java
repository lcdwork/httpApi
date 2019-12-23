package com.crplingxi.httpapi.configurationFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationProperties {

    public static String key;
    public static String charset;
    public static String url;

    @Value("${lingxi.key}")
    public void setKey(String key) {
        this.key = key;
    }

    @Value("${lingxi.charset}")
    public void setCharset(String charset) {
        this.charset = charset;
    }

    @Value("${lingxi.url}")
    public void setUrl(String url) {
        this.url = url;
    }

}
