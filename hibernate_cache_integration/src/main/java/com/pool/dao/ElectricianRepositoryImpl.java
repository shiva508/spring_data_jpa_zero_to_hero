package com.shiva.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shiva.model.Electrician;

@Repository
public class ElectricianRepositoryImpl implements ElectricianRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public Electrician createElectrician(Electrician electrician) {
		Session session = sessionFactory.getCurrentSession();
		return (Electrician) session.merge(electrician);
	}

	public Electrician updateElectrician(Electrician electrician) {
		Session session = sessionFactory.getCurrentSession();
		return (Electrician) session.merge(electrician);
	}

	public Electrician deleteElectrician(Integer electricianId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("Delete Electrician ELN where ELN.technicianId=:technicianId");
		query.setParameter("technicianId", electricianId);
		query.executeUpdate();
		return null;
	}

	public List<Electrician> AllElectricians() {
		Session session = sessionFactory.getCurrentSession();
		String hqlQuery="From Electrician ELCN  join fetch ELCN.addresslist ADD inner join fetch ADD.addressType inner join fetch ELCN.serviceType";
		//Query query = session.createQuery("From Electrician ELCN inner join fetch ELCN.addresslist ADD inner join fetch ADD.addressType inner join fetch ELCN.serviceType ", Electrician.class);
		List result = session.createQuery(hqlQuery).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		List<Electrician> sdsaf= result;
		/*for (Electrician electrician : sdsaf) {
			System.out.println("Test:"+electrician);
		}*/
		return sdsaf;
	}

	public Electrician electricianById(Integer electricianId) {
		Session session = sessionFactory.getCurrentSession();
		String hqlQuery="From Electrician ELCN  join fetch ELCN.addresslist ADD inner join fetch ADD.addressType inner join fetch ELCN.serviceType where ELCN.technicianId=:technicianId ";
		Query query = session.createQuery("From Electrician ELN where ELN.technicianId=:technicianId");
		query.setParameter("technicianId", electricianId);
		return (Electrician) query.getSingleResult();
	}

}
