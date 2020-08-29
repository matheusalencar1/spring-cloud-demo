package com.demo.service.web.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoService {

    private Environment environment;

    public DemoService(Environment environment) {
        this.environment = environment;
    }

    @GetMapping
    public String serverPortResponse() {
        String serverPort = environment.getProperty("local.server.port");
        return "Server: " + serverPort;
    }
}
