package com.comrade.dao;

import com.comrade.model.entityinheritance.FullTimeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FullTimeEmployeeRepository extends JpaRepository<FullTimeEmployee, Integer> {

}
