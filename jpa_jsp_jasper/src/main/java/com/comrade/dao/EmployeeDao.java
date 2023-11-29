package com.comrade.dao;


import com.comrade.model.entityinheritance.ContractEmployee;
import com.comrade.model.entityinheritance.FullTimeEmployee;
import com.comrade.model.entityinheritance.PartTimeEmployee;

public interface EmployeeDao {
public void savePart(PartTimeEmployee employee);
public void saveFull(FullTimeEmployee employee);
public void saveContr(ContractEmployee employee);
}
