package com.comrade.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{
   User findByEmail(String email);
   Optional<User> findByName(String email);
}
