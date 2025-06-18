package com.example.Product.Catalog.repository;


import com.example.Product.Catalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
