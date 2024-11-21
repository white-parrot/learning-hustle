package org.turtle.practice.api.coupon.service;

import org.turtle.practice.api.coupon.entity.Coupon;

public interface CouponService {
    public Coupon addCoupon(Coupon coupon);

    public Coupon findCoupon(String code);
}
