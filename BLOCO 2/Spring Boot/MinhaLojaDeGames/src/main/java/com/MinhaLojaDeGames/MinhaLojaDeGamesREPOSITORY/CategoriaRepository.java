package com.MinhaLojaDeGames.MinhaLojaDeGamesREPOSITORY;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.MinhaLojaDeGames.MinhaLojaDeGamesMODEL.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	ResponseEntity<Categoria> findByTitulo(String nome);

	

}
