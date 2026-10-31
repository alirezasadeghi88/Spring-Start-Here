package com.learn.ch8_rev2.service;

import com.learn.ch8_rev2.model.Product;

import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }


    public List<Product> findAll() {
        return products;
    }
}
