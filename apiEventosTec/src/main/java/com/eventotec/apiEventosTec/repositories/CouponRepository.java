package com.eventotec.apiEventosTec.repositories;

import com.eventotec.apiEventosTec.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {

}
