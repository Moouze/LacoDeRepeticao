package ExLacoRepeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int num, numero, contPar=0, contImpar=0;

		for (num=1; num <=10; num++) {
			System.out.printf("\nDigite o %dº número" ,num);
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
			
		}
		
		 System.out.println("Total de números pares: " + contPar);
	     System.out.println("Total de números ímpares: " + contImpar);
		
	}

}
