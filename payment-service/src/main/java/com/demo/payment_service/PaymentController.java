package com.demo.payment_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/health")
    public String health() {
        return "Payment Service V1";
    }
}