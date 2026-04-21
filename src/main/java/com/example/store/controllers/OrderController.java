package com.example.store.controllers;

import com.example.store.model.Order;
import com.example.store.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping
    public List<Order> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Order addOrder(@Valid @RequestBody Order newOrder){
        return service.create(newOrder);
    }
}
