package com.BlogPessoal.BlogPessoal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.BlogPessoal.BlogPessoal.Model.Tema;
import com.BlogPessoal.BlogPessoal.Repository.TemaRepository;

public class TemaController {
	
	@Autowired
	private TemaRepository repository;
	
	@GetMapping("/tema")
	public ResponseEntity<List<Tema>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/tema/{id}")
	public ResponseEntity<Tema> GetById(@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/tema/{descricao}")
	public ResponseEntity<Tema> GetByDescricao(@RequestParam String descricao)
	{
		return repository.findByTitulo(descricao);
		
	}

}
