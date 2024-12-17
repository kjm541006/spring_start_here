package com.example.ch12_ex1.controllers;

import com.example.ch12_ex1.model.Purchase;
import com.example.ch12_ex1.repositories.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findAllPurchases(){
        return purchaseRepository.findAllPurchases();
    }
}
