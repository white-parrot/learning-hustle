package org.turtle.practice.api.coupon.config;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CouponAPISecurityConfigTest {

    @Test
    public void testPasswordEncryption() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("black-passwd"));
        System.out.println(bCryptPasswordEncoder.encode("white-passwd"));
    }
}
