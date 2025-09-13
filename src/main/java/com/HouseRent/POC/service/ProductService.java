package com.HouseRent.POC.service;

import com.HouseRent.POC.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product("chair", 1, 10.0),
            new Product("Iron box", 2, 30)
    );
    public List<Product> getProducts() {
        return products;
    }
}
