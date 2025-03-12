package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um valor: ");
		String dia = entrada.nextLine();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		}else if("Segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}
		else if("Terça".equalsIgnoreCase(dia)
				|| "Terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}
		else if("Quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}
		else if("Quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}
		else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		}
		else if(dia.equalsIgnoreCase("Sábado")
				|| "Sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}
		else {
			System.out.println("Inválido");
		}
		
//		int valor1 = entrada.nextInt();
//
//		if (valor1 == 1) {
//			System.out.println("Domingo");
//		} else if (valor1 == 2) {
//			System.out.println("Segunda");
//		} else if (valor1 == 3) {
//			System.out.println("Terça");
//		} else if (valor1 == 4) {
//			System.out.println("Quarta");
//		} else if (valor1 == 5) {
//			System.out.println("Quinta");
//		} else if (valor1 == 6) {
//			System.out.println("Sexta");
//		} else if (valor1 == 7) {
//			System.out.println("Sábado");
//		}
//
//		System.out.println("Fim!!");
		entrada.close();

	}
}
