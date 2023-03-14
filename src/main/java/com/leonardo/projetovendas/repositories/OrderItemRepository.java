package com.leonardo.projetovendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.projetovendas.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
