package com.comrade.repository;

import com.comrade.domine.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity,Integer> {
}
