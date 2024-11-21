package org.turtle.practice.api.coupon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turtle.practice.api.coupon.entity.Coupon;

@Repository
public interface CouponRepo extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String id);

}
