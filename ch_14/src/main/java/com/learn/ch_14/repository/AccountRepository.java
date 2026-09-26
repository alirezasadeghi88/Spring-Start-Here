package com.learn.ch_14.repository;

import com.learn.ch_14.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
