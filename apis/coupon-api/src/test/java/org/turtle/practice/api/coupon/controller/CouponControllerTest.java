package org.turtle.practice.api.coupon.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.turtle.practice.api.coupon.entity.Coupon;

import java.time.LocalDateTime;

public class CouponControllerTest {

    @Test
    public void testCouponJSON() throws JsonProcessingException {
        Coupon coupon = new Coupon();
        coupon.setId(12121L);
        coupon.setCode("DIWALISALE");
        coupon.setDiscount(10L);
        coupon.setExpiryDate(LocalDateTime.parse("2025-11-21T10:15"));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        String json = objectMapper.writeValueAsString(coupon);
        System.out.println(json);
    }
}
