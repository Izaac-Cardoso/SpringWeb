package com.exemploweb.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemploweb.entities.Category;
import com.exemploweb.services.CategoryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value = "/category")
public class CategoryResource {

    @Autowired
    private CategoryService category;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = category.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Category>> findById(@PathVariable Long id) {
        Optional<Category> c = category.findById(id);
        return ResponseEntity.ok().body(c);
    }
}
