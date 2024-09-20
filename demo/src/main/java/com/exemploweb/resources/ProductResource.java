package com.exemploweb.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemploweb.entities.Product;
import com.exemploweb.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/product")
public class ProductResource {

    @Autowired
    private ProductService product;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = product.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
        Optional<Product> p = product.findById(id);
        return ResponseEntity.ok().body(p);
    }
}
