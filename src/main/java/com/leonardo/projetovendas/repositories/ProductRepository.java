package com.leonardo.projetovendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.projetovendas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
