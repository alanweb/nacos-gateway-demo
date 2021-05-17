package com.wayne.alibaba.controller;

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
    private RestTemplate restTemplate;
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/test")
    public String test(String name){
//        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
//        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject("http://nacos-discovery-provider/demo?name="+name,String.class);
    }
}
