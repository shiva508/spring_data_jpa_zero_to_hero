package com.pool.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pool.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
