package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public List<String> getProducts() {
        // This is our list of groceries
        return List.of("Apple", "Milk", "Bread", "Eggs");
    }
}