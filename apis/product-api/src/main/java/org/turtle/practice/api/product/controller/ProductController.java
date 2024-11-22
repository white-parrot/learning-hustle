package org.turtle.practice.api.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.turtle.practice.api.product.entity.Product;
import org.turtle.practice.api.product.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/product/{productCode}")
    public Product getProduct(@PathVariable String productCode, @RequestParam("couponCode") String couponCode){
        return productService.getProductById(productCode, couponCode);
    }

}
