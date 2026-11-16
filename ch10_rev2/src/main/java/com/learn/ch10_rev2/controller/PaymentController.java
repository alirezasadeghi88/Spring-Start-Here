package com.learn.ch10_rev2.controller;

import com.learn.ch10_rev2.service.ErrorDetails;
import com.learn.ch10_rev2.service.PaymentDetails;
import com.learn.ch10_rev2.service.PaymentService;

public class PaymentController {

    private static Logger logger =
            Logger.getLogger(PaymentController.class.getName());
    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails) {
        logger.info("Received payment " +
                paymentDetails.getAmount());

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
