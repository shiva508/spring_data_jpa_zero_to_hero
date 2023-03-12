package com.pool.dao;

import com.pool.entity.User;

import java.util.List;

public interface UserDao {
public void add(User user);
public List<User> getAll();
}
