package com.example.Product.Catalog.service;

import com.example.Product.Catalog.model.Product;
import com.example.Product.Catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public Product getProductById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}