package com.example.store.service;

import com.example.store.model.Order;
import com.example.store.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repo;

    public List<Order> getAll() { return repo.findAll();}
    public Order create(Order order) { return repo.save(order);}
}
