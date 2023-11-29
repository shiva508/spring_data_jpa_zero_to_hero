package com.comrade.dao;

import com.comrade.model.onetoone.Instrucror;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InstrucrorRepository extends JpaRepository<Instrucror, Integer> {

}
