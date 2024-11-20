package org.turtle.practice.api.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turtle.practice.api.product.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
