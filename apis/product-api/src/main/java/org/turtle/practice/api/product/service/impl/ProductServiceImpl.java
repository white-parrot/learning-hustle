package org.turtle.practice.api.product.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.turtle.practice.api.product.entity.Product;
import org.turtle.practice.api.product.repo.ProductRepo;
import org.turtle.practice.api.product.service.ProductService;
import org.turtle.practice.api.product.util.ProductUtil;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepo productRepo;
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Value("${turtle.api.coupon.baseurl}")
    private String couponServiceBaseURL;

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProductById(String productCode, String couponCode) {
        Product product = productRepo.findByCode(productCode);
        return ProductUtil.applyCoupon(product, couponCode, couponServiceBaseURL);
    }
}
