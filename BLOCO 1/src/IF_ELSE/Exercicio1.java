package IF_ELSE;

	import java.util.Scanner;

	public class Exercicio1 {
		
		
		/* 1- Faça um programa que receba três inteiros e diga qual deles é o maior. */
		
		public static void main (String[] args) {
			
			int num1,num2,num3,maiornum=0;
			try (Scanner leia = new Scanner (System.in)) {
				
				System.out.println("\nEntre com o primeiro numero: ");
				num1 = leia.nextInt();
				System.out.println("\nEntre com o segundo numero: ");
				num2 = leia.nextInt();
				System.out.println("\nEntre com o terceiro numero: ");
				num3 = leia.nextInt();
			}
			
			if (maiornum<num1);
			{
				maiornum=num1; 
			}
		
			if (maiornum<num2)
			{
				maiornum = num2;
			}
			if (maiornum<num3);
			{
				maiornum=num3;
			}
			
			System.out.println("\nO maior numero digitado foi: "+maiornum);
		}
		

	}