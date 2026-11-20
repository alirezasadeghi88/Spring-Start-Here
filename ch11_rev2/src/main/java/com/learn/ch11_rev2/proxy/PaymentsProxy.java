package com.learn.ch11_rev2.proxy;
@FeignClient(name = "payments",
        url = "${name.service.url}")
public interface PaymentsProxy {

    @PostMapping("/payment")
    Payment createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment);
}
