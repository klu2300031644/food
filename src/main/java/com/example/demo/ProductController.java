package com.example.demo;

// Make sure both of these imports are here
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; // <-- This is the new one
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    // Our "database" list of Product objects
    private List<Product> productList = List.of(
        new Product(1, "Apple", 1.50),
        new Product(2, "Milk", 0.99),
        new Product(3, "Bread", 2.25),
        new Product(4, "Eggs (Dozen)", 3.10)
    );

    /**
     * This method returns the FULL list of all products.
     * URL: /api/products
     */
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productList;
    }

    /**
     * This method returns ONE product by its ID.
     * URL: /api/products/{id}
     */
    @GetMapping("/api/products/{id}")
    public Product getProductById(@PathVariable long id) {
        
        // Loop through the list to find the matching product
        for (Product product : productList) {
            if (product.getId() == id) {
                return product; // Found it!
            }
        }
        
        // If no product matches, return nothing (null)
        return null; 
    }
}