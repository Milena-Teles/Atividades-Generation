package POLIMORFIA_;

import Polimorfia.Animal;

public class Preguica extends Animal {
	
	public Preguica()
	{
		super("Preguica");
	}
	
	@Override
	public void nome(String nome)
	{
		System.out.println("Nome da Pregui�a: "+nome);
	}
	
	public void idade(int idade)
	{
		System.out.println("Idade da Pregui�a: "+idade);
	}
	
	public void som(String som) 
	{
		System.out.println("Som emitido: "+som);
	}
	
	

}