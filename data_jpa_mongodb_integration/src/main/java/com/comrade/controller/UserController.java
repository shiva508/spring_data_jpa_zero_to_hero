package com.comrade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.comrade.model.User;
import com.comrade.repository.UserRepository;
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/")
	public List<User> mongodbUserList(){
		return userRepository.findAll();
	}
}
