package com.MinhaLojaDeGames.MinhaLojaDeGames.REPOSITORY;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	//Optional<Categoria> findByTitulo(String nome);

	

}
