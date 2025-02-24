package fundamentos;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia");
		System.out.println("Bom dia");// executar essas 3 partes isoladamente

		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("MegaSena: %d %d %d %d %n", 1,2,3,4);
		System.out.printf("Salário: %.2f%n", 23.4558 );
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine(); // captura uma linha inteira de texto digitada pelo usuário (até o Enter) e retorna como String.
		System.out.print("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); /// lê o próximo valor inteiro digitado pelo usuário e retorna como int.
		
		System.out.println("\n\nNome: "+nome + " Sobrenome: "+sobrenome + " Idade: "+idade);
		System.out.printf("%s %s tem %d anos.",
				nome,sobrenome,idade);
		entrada.close(); // Sempre feche o Scanner após o uso para liberar os recursos.
	}
}
