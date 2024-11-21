package org.turtle.practice.api.coupon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turtle.practice.api.coupon.entity.Coupon;
import org.turtle.practice.api.coupon.repo.CouponRepo;
import org.turtle.practice.api.coupon.service.CouponService;

@Service
public class CouponServiceImpl implements CouponService {

    private CouponRepo couponRepo;

    public CouponServiceImpl(CouponRepo couponRepo) {
        this.couponRepo = couponRepo;
    }

    @Override
    public Coupon addCoupon(Coupon coupon) {
        return couponRepo.save(coupon);
    }

    @Override
    public Coupon findCoupon(String code) {
        return couponRepo.findByCode(code);
    }
}
