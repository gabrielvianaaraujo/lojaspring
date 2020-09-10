package com.gabriel.lojaspring.services;

import java.util.List;
import java.util.Optional;

import com.gabriel.lojaspring.domain.Category;
import com.gabriel.lojaspring.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository catRepo;
    
    //Lista todas as categorias
    public List<Category> listarCategorias(){
        return catRepo.findAll();
    }

    //Busca uma categoria com base no Id
    public Category buscar(Integer id){
        Optional<Category> obj = catRepo.findById(id);
        return obj.orElse(null);
    }
}
