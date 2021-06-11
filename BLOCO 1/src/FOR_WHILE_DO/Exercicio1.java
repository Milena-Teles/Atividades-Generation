package FOR_WHILE_DO.WHILE;

	public class Exercicio1 {

/* 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR) */

public static void main (String[] args)
{
	int num,x;
	
	for(x=1000;x<=1999;x++)
	{
		if(x%11==5)
		{
			System.out.println("Numeros: "+x);
		}
	}
}


}