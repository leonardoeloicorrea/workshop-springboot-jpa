package com.leonardo.projetovendas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.projetovendas.entities.Order;
import com.leonardo.projetovendas.repositories.OrderRepository;

@Service
public class OrderService {
        
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
    public Order findById (Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
