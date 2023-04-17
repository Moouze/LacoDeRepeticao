package ExLacoRepeticao;

import java.util.Scanner;

public class Exercicio1DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int num, soma = 0;
		
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if (num > 0) {
			
			soma = soma + num;
			
		}
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if (num > 0) {
				soma = soma + num;
			}
		
		} while (num != 0);
		
		System.out.println(soma);
	}
}
