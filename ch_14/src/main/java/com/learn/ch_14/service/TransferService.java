package com.learn.ch_14.service;

import com.learn.ch_14.model.Account;
import com.learn.ch_14.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;

@Service
public class TransferService {

    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(
            long idSender,
            long idReceiver,
            BigDecimal amount) throws AccountNotFoundException {

        Account sender =
        accountRepository.findById(idSender)
        .orElseThrow(() -> new AccountNotFoundException());

        Account receiver =
        accountRepository.findById(idReceiver)
                .orElseThrow(() -> new AccountNotFoundException());

        BigDecimal senderNewAmount =
        sender.getAmount().subtract(amount);

        BigDecimal receiverNewAmount =
        receiver.getAmount().add(amount);

        accountRepository
      .changeAmount(idSender, senderNewAmount);

        accountRepository
      .changeAmount(idReceiver, receiverNewAmount);
    }
}
