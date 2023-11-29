package com.comrade.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableMongoRepositories(basePackages = {"com.mongo.springbootmongoDB"})
@Configuration
public class MongoDBConfig {

}
