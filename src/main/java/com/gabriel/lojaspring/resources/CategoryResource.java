package com.gabriel.lojaspring.resources;


import java.util.List;

import com.gabriel.lojaspring.domain.Category;
import com.gabriel.lojaspring.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(method = RequestMethod.GET)
	public List<Category> listar(){
		if(categoriaService.listarCategorias().size() > 0){
			ResponseEntity.ok();
		}
		
		return categoriaService.listarCategorias();
	}


    /*public List<Category> listar(){
        
       /* Category c1 = new Category();
		Category c2 = new Category();
		Category c3 = new Category();

		List<Category> categories = new ArrayList<>();
		
		c1.setId(1);
		c1.setName("Informática");

		c2.setId(2);
		c2.setName("Móveis");

		c3.setId(3);
		c3.setName("Limpeza");

		categories.addAll(Arrays.asList(c1,c2,c3));
        
        return categories;
    }*/

    
}
