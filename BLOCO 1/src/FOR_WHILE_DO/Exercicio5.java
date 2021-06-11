package FOR_WHILE_DO;

import java.util.Scanner;

public class Exercicio5 {
	/* Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */
	
	public static void main (String[] args) 
	{
		
		int num,soma=0,cont=0;
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			soma = soma + num;
			cont++;
		}
		
		while(num!=0);
		
		System.out.println("\nSoma dos numeros digitados: "+soma);
		
	}
	

}