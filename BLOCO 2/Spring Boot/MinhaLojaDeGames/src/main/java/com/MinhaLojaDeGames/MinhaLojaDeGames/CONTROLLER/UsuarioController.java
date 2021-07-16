package com.MinhaLojaDeGames.MinhaLojaDeGames.CONTROLLER;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.Usuario;
import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.UsuarioLogin;
import com.MinhaLojaDeGames.MinhaLojaDeGames.REPOSITORY.UsuarioRepository;
import com.MinhaLojaDeGames.MinhaLojaDeGames.SERVICE.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/all")
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Object> cadastrar(@RequestBody Usuario usuario) {

		Optional<Object> novoUsuario = usuarioService.cadastrar(usuario);
		if (novoUsuario.isEmpty()) {
			return ResponseEntity.status(200).body("Usuário existente!");
		} else {
			return ResponseEntity.status(201).body("Usuário criado!");
		}

	}

	@PutMapping("/credenciais")
	public ResponseEntity<?> logar(@Valid @RequestBody UsuarioLogin usuarioLogin) {
		return usuarioService.logar(usuarioLogin).map(usuario -> ResponseEntity.ok(usuario))
				.orElse(ResponseEntity.badRequest().build());
	}
	

}
