package com.crplingxi.httpapi.configurationFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationProperties {

    public static String charset;
    public static String url;

    @Value("${lingxi.charset}")
    public void setCharset(String charset) {
        ConfigurationProperties.charset = charset;
    }

    @Value("${lingxi.url}")
    public void setUrl(String url) {
        ConfigurationProperties.url = url;
    }

}
