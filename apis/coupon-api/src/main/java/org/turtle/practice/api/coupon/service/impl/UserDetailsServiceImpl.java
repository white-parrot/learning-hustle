package org.turtle.practice.api.coupon.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.turtle.practice.api.coupon.entity.User;
import org.turtle.practice.api.coupon.repo.UserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepo userRepo;

    public UserDetailsServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userRepo.findByUserName(username);
        return new org.springframework.security.core.userdetails.User(u.getUserName(), u.getPassword(), u.getPermissions());
    }
}
