package com.example.ch14_ex1.controllers;

import com.example.ch14_ex1.DTO.TransferRequestDTO;
import com.example.ch14_ex1.model.Account;
import com.example.ch14_ex1.services.TransferService;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;

@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequestDTO request) throws AccountNotFoundException {
        transferService.transferMoney(
                request.getSenderAccountId(),
                request.getReceiverAccountId(),
                request.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam(required = false) String name){
        if(name == null){
            return transferService.getAllAccounts();
        }else{
            return transferService.findAccountsByName(name);
        }
    }
}
