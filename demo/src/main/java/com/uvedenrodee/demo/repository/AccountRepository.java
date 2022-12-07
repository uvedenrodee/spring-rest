package com.uvedenrodee.demo.repository;

import com.uvedenrodee.demo.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
