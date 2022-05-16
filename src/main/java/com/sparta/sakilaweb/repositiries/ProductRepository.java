package com.sparta.sakilaweb.repositiries;

import com.sparta.sakilaweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}