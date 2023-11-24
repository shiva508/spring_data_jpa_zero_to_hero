package com.comrade.repository;

import com.comrade.entity.ComradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComradeRepository extends JpaRepository<ComradeEntity,Long> {
}
