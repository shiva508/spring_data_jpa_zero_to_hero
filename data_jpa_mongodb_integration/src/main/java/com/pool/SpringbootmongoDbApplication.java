package com.pool;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongo.springbootmongoDB.model.User;
import com.mongo.springbootmongoDB.repository.UserRepository;

@SpringBootApplication
public class SpringbootmongoDbApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u=new User();
		u.setUserid(1);
		u.setName("shiva");
		u.setRolesList(Arrays.asList("R&D","Systemn","Admin"));
		User u1=new User();
		u1.setUserid(2);
		u1.setName("Satishasa");
		userRepository.save(u);
		userRepository.save(u1);
		System.out.println(userRepository.findAll());
	}

}
