package com.learn.ch11_rev2.proxy;
@Component
public class PaymentsProxys {

    private final RestTemplate rest;

    @Value("${name.service.url}")
    private String paymentsServiceUrl;

    public PaymentsProxy(RestTemplate rest) {
        this.rest = rest;
    }

    public Payment createPayment(Payment payment) {
        String uri = paymentsServiceUrl + "/payment";
        HttpHeaders headers = new HttpHeaders();
        headers.add("requestId",
                UUID.randomUUID().toString());
        HttpEntity<Payment> httpEntity =
        new HttpEntity<>(payment, headers)
        ResponseEntity<Payment> response =
        rest.exchange(uri,
                HttpMethod.POST,
                httpEntity,
                Payment.class);
        return response.getBody();
    }
}
