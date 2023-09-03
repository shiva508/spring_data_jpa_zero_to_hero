package com.comrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.onetomany.RoleR;

@Repository
public interface RoleRRepository extends JpaRepository<RoleR, Integer> {

}
