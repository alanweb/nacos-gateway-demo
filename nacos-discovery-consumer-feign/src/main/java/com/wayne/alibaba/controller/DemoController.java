package com.wayne.alibaba.controller;

import com.wayne.alibaba.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class DemoController {
    @Autowired
    private DemoFeignService demoFeignService;

    @GetMapping("/test")
    public String test(String name) {
        return demoFeignService.demo(name);
    }
}
