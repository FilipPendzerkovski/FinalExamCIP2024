package com.example.finalexamcip2024.repository;

import com.example.finalexamcip2024.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
