package com.learn.ch_14.service;

import com.learn.ch_14.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
