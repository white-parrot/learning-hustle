package org.turtle.practice.api.product.util;

import org.springframework.web.client.RestTemplate;
import org.turtle.practice.api.product.dto.Coupon;
import org.turtle.practice.api.product.entity.Product;

public class ProductUtil {

    private static final String getCouponURI = "coupon?code=";

    public static Product applyCoupon(Product product, String couponCode, String couponAPIaseURL){
        if(couponCode != null){
            RestTemplate template = new RestTemplate();
            String obsoleteURL = couponAPIaseURL + getCouponURI + couponCode;
            Coupon coupon = template.getForObject(obsoleteURL, Coupon.class);
            if(coupon != null){
                double offerPrice = offerPrice(product.getPrice(), coupon.getDiscount());
                product.setOfferPrice(offerPrice);
                product.setTotalDiscount(coupon.getDiscount() + "%");
            }
        }
        return  product;
    }

    /* Logic to Calculate Price of Product after Discount*/
    private static double offerPrice(double price, long discount){
        return (price - (price * ((double) discount / 100)));
    }
}
