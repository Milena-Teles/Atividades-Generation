package ARRAY;

import java.util.Scanner;

public class Exercicio3 {
	
	/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */
	
	public static void main(String[] args) 
	{
		int[][] numeros = new int[3][3];
		int l,c,contmaior=0;
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.println("Entre com um numero: ");
				numeros[l][c] = leia.nextInt();
				
				if (numeros[l][c]>10)
				{
					contmaior++;
				}
				
			}
		}
		
		System.out.println("Quantidade de valores maiores que 10: "+contmaior);
	}
	

}