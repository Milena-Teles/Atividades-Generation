package FOR_WHILE_DO;

import java.util.Scanner;

public class Exercicio3 {
	
	/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */
	
	public static void main (String[] args) 
	{
		int idade = 0,cont21=0,cont50=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		
		while (idade!=-99)
		{
			
			if (idade<=21)
			{
				cont21++;
			}
			if (idade >=50)
			{
				cont50++;
			}			
			System.out.println("\nEntre com a idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+cont21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+cont50);
	}
	

}
