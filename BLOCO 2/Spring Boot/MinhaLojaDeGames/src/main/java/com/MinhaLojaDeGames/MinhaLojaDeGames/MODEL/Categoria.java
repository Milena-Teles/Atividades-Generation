package com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Categoria {
		
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long idCategoria;
	
	@NotNull
	public String nome;
	
	public String descricao;
	
	/*
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	public Produtos produto;
	*/

	public long getId() {
		return idCategoria;
	}

	public void setId(long id) {
		this.idCategoria = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
