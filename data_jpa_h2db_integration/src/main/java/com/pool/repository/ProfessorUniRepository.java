package com.comrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProfessorUni;
@Repository
public interface ProfessorUniRepository extends JpaRepository<ProfessorUni, Integer> {

}
