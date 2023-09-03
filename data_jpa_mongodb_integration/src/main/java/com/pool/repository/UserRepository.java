package com.comrade.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.springbootmongoDB.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
