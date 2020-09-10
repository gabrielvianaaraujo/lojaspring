package com.gabriel.lojaspring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gabriel.lojaspring.domain.Category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaspringApplication.class, args);

		Category c1 = new Category();
		Category c2 = new Category();
		Category c3 = new Category();

		List<Category> categorias = new ArrayList<>();
		
		c1.setId(1);
		c1.setName("Informática");

		c2.setId(2);
		c2.setName("Móveis");

		c3.setId(3);
		c3.setName("Limpeza");

		categorias.addAll(Arrays.asList(c1,c2,c3));
	}



}
