package POO;

public class Cliente {
	
	private String nomeCliente;
	private String cpf;
	private String endere�o;
	private String email;
	private String telefone;
	
	public Cliente(String nomeCliente, String cpf, String endere�o, String email, String telefone)
	{
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
		System.out.println("\nNome: "+nomeCliente+" \nCPF: "+cpf+"\nEndere�o: "+endere�o
				+"\nEmail: "+email+"\nTelefone: "+telefone);
		
	}






	
	

}
