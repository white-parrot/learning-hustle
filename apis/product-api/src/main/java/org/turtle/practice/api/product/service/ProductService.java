package org.turtle.practice.api.product.service;

import org.springframework.stereotype.Service;
import org.turtle.practice.api.product.entity.Product;

public interface ProductService {
    public Product addProduct(Product product);
}
