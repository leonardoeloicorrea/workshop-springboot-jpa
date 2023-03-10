package com.leonardo.projetovendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.projetovendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
