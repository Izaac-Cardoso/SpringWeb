package com.exemploweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploweb.entities.OrderItem;
import com.exemploweb.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {}

