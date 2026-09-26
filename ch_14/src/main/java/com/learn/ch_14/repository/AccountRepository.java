package com.learn.ch_14.repository;

import com.learn.ch_14.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {
    List<Account> findAccountsByName(String name);
}
