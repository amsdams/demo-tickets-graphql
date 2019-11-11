package com.amsdams.repository;

import com.amsdams.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
