package com.shiva.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shiva.model.Address;

@Repository
public class AddressRepositoryImpl implements AddressRepository {
	@Autowired
	private SessionFactory sessionFactory;
	public Address createAddress(Address address) {
		Session session=sessionFactory.getCurrentSession();
		return (Address) session.merge(address);
	}

	public Address updateAddress(Address address) {
		Session session=sessionFactory.getCurrentSession();
		return (Address) session.merge(address);
	}

	public Address deleteAddress(Integer addressId) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("Delete Address AD where AD.addressId=:addressId");
		query.setParameter("addressId", addressId);
		query.executeUpdate();
		return null;
	}

	public List<Address> AllAddress() {
		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("From Address",Address.class);
		return query.getResultList();
	}

	public Address AddressById(Integer addressId) {
		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("From Address AD where AD.addressId=:addressId");
		query.setParameter("addressId", addressId);
		return (Address) query.getSingleResult();
	}

	
}
