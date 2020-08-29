package com.demo.ribbon.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service")
@RibbonClient(name="service")
public interface DemoServiceClient {
    @GetMapping("/demo")
    String getDemoResponse();
}
