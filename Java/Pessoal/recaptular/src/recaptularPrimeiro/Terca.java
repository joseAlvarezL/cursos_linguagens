package recaptularPrimeiro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Terca {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int TOTAL_NOTAS = 3;
		var nome = "";
		var status = "";
		double nota1=0, nota2=0, nota3=0;
		Integer idade;
		double media;
		boolean aprovado;
		
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Digite sua Idade: ");
		idade = entrada.nextInt();
		entrada.nextLine();
		
		try {
			System.out.println("Digite a 1ª nota: ");
			nota1=entrada.nextDouble();
			
			System.out.println("Digite a 2ª nota: ");
			nota2=entrada.nextDouble();
			
			System.out.println("Digite a 3ª nota: ");
			nota3=entrada.nextDouble();
			
		} catch (InputMismatchException e) {
			System.out.println("Se joga da ponte!");
		}

		String idade1 = String.valueOf(idade);
		
		int dez = Integer.parseInt("10");
		
		media=(nota1+nota2+nota3)/TOTAL_NOTAS;
		
		aprovado = media>=7 && media<=10;
		status = (aprovado) ? "Aprovado":"Reprovado";
		
		
		double media2= media+=1;
		int idade2 = ++idade;
		
		String nome2 = nome.toLowerCase();
		
		boolean compa= "Aprovado".equalsIgnoreCase("aprovado");
		System.out.println(compa);
		
		entrada.close();
		System.out.println("Fim!!!");
	}
}
