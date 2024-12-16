package com.example.ch10_ex5.service;

import com.example.ch10_ex5.exceptions.NotEnoughMoneyException;
import com.example.ch10_ex5.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
