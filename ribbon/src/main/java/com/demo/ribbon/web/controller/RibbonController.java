package com.demo.ribbon.web.controller;

import com.demo.ribbon.client.DemoServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ribbon")
public class RibbonController {

    private DemoServiceClient demoServiceClient;

    public RibbonController(DemoServiceClient demoServiceClient) {
        this.demoServiceClient = demoServiceClient;
    }

    @GetMapping
    public String getRibbonClientResponse() {
        return demoServiceClient.getDemoResponse();
    }
}
