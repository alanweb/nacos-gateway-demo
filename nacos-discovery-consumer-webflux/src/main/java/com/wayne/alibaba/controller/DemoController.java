package com.wayne.alibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class DemoController {
    @Autowired
    private WebClient.Builder webClientBuilder;
    @GetMapping("/test")
    public Mono<String> test(String name){
        return webClientBuilder.build()
                .get()
                .uri("http://nacos-discovery-provider/demo?name="+name)
                .retrieve()
                .bodyToMono(String.class);

   }
}
