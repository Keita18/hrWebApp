package com.example.hrwebapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.example.hrwebapp")
public class CustomProperties {
    private String apiUrl;
}
