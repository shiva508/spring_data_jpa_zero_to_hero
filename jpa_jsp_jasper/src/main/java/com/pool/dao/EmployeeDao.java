package com.pool.dao;


import com.pool.model.entityinheritance.ContractEmployee;
import com.pool.model.entityinheritance.FullTimeEmployee;
import com.pool.model.entityinheritance.PartTimeEmployee;

public interface EmployeeDao {
public void savePart(PartTimeEmployee employee);
public void saveFull(FullTimeEmployee employee);
public void saveContr(ContractEmployee employee);
}
