package com.MinhaLojaDeGames.MinhaLojaDeGames.REPOSITORY;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.Produtos;
import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario> findByEmail(String email);
	
}
