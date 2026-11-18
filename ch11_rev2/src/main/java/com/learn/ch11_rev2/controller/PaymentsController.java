package com.learn.ch11_rev2.controller;
@RestController
public class PaymentsController {
    private static Logger logger =
            Logger.getLogger(PaymentsController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment
    ) {
        logger.info("Received request with ID " + requestId +
                " ;Payment Amount: " + payment.getAmount());

        payment.setId(UUID.randomUUID().toString());

        return ResponseEntity
        .status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(payment);
    }
}
