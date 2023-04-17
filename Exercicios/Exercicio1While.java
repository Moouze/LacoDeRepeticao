package ExLacoRepeticao;

import java.util.Scanner;

public class Exercicio1While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int idade,menor=0,maior=0;
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while(idade > 0) {
			
			if(idade < 21) {
				menor++;
			}else if(idade > 50){
				maior++;
			}
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
		}
		
			System.out.println("\nTotal de menores de 21 anos: "+menor);
			System.out.println("\nTotal de pessoas maiores de 50: "+maior);
		
	}

}
