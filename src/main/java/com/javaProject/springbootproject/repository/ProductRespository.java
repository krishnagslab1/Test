package com.javaProject.springbootproject.repository;

import com.javaProject.springbootproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository <Product, Integer> {
    Product findByName(String name);
}
