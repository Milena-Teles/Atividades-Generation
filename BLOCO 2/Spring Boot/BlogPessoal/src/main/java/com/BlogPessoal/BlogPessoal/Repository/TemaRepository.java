package com.BlogPessoal.BlogPessoal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.BlogPessoal.BlogPessoal.Model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{

	ResponseEntity<Tema> findByTitulo(String descricao);

	
	
	

}
