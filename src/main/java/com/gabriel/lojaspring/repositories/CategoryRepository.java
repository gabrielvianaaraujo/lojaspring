package com.gabriel.lojaspring.repositories;

import com.gabriel.lojaspring.domain.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
