package com.HouseRent.POC.controller;

import com.HouseRent.POC.model.Product;
import com.HouseRent.POC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProductsList() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void putProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProducts(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }
}
