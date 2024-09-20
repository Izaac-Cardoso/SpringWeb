package com.exemploweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
