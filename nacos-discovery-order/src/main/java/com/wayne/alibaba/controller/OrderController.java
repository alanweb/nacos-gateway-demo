package com.wayne.alibaba.controller;

import com.wayne.alibaba.vo.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/{id}")
    public Order order(@PathVariable("id") Integer id) {
        return new Order(id,"订单",9.9d);
    }
}
