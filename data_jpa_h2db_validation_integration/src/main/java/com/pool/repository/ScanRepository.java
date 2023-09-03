package com.comrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comrade.domine.Scan;

@Repository
public interface ScanRepository extends JpaRepository<Scan, Long>{

}
