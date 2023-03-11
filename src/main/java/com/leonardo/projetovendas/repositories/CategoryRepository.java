package com.leonardo.projetovendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.projetovendas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}

