package com.leonardo.projetovendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.projetovendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
