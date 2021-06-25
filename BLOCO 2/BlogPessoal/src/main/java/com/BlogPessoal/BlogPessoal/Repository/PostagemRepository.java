package com.BlogPessoal.BlogPessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.BlogPessoal.BlogPessoal.Model.Postagem;



@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	Postagem findByTitulo(String titulo);
	

	
	
}
