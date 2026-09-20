package com.learn.ch12.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseRepository {
    private final JdbcTemplate jdbc;
}
