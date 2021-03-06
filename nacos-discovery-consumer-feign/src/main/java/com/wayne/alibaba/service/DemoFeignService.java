package com.wayne.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nacos-discovery-provider")
public interface DemoFeignService {
    @GetMapping("/demo")
    String demo(@RequestParam("name") String name);
}
