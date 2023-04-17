package ExLacoRepeticao;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
	int n1, n2, n;
	
	System.out.println("\nDigite o primeiro número do intervalo:  ");
	n1 = leia.nextInt();
	
	System.out.println("\nDigite o segundo número do intervalo:  ");
	n2 = leia.nextInt();
	
	if (n1 < n2) {
		
	for (n = n1; n <= n2; n++) {
		
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.printf("\n%d é multiplode 3 e 5", n);
			}
		}	
	}else {
		System.out.println("Intervalo Inválido");
	}
	
	}

}
