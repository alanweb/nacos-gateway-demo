package com.wayne.alibaba.controller;

import com.wayne.alibaba.vo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Value("${server.port}")
    int port;
    @GetMapping("/{id}")
    public Product demo(@PathVariable("id") Integer id){
        return new Product(id,"商品"+port,12d);
    }
}
