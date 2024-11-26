package org.turtle.practice.api.coupon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.annotation.ModelMethodProcessor;
import org.springframework.web.servlet.ModelAndView;
import org.turtle.practice.api.coupon.entity.Coupon;
import org.turtle.practice.api.coupon.service.CouponService;

@Controller
@RequestMapping("/ui")
public class AdminUIController {

    CouponService couponService;

    public AdminUIController(CouponService couponService) {
        this.couponService = couponService;
    }

    @GetMapping("/show-add-coupon")
    public String newCoupon() {
        return "new-coupon";
    }

    @PostMapping("/save-coupon")
    public String saveCoupon(Coupon coupon) {
        couponService.addCoupon(coupon);
        return "save-success";
    }

    @GetMapping("/get-coupon")
    public String getCoupon() { return "get-coupon"; }
    @PostMapping("/coupon-detail")
    public ModelAndView getCouponDetail(String code) {
        ModelAndView couponDetail = new ModelAndView("coupon-detail");
        couponDetail.addObject(couponService.findCoupon(code));
        return couponDetail;
    }
}
