package com.comrade.dao;

import com.comrade.entity.User;

import java.util.List;

public interface UserDao {
public void add(User user);
public List<User> getAll();
}
