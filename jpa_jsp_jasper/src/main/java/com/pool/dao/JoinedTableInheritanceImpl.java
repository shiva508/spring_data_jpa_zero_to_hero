package com.pool.dao;

import javax.persistence.EntityManager;

import com.pool.model.entityinheritance.EmailNotification;
import com.pool.model.entityinheritance.SmsNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JoinedTableInheritanceImpl implements JoinedTableInheritance {
	@Autowired
	EntityManager entityManager;

	@Override
	public void sendSme(SmsNotification smsNotification) {
		entityManager.persist(smsNotification);

	}

	@Override
	public void sendEmail(EmailNotification emailNotification) {
		entityManager.persist(emailNotification);
	}

}
