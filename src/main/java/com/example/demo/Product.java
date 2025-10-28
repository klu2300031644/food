package com.example.demo;

public class Product {

    private long id;
    private String name;
    private double price;

    // This is a constructor to make it easy to create a new product
    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // These are the "getters"
    // Spring Boot uses these to create the JSON output
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}