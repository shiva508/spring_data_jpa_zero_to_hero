package com.comrade.dao;

import javax.persistence.EntityManager;

import com.comrade.model.entityinheritance.ContractEmployee;
import com.comrade.model.entityinheritance.FullTimeEmployee;
import com.comrade.model.entityinheritance.PartTimeEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void savePart(PartTimeEmployee employee) {
		entityManager.persist(employee);

	}

	@Override
	public void saveFull(FullTimeEmployee employee) {
		entityManager.persist(employee);
	}

	@Override
	public void saveContr(ContractEmployee employee) {
		entityManager.persist(employee);
	}

}
