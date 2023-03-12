package com.pool.dao;

import com.pool.model.onetoone.InstrucrorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InstrucrorDetailsRepository extends JpaRepository<InstrucrorDetails, Integer> {

}
