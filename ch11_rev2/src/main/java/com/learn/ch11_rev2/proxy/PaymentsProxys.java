package com.learn.ch11_rev2.proxy;
@Component
public class PaymentsProxys {

    private final WebClient webClient;

    @Value("${name.service.url}")
    private String url;

    public PaymentsProxy(WebClient webClient) {
        this.webClient = webClient;
    }
}
