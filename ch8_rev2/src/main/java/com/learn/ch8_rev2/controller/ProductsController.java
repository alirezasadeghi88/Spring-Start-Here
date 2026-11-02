package com.learn.ch8_rev2.controller;

import com.learn.ch8_rev2.service.ProductService;

public class ProductsController {
    private final ProductService productService;

    public ProductsController(
            ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
}
