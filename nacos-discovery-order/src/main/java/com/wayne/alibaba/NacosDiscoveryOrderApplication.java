package com.wayne.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryOrderApplication.class, args);
    }

}
