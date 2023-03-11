package com.leonardo.projetovendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.projetovendas.entities.Product;
import com.leonardo.projetovendas.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    
    @Autowired
    private ProductService product;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = product.findAll();

        return ResponseEntity.ok().body(list); 
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = product.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
