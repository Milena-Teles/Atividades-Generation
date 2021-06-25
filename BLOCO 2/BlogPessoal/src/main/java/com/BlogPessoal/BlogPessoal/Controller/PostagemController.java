package com.BlogPessoal.BlogPessoal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.BlogPessoal.BlogPessoal.Model.Postagem;
import com.BlogPessoal.BlogPessoal.Repository.PostagemRepository;


@RestController
@RequestMapping(value = "/postagem")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping("/findAll")
	public List<Postagem> findAll()
	{
		return repository.findAll();
	}  	
	
	@GetMapping("{id}")
	public Postagem findById(@PathVariable Long id)
	{
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/titulo")
	public Postagem findByTitulo(@RequestParam String titulo)
	{
		return repository.findByTitulo(titulo);
	}

}
