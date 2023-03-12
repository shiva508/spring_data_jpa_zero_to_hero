package com.pool.dao;

import java.util.List;
import javax.persistence.TypedQuery;
import com.pool.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImp implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Override
	public List<User> getAll() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

}
