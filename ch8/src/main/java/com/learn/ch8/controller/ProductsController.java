package com.learn.ch8.controller;

import ch.qos.logback.core.model.Model;
import com.learn.ch8.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {

    private final ProductService productService;

    public ProductsController(
            ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

}
