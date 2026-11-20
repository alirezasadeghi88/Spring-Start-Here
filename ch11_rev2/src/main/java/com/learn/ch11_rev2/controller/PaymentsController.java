package com.learn.ch11_rev2.controller;
@RestController
public class PaymentsController {
    private final PaymentsProxy paymentsProxy;


    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }
}
