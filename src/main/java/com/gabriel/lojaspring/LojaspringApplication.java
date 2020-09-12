package com.gabriel.lojaspring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gabriel.lojaspring.domain.Category;
import com.gabriel.lojaspring.repositories.CategoryRepository;
import com.gabriel.lojaspring.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaspringApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {

		SpringApplication.run(LojaspringApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null, "Informática");
		Category c2 = new Category(null, "Escritório");
		Category c3 = new Category(null, "Limpeza");

		categoryRepository.saveAll(Arrays.asList(c1,c2,c3));

	}



}
