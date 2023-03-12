package com.pool.dao;

import javax.persistence.EntityManager;

import com.pool.model.entityinheritance.ContractEmployee;
import com.pool.model.entityinheritance.FullTimeEmployee;
import com.pool.model.entityinheritance.PartTimeEmployee;
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
