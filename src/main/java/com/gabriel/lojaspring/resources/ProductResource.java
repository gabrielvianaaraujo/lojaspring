package com.gabriel.lojaspring.resources;

import java.util.Optional;

import com.gabriel.lojaspring.domain.Product;
import com.gabriel.lojaspring.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> buscar(@PathVariable Integer id){
        Product product = service.findById(id);
        return ResponseEntity.ok().body(product);
    }
    
}
