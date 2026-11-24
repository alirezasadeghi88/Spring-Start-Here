package com.learn.ch12_re2.repository;

@Repository
public class PurchaseRepository {

    private final JdbcTemplate jdbc;

    public PurchaseRepository(
            JdbcTemplate jdbc) {

        this.jdbc = jdbc;
    }
}
