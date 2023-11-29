package com.comrade.dao;

import com.comrade.model.embeddable.Lion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LionRepository extends JpaRepository<Lion, Integer> {

}
