package FOR_WHILE_DO;

import java.util.Scanner;

public class Exercicio6 {
	
	/* 6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE) */
	
	public static void main (String[] args)
	{
		int num,soma=0,media,cont=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero: ");
		num = leia.nextInt();
		do
		{
			
			if (num%3==0)
			{
				soma = soma + num;
				cont++;
			}
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			
		}
		while(num!=0);
		
		media = soma / cont;
		
		System.out.println("\nMedia dos multiplos de 3: "+media);
		
	}
	
	

}
