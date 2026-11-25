package com.learn.ch12_re2.repository;

@Repository
public class PurchaseRepository {

    private final JdbcTemplate jdbc;

    public PurchaseRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void storePurchase(Purchase purchase) {
        String sql =
        "INSERT INTO purchase VALUES (NULL, ?, ?)";

        jdbc.update(sql,
                purchase.getProduct(),
                purchase.getPrice());
    }
}
