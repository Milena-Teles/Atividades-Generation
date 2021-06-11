package ARRAY;

import java.util.Scanner;

public class Exercicio4 {
	
	/* 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz. */
	
	public static void main (String[] args) 
	{
		int [][] ma1 = new int[2][2];
		int [][] ma2 = new int[2][2];
		int [][] ma3 = new int[2][2];
		int l=0,c=0,op,k,x;
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("Entre com os numeros para matriz 1: ");
				ma1[l][c] = leia.nextInt();
			}
		}
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("Entre com os numeros para matriz 2: ");
				ma2[l][c] = leia.nextInt();
			}
		}
		
		System.out.println("Escolha uma opção: \n(1) somar as duas matrizes\r\n"
				+ "(2) subtrair a primeira matriz da segunda\r\n"
				+ "(3) adicionar uma constante as duas matrizes\r\n"
				+ "(4) imprimir as matrizes");
		op = leia.nextInt();
		
		switch(op)
		{
		case 1:
			
			for (l=0;l<2;l++)
			{
				for (c=0;c<2;c++)
				{
					ma3[l][c] = ma1[l][c] + ma2[l][c];
					System.out.println("\nSoma de matrizes: ");
					System.out.println(ma3[l][c]);
				}
			}
			break;
		case 2:
			
			for (l=0;l<2;l++)
			{
				for (c=0;c<2;c++)
				{
					ma3[l][c] = ma2[l][c] - ma1[l][c];
					System.out.println("\nSubtração de matrizes: ");
					System.out.println(ma3[l][c]);
				}
			}
			break;
		case 3:
			System.out.printf("\nEntre com a constante: ");
            k = leia.nextInt();
            for(int i = 0; i<2; i++) 
            {	
            	for(int j = 0; j<2; j++)
            	{
                ma1[i][j] += k; ma2[i][j] += k;
            	}
            }
            for (l=0;l<2;l++)
			{
				for (c=0;c<2;c++)
				{
					System.out.println("\nNova Matriz 1: ");
					System.out.println(ma1[l][c]);
				}
			}
			for (l=0;l<2;l++)
			{
				for (c=0;c<2;c++)
				{
					System.out.println("\nNova Matriz 2: ");
					System.out.println(ma2[l][c]);
				}
			}
            break;
		case 4:
			for (l=0;l<2;l++)
			{
				for (c=0;c<2;c++)
				{
					System.out.println("\nMatriz 1: ");
					System.out.println(ma1[l][c]);
				}
			}
			for (l=0;l<2;l++)
			{
				for (c=0;c<2;c++)
				{
					System.out.println("\nMatriz 2: ");
					System.out.println(ma2[l][c]);
				}
			}
			
            break;
		default: 
			System.out.println("Opção invalida.");
			break;
		}
		
		
	}
	

}
