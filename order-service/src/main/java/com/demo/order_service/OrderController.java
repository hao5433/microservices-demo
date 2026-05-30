package com.demo.order_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/health")
    public String health() {
        return "Order Service V1";
    }
}