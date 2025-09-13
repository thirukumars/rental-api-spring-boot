package com.HouseRent.POC.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private int prodId;
    private double price;
}
