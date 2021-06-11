package POLIMORFIA_;

public class Cavalo extends Animal {
	
	public Cavalo()
	{
		super("Cavalo");
	}
	
	@Override
	public void nome(String nome)
	{
		System.out.println("Nome do cavalo: "+nome);
	}
	
	public void idade(int idade)
	{
		System.out.println("Idade do cavalo: "+idade);
	}
	
	public void som(String som) 
	{
		System.out.println("Som do relincho: "+som);
	}
	
	

}
