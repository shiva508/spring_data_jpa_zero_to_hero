package com.comrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Phone;
@Repository("phoneRepository")
public interface PhoneRepository extends JpaRepository<Phone, Integer>{

}
