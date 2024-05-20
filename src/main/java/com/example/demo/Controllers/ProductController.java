package com.example.demo.Controllers;

import com.example.demo.Domain.Entity.Product;
import com.example.demo.Service.Impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @CrossOrigin
    @GetMapping("/product/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @CrossOrigin
    @GetMapping("/products")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }
}
