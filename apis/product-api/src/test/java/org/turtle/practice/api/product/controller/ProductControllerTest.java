package org.turtle.practice.api.product.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Setter;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.turtle.practice.api.product.entity.Product;

@Setter
public class ProductControllerTest {

    private Logger logger;

    @Test
    public void testProductJSON() throws JsonProcessingException {
        Product p = new Product();
        p.setCode("NETFLIXIN");
        p.setName("Netflix India");
        p.setDescription("OTT : Netflix India");
        p.setPrice(799.00);

        String productJson = new ObjectMapper().writeValueAsString(p);
        System.out.println(productJson);
    }
}
