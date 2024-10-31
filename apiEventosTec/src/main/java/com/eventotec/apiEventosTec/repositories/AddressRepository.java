package com.eventotec.apiEventosTec.repositories;

import com.eventotec.apiEventosTec.domain.address.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Adress, UUID> {

}
