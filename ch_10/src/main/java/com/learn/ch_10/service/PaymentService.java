package com.learn.ch_10.service;

import com.learn.ch_10.details.PaymentDetails;
import com.learn.ch_10.exception.NotEnoughMoneyException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
