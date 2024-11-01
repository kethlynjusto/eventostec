package com.eventotec.apiEventosTec.domain.event;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
