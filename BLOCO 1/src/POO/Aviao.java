package POO;

public class Aviao {
	
	private String nomePassageiro;
	private String assento;
	private String voo;
	private Boolean bagagem; 
	
	public Aviao(String nomePassageiro, String assento, String voo, boolean bagagem) 
	{
		this.nomePassageiro = nomePassageiro;
		this.assento = assento;
		this.voo = voo;
		this.bagagem = bagagem;
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+nomePassageiro+"\nAssento: "+assento+"\nNumero do Voo: "+
				voo+"\nPossui bagagem: "+bagagem);
	}
	public String getNomePassageiro() {
		return nomePassageiro;
	}
	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	public String getVoo() {
		return voo;
	}
	public void setVoo(String voo) {
		this.voo = voo;
	}
	public Boolean getBagagem() {
		return bagagem;
	}
	public void setBagagem(Boolean bagagem) {
		this.bagagem = bagagem;
	}
	
	
	

}
