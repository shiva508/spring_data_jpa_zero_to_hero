package com.pool.repository.ENUM;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ENUM.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
