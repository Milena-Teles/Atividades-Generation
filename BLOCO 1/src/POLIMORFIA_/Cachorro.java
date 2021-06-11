package POLIMORFIA_;

import Polimorfia.Animal;

public class Cachorro extends Animal {
	
	public Cachorro()
	{
		super("Cachorro");
	}
	
	@Override
	public void nome(String nome)
	{
		System.out.println("Nome do cachorro: "+nome);
	}
	
	public void idade(int idade) 
	{
		System.out.println("Idade do cachorro: "+idade);
	}
	
	public void som(String som) 
	{
		System.out.println("Som do latido: ");
	}
	
	

}
