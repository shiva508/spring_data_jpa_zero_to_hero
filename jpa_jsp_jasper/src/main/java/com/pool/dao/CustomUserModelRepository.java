package com.pool.dao;

import com.pool.model.UserModel;

import java.util.List;

public interface CustomUserModelRepository {
public void updateUser(UserModel userModel);
public List<UserModel> getCachedUsers();
public List<UserModel >findUserModelByUserNameAndEmail(String username,String emailAddress);
public  List<UserModel> findByLanguageNamedQuery(String language);
}
