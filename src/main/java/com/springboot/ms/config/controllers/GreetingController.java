package com.springboot.ms.config.controllers;

import com.springboot.ms.config.config.DBSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {

    @Value("${my.greeting: default greeting}")
    private String greetingMessage;

    @Value("${application.message: default welcome}")
    private String welcomeMessage;

    @Value("static value")
    private String staticMessage;

    @Value("${my.list}")
    private List<String> myList;

    @Autowired
    private DBSettings dbSettings;

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return dbSettings.getConnection() + " " + dbSettings.getHost() + " " + dbSettings.getPort();
    }

}
