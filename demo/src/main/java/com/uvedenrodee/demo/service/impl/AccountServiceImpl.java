package com.uvedenrodee.demo.service.impl;

import com.uvedenrodee.demo.model.Account;
import com.uvedenrodee.demo.repository.AccountRepository;
import com.uvedenrodee.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.sql.Timestamp;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> findAccountById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public Account save(Account account) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        account.setCreatedOn(now);
        account.setLastLogin(now);
        return accountRepository.save(account);
    }
}
