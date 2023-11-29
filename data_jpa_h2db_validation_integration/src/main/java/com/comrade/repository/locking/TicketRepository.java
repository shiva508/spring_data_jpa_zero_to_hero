package com.comrade.repository.locking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comrade.model.locking.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
