package POO;

public class Cliente {
	
	private String nomeCliente;
	private String cpf;
	private String enderešo;
	private String email;
	private String telefone;
	
	public Cliente(String nomeCliente, String cpf, String enderešo, String email, String telefone)
	{
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.enderešo = enderešo;
		this.email = email;
		this.telefone = telefone;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public void imprimirInfo() 
	{
		System.out.println("\nNome: "+nomeCliente+" \nCPF: "+cpf+"\nEnderešo: "+enderešo
				+"\nEmail: "+email+"\nTelefone: "+telefone);
		
	}






	
	

}
