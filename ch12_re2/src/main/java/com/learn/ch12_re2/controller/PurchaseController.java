package com.learn.ch12_re2.controller;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {


    private final PurchaseRepository purchaseRepository;

    public PurchaseController(
            PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
    }
}
