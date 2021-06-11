package POLIMORFIA_;

import java.util.Scanner;

public class AnimalMain {
	
	public static void main(String args[]) 
	{
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		
		int x;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual é o seu animal? \n(1) Cachorro \n(2) Cavalo \n(3) Preguiça");
		x = leia.nextInt();
		
		switch(x)
		{
		case 1:
			animal = cachorro;
			System.out.println("\nQual o nome do seu cachorro?");
			String nome = leia.next();
			System.out.println("\nQual a idade de seu cachorro?");
			int idade = leia.nextInt();
			System.out.println("\nQual o som de seu cachorro?");
			String som = leia.next();

			cachorro.nome(nome);
			cachorro.idade(idade);
			cachorro.som(som);
			break;
		case 2:
			animal = cavalo;
			System.out.println("\nQual o nome do seu cavalo?");
			nome = leia.next();
			System.out.println("\nQual a idade de seu cavalo?");
			idade = leia.nextInt();
			System.out.println("\nQual o som de seu cavalo?");
			som = leia.next();

			cavalo.nome(nome);
			cavalo.idade(idade);
			cavalo.som(som);
			break;
		case 3:
			animal = preguica;
			System.out.println("\nQual o nome da sua preguiça?");
			nome = leia.next();
			System.out.println("\nQual a idade da sua preguiça?");
			idade = leia.nextInt();
			System.out.println("\nQual o som da sua preguiça?");
			som = leia.next();

			preguica.nome(nome);
			preguica.idade(idade);
			preguica.som(som);
			break;
			
		}
	}

}
