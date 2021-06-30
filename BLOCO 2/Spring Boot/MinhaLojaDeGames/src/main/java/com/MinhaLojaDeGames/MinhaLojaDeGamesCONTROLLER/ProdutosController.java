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
import com.MinhaLojaDeGames.MinhaLojaDeGamesMODEL.Produtos;
import com.MinhaLojaDeGames.MinhaLojaDeGamesREPOSITORY.ProdutosRepository;

@RestController
@RequestMapping
public class ProdutosController {
	
	@Autowired ProdutosRepository repository;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<Produtos>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/produtos/{idProduto}")
	public ResponseEntity<Produtos> GetById(@PathVariable long idProduto)
	{
		return repository.findById(idProduto)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/produto/{nomePrpduto}")
	public ResponseEntity<Produtos> GetByNome(@RequestParam String nomeProduto)
	{
		return repository.findByTitulo(nomeProduto);
	}
	
	@PostMapping
	public ResponseEntity<Produtos> post (@RequestBody Produtos produtos)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produtos));
	}
	
	@PutMapping
	public ResponseEntity<Produtos> put (@RequestBody Produtos produtos)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produtos));
	}
	
	@DeleteMapping
	public void delete (@PathVariable long idProduto)
	{
		repository.deleteById(idProduto);
	}

}
