package com.comrade.dao;

import com.comrade.model.onetoone.InstrucrorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InstrucrorDetailsRepository extends JpaRepository<InstrucrorDetails, Integer> {

}
