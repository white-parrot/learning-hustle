package org.turtle.practice.api.coupon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turtle.practice.api.coupon.entity.Permission;

@Repository
public interface PermissionRepo extends JpaRepository<Permission, Long> {
}