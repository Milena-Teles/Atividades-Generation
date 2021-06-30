package com.MinhaLojaDeGames.MinhaLojaDeGamesMODEL;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Produtos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long idProduto;
	
	@NotNull
	public String nomeProduto;
	
	@NotNull
	public String marca;
	
	@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
	private List<Produtos> produtos;
	

	public List<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
