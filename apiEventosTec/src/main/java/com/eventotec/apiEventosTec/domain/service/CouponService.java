package com.eventotec.apiEventosTec.domain.service;

import com.eventotec.apiEventosTec.domain.coupon.Coupon;
import com.eventotec.apiEventosTec.domain.event.CouponRequestDTO;
import com.eventotec.apiEventosTec.domain.event.Event;
import com.eventotec.apiEventosTec.repositories.CouponRepository;
import com.eventotec.apiEventosTec.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;

public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private EventRepository eventRepository;

    public Coupon addCouponToEvent(UUID eventId, CouponRequestDTO couponData){
        Event event = eventRepository
                .findById(eventId).orElseThrow(() -> new IllegalArgumentException("Event not found"));

        Coupon coupon = new Coupon();
        coupon.setCode(couponData.code());
        coupon.setDiscount(couponData.discount());
        coupon.setValid(new Date(couponData.valid()));
        coupon.setEvent(event);

        return couponRepository.save(coupon);
    }
}
