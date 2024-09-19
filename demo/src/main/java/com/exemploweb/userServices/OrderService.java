package com.exemploweb.userServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemploweb.userRepositories.OrderRepository;

import com.exemploweb.entities.Order;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    /**
     * public Order findById(Long id) {
     *      Optional obj = orderRepository.findId(id);
     *      return obj.get();
     * }
     */

}
