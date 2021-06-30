package com.MinhaLojaDeGames.MinhaLojaDeGamesCONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MinhaLojaDeGames.MinhaLojaDeGamesMODEL.Categoria;
import com.MinhaLojaDeGames.MinhaLojaDeGamesREPOSITORY.CategoriaRepository;

@RestController
@RequestMapping
public class CategoriaController {
	
	@Autowired CategoriaRepository repository;
	
	@GetMapping("/categoria")
	public ResponseEntity<List<Categoria>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/categoria/{idCategoria}")
	public ResponseEntity<Categoria> GetById(@PathVariable long idCategoria)
	{
		return repository.findById(idCategoria)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/categoria/{nome}")
	public ResponseEntity<Categoria> GetByNome(@RequestParam String nome)
	{
		return repository.findByTitulo(nome);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria categoria)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put (@RequestBody Categoria categoria)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping
	public void delete (@PathVariable long idCategoria)
	{
		repository.deleteById(idCategoria);
	}
	

}
