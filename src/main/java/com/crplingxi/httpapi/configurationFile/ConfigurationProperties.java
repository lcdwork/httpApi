package com.crplingxi.httpapi.configurationFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationProperties {

    public static String url;

    @Value("${lingxi.url}")
    public void setUrl(String url) {
        ConfigurationProperties.url = url;
    }

}
