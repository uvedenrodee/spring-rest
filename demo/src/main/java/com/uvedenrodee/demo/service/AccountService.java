package com.uvedenrodee.demo.service;

import com.uvedenrodee.demo.model.Account;

import java.util.Optional;


public interface AccountService {
    Iterable<Account> findAll();

    Optional<Account> findAccountById(Long id);

    Account save(Account account);
}
