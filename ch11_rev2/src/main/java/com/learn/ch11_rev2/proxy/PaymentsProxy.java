package com.learn.ch11_rev2.proxy;
@FeignClient(name = "payments",
        url = "${name.service.url}")
public interface PaymentsProxy {
}
