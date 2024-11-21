package org.turtle.practice.api.coupon.controller;

import org.springframework.web.bind.annotation.*;
import org.turtle.practice.api.coupon.entity.Coupon;
import org.turtle.practice.api.coupon.service.CouponService;

@RestController
@RequestMapping("/api")
public class CouponController {

    private final CouponService couponService;
    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @PostMapping("/coupon")
    public Coupon addCoupon(@RequestBody Coupon coupon){
        return couponService.addCoupon(coupon);
    }

    @GetMapping("/coupon")
    public Coupon getCoupon(@RequestParam("code") String code){
        return couponService.findCoupon(code);
    }
}
