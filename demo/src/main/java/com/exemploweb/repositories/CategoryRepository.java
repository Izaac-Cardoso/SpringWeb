package com.exemploweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
