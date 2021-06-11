package COLLETIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		int op;
		
		 do
		{
			System.out.println("\nMenu de Opções");
			System.out.println("\n-------------------");
			System.out.println("\n(1) Adicionar um item ao estoque; \n(2) Remover um item do estoque;"
					+ "\n(3) Atualizar um item do estoque; \n(4) Mostrar estoque \n(0) Sair do programa;");
			System.out.println("\nDigite uma opção: ");
			op = scanner.nextInt();
			
			switch(op)
			{
			case 1:
				scanner.nextLine();
				System.out.println("\nEntre com o item a ser adiciona no estoque:");
				String produto = scanner.nextLine();
				estoque.add(produto);
				break;
			case 2:
				scanner.nextLine();
				System.out.println("\nEntre com o item a ser removido: ");
				String remover = scanner.nextLine();
				if (estoque.contains(remover))
				{
					estoque.remove(remover);
				}
				else
				{
					System.out.println("\nEste produto não se encontra no estoque.");
				}
			case 3:
				scanner.nextLine();
				System.out.println("\nEntre com o item a ser substituido: ");
				String sair = scanner.nextLine();
				System.out.println("\nEntre com o item a ser adicionado: ");
				String novo = scanner.nextLine();
				if (estoque.contains(sair))
				{
					estoque.remove(sair);
					estoque.add(novo);
				}
				else 
				{
					System.out.println("\nEste produto não se encontra no estoque.");
				}
			case 4:
			{
				System.out.println("\nEstoque: ");
				System.out.println(estoque);
			}
				
				
			}
		}
		while(op!=0);
		
		
		
	}

}
