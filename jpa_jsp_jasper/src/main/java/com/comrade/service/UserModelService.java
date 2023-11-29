package com.comrade.service;

import java.util.List;

import com.comrade.model.UserModel;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserModelService {
    public void saveUser(UserModel userModel);
    public List<UserModel> getAllUsers();
    public UserModel findbyuserid(Integer userid);
    public void updateUser(UserModel userModel);
    public void deleteUser(Integer userid);
    public List<UserModel> getCachedUsers();
    public UserModel findByEmailAddress(String emailAddress);
    public List<UserModel> findByLanguageNamedQuery(String language);
    public UserModel findByUserNameAndLanguage(String userName,String language );
    public List<UserModel> findByUserNameEndsWith(String userName);
    public List<UserModel >findUserModelByUserNameOrEmailAddress(String username,String emailAddress);
    public Integer explicitlyNamedPlus1inout(Integer arg);
}
