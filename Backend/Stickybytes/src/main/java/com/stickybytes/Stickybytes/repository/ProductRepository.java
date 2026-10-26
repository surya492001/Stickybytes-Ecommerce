package com.stickybytes.Stickybytes.repository;

import com.stickybytes.Stickybytes.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}