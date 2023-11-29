package com.comrade.repository.locking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comrade.model.locking.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
