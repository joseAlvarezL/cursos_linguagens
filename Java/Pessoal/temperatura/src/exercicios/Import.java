package exercicios;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Import{
	public static void main(String[] args) {
		Date e = new Date(); //
		System.out.println("Data de hj: "+ e);
		
		Scanner entrada = new Scanner(System.in); // Utilizada para ler a entrada do usuário a partir de várias fontes, como o teclado, arquivos ou streams de dados.
		System.out.println("Digite 1 número: ");
		double valor1 = entrada.nextDouble();
		double raiz = Math.sqrt(valor1);
		System.out.println("A raiz Quadrada é: "+
		raiz);
		entrada.close();
		
		Random randomico = new Random(); // gerar um número aleatório
		int gerador = randomico.nextInt(10);
		System.out.println(gerador);
		
		

	}
}