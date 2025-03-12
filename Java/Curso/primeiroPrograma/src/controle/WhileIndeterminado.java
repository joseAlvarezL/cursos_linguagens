package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		// inversao pode ser usado para while infinito
		while(!valor.equalsIgnoreCase("Sair")){
			System.out.printf("Você diz: ");
			valor = entrada.nextLine();
		}
		entrada.close();
	}
}
