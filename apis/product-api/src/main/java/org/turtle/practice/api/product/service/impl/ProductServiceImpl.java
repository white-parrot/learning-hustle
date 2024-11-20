package org.turtle.practice.api.product.service.impl;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turtle.practice.api.product.entity.Product;
import org.turtle.practice.api.product.repo.ProductRepo;
import org.turtle.practice.api.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
}
