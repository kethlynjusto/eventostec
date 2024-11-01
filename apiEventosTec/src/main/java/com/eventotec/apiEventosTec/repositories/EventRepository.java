package com.eventotec.apiEventosTec.repositories;

import com.eventotec.apiEventosTec.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {

}
