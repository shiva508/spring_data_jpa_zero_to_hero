package com.pool.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.*;
import org.springframework.stereotype.Repository;
@Repository
public interface ProfessorPhoneAccessTypeRepository extends JpaRepository<ProfessorPhoneAccessType, Integer> {

}
