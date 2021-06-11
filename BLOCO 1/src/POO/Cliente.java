package POO;

public class Cliente {
	
	private String nomeCliente;
	private String cpf;
	private String endereço;
	private String email;
	private String telefone;
	
	public Cliente(String nomeCliente, String cpf, String endereço, String email, String telefone)
	{
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
		System.out.println("\nNome: "+nomeCliente+" \nCPF: "+cpf+"\nEndereço: "+endereço
				+"\nEmail: "+email+"\nTelefone: "+telefone);
		
	}






	
	

}
