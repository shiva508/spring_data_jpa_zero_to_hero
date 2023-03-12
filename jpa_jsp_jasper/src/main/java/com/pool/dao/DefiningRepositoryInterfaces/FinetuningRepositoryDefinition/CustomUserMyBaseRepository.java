package com.pool.dao.DefiningRepositoryInterfaces.FinetuningRepositoryDefinition;

import com.pool.model.UserModel;

public interface CustomUserMyBaseRepository extends MyBaseRepository<UserModel, Integer>{
		UserModel findByEmailAddress(String emailAddress);

}
