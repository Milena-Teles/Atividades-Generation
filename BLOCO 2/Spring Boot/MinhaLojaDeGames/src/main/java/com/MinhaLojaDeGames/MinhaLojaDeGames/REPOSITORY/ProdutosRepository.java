package com.MinhaLojaDeGames.MinhaLojaDeGames.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.Categoria;
import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	//ResponseEntity<Produtos> findByTitulo(String nomeProduto);

}
