package com.comrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
