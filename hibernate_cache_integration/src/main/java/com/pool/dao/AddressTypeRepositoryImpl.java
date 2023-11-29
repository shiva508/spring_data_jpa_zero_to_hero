package com.pool.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pool.model.AddressType;

@Repository
public class AddressTypeRepositoryImpl implements AddressTypeRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public AddressType createAddressType(AddressType addressType) {
		Session session = sessionFactory.getCurrentSession();
		return (AddressType) session.merge(addressType);
	}

	public AddressType updateAddressType(AddressType addressType) {
		Session session = sessionFactory.getCurrentSession();
		return (AddressType) session.merge(addressType);
	}

	public AddressType deleteAddressType(Integer addressTypeId) {
		Session session = sessionFactory.getCurrentSession();
		AddressType addressType=session.get(AddressType.class, addressTypeId);
		if(addressType!=null) {
			session.remove(addressType);
		}
		session.flush();
		session.clear();
		return null;
	}

	public List<AddressType> AllAddressType() {
		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("From AddressType",AddressType.class);
		return query.getResultList();
	}

	public AddressType AddressTypeById(Integer addressTypeId) {
		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("From AddressType AT where AT.addressTypeId=:addressTypeId");
		query.setParameter("addressTypeId", addressTypeId);
		return (AddressType) query.getSingleResult();
	}

}
