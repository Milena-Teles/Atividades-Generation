package FOR_WHILE_DO.WHILE;

import java.util.Scanner;

public class Exercicio2 {
	
	/* 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */
	
	public static void main (String[] args)
	{
		int num,x,contpar=0,contimpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			
			if(num % 2==0)
			{
				contpar++;
			}
			if (num % 2 != 0)
			{
				contimpar++;
			}
				
		}
		
		System.out.println("\nQuantidade de numeros pares: "+contpar);
		System.out.println("\nQuantidade de numeros impares: "+contimpar);
	}
	

}