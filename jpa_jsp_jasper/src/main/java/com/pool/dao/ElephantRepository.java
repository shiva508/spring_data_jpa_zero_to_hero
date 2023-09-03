package com.comrade.dao;

import com.comrade.model.embeddable.Elephant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ElephantRepository extends JpaRepository<Elephant, Integer>{

}
