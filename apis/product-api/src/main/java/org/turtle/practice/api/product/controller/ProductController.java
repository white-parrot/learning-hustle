package org.turtle.practice.api.product.controller;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.turtle.practice.api.product.entity.Product;
import org.turtle.practice.api.product.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return product;
    }

}
