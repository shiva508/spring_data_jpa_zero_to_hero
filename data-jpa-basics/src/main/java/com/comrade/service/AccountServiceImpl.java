package com.comrade.service;

import com.comrade.domine.AccountEntity;
import com.comrade.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;
    @Override
    @Transactional(readOnly = false)
    public AccountEntity save(AccountEntity accountEntity) {
        return accountRepository.saveAndFlush(accountEntity);
    }
}
