package com.pool.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.pool.model.ServiceType;

@Repository
public class ServiceTypeRepositoryImpl implements ServiceTypeRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public ServiceType saveService(ServiceType serviceType) {
		Session session = sessionFactory.getCurrentSession();
		return (ServiceType) session.merge(serviceType);
	}

	//@Cacheable(value = "ehcache")
	public List<ServiceType> allServices() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From ServiceType", ServiceType.class);
		return query.getResultList();
	}

	@Cacheable(value="ServiceType.ById",key="#serviceId",unless="#result !=null")
	public ServiceType getServiceTypeById(Integer serviceId) {
		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("from ServiceType st where st.serviceId=:serviceId",ServiceType.class);
		query.setParameter("serviceId", serviceId);
		return (ServiceType) query.getSingleResult();
	}
	/*@Cacheable(value = "ServiceType.serviceType", key = "#serviceType", unless = "#serviceType != null and #serviceType.toUpperCase().startsWith('TEST')")*/
	public ServiceType getServiceTypeByServiceName(String serviceType) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(ServiceType.class);
		criteria.add(Restrictions.eq("serviceType", serviceType));
		criteria.setMaxResults(1);
		return (ServiceType) criteria.uniqueResult();
	}

	public ServiceType updateServiceType(ServiceType serviceType) {
		Session session = sessionFactory.getCurrentSession();
		return (ServiceType) session.merge(serviceType);
	}

	public ServiceType deleteServiceType(Integer serviceId) {
		
		return null;
	}

}
