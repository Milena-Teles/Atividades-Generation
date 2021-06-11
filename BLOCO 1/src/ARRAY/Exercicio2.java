package ARRAY;

import java.util.Scanner;

public class Exercicio2 {
	
	/* 2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados. */
	
	public static void main (String[] args) 
	{
		float[] numero = new float[5];
		int x,contimpar=0,par,impar;
		float somapar=0;
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<numero.length;x++)
		{
			System.out.println("Entre com um numero: ");
			numero[x] = leia.nextFloat();
			
			if(numero[x]%2==0)
			{
				somapar = somapar + numero[x];
				
			}
			else
			{
				contimpar++;	
			}
			
			
		System.out.println("Soma dos numeros pares digitados: "+somapar);
		System.out.println("Quantidade de numeros impares digitados:"+contimpar);
		
		
		
		}	
		
	}
	

}
