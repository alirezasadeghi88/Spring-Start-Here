package com.learn.ch8_rev2.controller;

import com.learn.ch8_rev2.service.ProductService;

public class ProductsController {
    private final ProductService productService;

    public ProductsController(
            ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(
            @RequestParam String name,
            @RequestParam double price,
            Model model
    ) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
}
