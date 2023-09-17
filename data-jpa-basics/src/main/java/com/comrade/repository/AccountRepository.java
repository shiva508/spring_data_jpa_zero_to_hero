package com.comrade.repository;

import com.comrade.domine.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
}
