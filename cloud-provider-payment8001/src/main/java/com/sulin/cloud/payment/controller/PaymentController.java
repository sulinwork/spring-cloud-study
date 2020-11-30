package com.sulin.cloud.payment.controller;

import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {


    @GetMapping("/{id}")
    public String getPaymentById(@PathVariable Long id) {
        String name="";
        return id + "asdsadsa";
    }
}
