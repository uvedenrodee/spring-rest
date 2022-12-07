package com.uvedenrodee.demo.controller;

import com.uvedenrodee.demo.model.Account;
import com.uvedenrodee.demo.repository.AccountRepository;
import com.uvedenrodee.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/accounts")
public class AccountController {

    @Autowired
    public AccountService accountService;

    @GetMapping
    public @ResponseBody Iterable<Account> getAllAccounts() {
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Account> getAccountById(@PathVariable Long id) {
        return accountService.findAccountById(id);
    }

    @PostMapping
    public Account saveNewAccount (@RequestBody Account account) {
        return accountService.save(account);
    }
}
