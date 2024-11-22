package org.turtle.practice.api.product.service;

import org.turtle.practice.api.product.entity.Product;

public interface ProductService {
    Product addProduct(Product product);

    Product getProductById(String id, String couponCode);
}
