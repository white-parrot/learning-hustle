package org.turtle.practice.api.coupon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class CouponAPISecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic(Customizer.withDefaults());
        httpSecurity.authorizeRequests(
                authorize -> authorize.requestMatchers(HttpMethod.GET,  "/api/coupon")
                        .hasAnyAuthority("COUPON_READ", "COUPON_WRITE", "COUPON_DELETE")
                        .requestMatchers(HttpMethod.POST, "/api/coupon").hasAuthority("COUPON_WRITE")
        );
        httpSecurity.csrf(csrf -> csrf.disable());
        return httpSecurity.build();
    }
}
