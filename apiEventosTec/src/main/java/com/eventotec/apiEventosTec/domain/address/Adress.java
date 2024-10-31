package com.eventotec.apiEventosTec.domain.address;

import com.eventotec.apiEventosTec.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "adress")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Adress {

    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
