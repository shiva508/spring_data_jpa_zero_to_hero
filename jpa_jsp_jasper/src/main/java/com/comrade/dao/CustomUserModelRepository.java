package com.comrade.dao;

import com.comrade.model.UserModel;

import java.util.List;

public interface CustomUserModelRepository {
public void updateUser(UserModel userModel);
public List<UserModel> getCachedUsers();
public List<UserModel >findUserModelByUserNameAndEmail(String username,String emailAddress);
public  List<UserModel> findByLanguageNamedQuery(String language);
}
