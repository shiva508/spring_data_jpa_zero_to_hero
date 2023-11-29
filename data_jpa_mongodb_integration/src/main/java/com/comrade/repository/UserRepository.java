package com.comrade.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.comrade.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
