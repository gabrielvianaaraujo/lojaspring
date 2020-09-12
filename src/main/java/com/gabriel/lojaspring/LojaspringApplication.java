package com.gabriel.lojaspring;

import java.util.Arrays;


import com.gabriel.lojaspring.domain.Category;
import com.gabriel.lojaspring.domain.Product;
import com.gabriel.lojaspring.repositories.CategoryRepository;
import com.gabriel.lojaspring.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaspringApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {

		SpringApplication.run(LojaspringApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null, "Informática");
		Category c2 = new Category(null, "Escritório");
		Category c3 = new Category(null, "Limpeza");

		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 800.00);
		Product p4 = new Product(null, "Vassoura", 20.00);

		c1.getProducts().addAll(Arrays.asList(p1,p2,p3));
		c2.getProducts().addAll(Arrays.asList(p2));
		c3.getProducts().addAll(Arrays.asList(p4));

		p1.getCategories().addAll(Arrays.asList(c1));
		p2.getCategories().addAll(Arrays.asList(c1, c2));
		p3.getCategories().addAll(Arrays.asList(c1));
		p4.getCategories().addAll(Arrays.asList(c3));


		
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4));

	}



}
