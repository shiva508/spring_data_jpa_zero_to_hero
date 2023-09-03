package com.comrade.dao.DefiningRepositoryInterfaces.FinetuningRepositoryDefinition;

import com.comrade.model.UserModel;

public interface CustomUserMyBaseRepository extends MyBaseRepository<UserModel, Integer>{
		UserModel findByEmailAddress(String emailAddress);

}
