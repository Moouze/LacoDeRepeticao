package ExLacoRepeticao;
		
		import java.util.Scanner;

public class Exercicio2While {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int idade,gen,categoria,PDB=0,MDF=0,HDM40=0,MDF30=0;
		String escolha = "sim";
		
		while(escolha.equalsIgnoreCase("sim")) {
			
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nDe acordo com as opções abaixo, informe o seu genero: \n1-- Masculino\n2-- Feminino\n3-- Não se aplica.");
		gen = leia.nextInt();
		
		System.out.println("\nDe acordo com as opções abaixo, informe a sua categoria: \n1-- Backend\n2-- Frontend\n3-- Mobile\n4-- Fullstack");
		categoria = leia.nextInt();
		
		System.out.println("\n Deseja continuar?  (sim ou não?)");
		escolha = leia.next();
		
		if(categoria==1) {
			PDB++;
		}
			
		if(gen==2 && categoria==2) {
			MDF++;
		}
			
		if(gen==1 && categoria==3 && idade>=40) {
			HDM40++;
		}
		
		if(gen==2 && categoria==4 && idade<=30) {
			MDF30++;
		}
		
		
		}
		
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+PDB);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: "+MDF);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: "+HDM40);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: "+MDF30);
	}

}
