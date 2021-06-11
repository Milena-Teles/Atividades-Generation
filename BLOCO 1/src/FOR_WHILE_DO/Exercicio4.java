package FOR_WHILE_DO.WHILE;

import java.util.Scanner;

public class Exercicio4 {
	
	/* 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o número de pessoas calmas;
- o número de mulheres nervosas;
- o número de homens agressivos;
- o número de outros calmos;
- o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos. */
	
	public static void main (String[] args)
	{
		int idade,x=1;
		int opsexo,sexo=0,feminino=0,masculino=0,outro=0;
		int optemperamento,temperamento=0,calmo=0,nervoso=0,agressivo=0;
		int contn40=0,contfn=0,conts=0,contma=0,contoc=0,contcalmo=0,contc18=0;
		Scanner leia = new Scanner(System.in);
		
		
		
		while (x<=150)
		{
			
		
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
					
			System.out.println("\nEntre com o sexo: \n1-Feminino; \n2-Masculino; \n3-Outro;");
			opsexo = leia.nextInt();
					
			switch (opsexo)
			{
				case 1:
					sexo = feminino;
					break;
				case 2:
					sexo = masculino;
				case 3:
					sexo = outro;
				default:
					System.out.println("Opção invalida.");

					
			}
			
			System.out.println("\nEntre com o seu temperamento: \n1- Calmo; \n2- Nervoso; "
					+ "\n3- Agressivo;");
			optemperamento = leia.nextInt();
			
			switch (optemperamento)
			{
				case 1:
					temperamento = calmo;
					break;
				case 2:
					temperamento = nervoso;
					break;
				case 3:
					temperamento = agressivo;
					break;
				default:
					System.out.println("Opção invalida.");
					
		
			}
		
		
			if (temperamento==calmo)
			{
				contcalmo++;
			}
			if (sexo==feminino&temperamento==nervoso)
			{
				contfn++;
			}
			if (sexo==masculino&temperamento==nervoso)
			{
				contma++;
			}
			if (sexo==outro&temperamento==calmo)
			{
				contoc++;
			}
			if (idade>=40&temperamento==nervoso)
			{
				contn40++;
			}
			if (idade>=18&temperamento==calmo)
			{
				contc18++;
			}
		
			x++;
			
		}
		
		System.out.println("\n Numero de pessoas calmas: "+contcalmo);
		System.out.println("\n Numero de mulheres nervosas: "+contfn);
		System.out.println("\n Numero de homens agressivos: "+contma);
		System.out.println("\n Numero de outros calmos: "+contoc);
		System.out.println("\n Numero de maiores de 40 anos nervosos: "+contn40);
		System.out.println("\n Numero de menores de 18 anos calmos: "+contc18);
		
	}
	
	
}
