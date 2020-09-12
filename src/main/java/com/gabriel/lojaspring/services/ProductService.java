package com.gabriel.lojaspring.services;

import java.util.Optional;

import com.gabriel.lojaspring.domain.Product;
import com.gabriel.lojaspring.repositories.ProductRepository;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    /*public Product findById(Integer id){
        Optional<Product> obj = repository.findById(id);
        return obj.orElseThrow(() -> new javassist.tools.rmi.ObjectNotFoundException(name));
    }*/

}
