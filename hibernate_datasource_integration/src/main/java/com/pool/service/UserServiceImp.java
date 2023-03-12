package com.pool.service;

import java.util.List;

import com.pool.dao.UserDao;
import com.pool.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	@Transactional
	public List<User> getAllUsers() 
	{
		return userDao.getAll();
	}

}
