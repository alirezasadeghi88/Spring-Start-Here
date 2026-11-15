package com.learn.ch10_rev2.controller;

import com.learn.ch10_rev2.service.PaymentService;

public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
