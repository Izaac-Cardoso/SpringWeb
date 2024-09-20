package com.exemploweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemploweb.entities.Product;
import com.exemploweb.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    /**
     * public Product findById(Long id) {
     *      Optional obj = productRepository.findId(id);
     *      return obj.get();
     * }
     */

}
