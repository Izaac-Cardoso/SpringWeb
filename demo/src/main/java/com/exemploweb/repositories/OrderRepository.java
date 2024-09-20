package com.exemploweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
