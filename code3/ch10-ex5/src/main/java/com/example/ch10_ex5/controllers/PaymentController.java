package com.example.ch10_ex5.controllers;

import com.example.ch10_ex5.exceptions.NotEnoughMoneyException;
import com.example.ch10_ex5.model.ErrorDetails;
import com.example.ch10_ex5.model.PaymentDetails;
import com.example.ch10_ex5.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(){
        PaymentDetails paymentDetails = paymentService.processPayment();

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
