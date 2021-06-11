package POO;

public class Eletronico {
	
	private String clientenome;
	private String produto;
	private int numerocompra;
	
	public Eletronico(String clientenome, String produto, int numerocompra) 
	{
		this.clientenome = clientenome;
		this.produto = produto;
		this.numerocompra = numerocompra;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+clientenome+"\nProduto: "+produto+"\nNumero de Compra: "+
	numerocompra);
	}

	public String getClientenome() {
		return clientenome;
	}

	public void setClientenome(String clientenome) {
		this.clientenome = clientenome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getNumerocompra() {
		return numerocompra;
	}

	public void setNumerocompra(int numerocompra) {
		this.numerocompra = numerocompra;
	}
	
	

}