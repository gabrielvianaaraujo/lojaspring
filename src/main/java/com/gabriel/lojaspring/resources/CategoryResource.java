package com.gabriel.lojaspring.resources;

import com.gabriel.lojaspring.domain.Category;
import com.gabriel.lojaspring.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    
	@Autowired
	private CategoryService categoriaService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> buscarCategoria(@PathVariable Integer id){
		Category categoria = categoriaService.buscar(id);
		return ResponseEntity.ok().body(categoria);
	}

	@GetMapping
	public List<Category> listar(){
		return categoriaService.listarCategorias();
	}
    
}
