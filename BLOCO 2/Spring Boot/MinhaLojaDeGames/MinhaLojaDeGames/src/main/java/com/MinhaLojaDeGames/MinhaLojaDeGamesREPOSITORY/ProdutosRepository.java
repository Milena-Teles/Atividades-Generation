package com.MinhaLojaDeGames.MinhaLojaDeGamesREPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.MinhaLojaDeGames.MinhaLojaDeGamesMODEL.Categoria;
import com.MinhaLojaDeGames.MinhaLojaDeGamesMODEL.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	ResponseEntity<Produtos> findByTitulo(String nomeProduto);

}
