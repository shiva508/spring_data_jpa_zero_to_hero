package com.pool.dao;

import com.pool.model.entityinheritance.FullTimeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FullTimeEmployeeRepository extends JpaRepository<FullTimeEmployee, Integer> {

}
