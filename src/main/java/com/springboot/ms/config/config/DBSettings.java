package com.springboot.ms.config.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties("db")
public class DBSettings {

    private String connection;
    private String host;
    private int port;
}
