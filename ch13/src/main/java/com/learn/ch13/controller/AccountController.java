package com.learn.ch13.controller;

import com.learn.ch13.service.TransferService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }
}
