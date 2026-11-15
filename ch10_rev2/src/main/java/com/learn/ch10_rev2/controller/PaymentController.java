package com.learn.ch10_rev2.controller;

import com.learn.ch10_rev2.service.ErrorDetails;
import com.learn.ch10_rev2.service.PaymentDetails;
import com.learn.ch10_rev2.service.PaymentService;

public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment() {
        PaymentDetails paymentDetails = paymentService.processPayment();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
