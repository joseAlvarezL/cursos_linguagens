package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
// calcular media de notas em 1 turma
// digitar nota valida (0 -10)
// nota valida > armazenar numa var (total) > nova nota > armazenar numa var total
// var total armazena todas as notas validas
// outra var definir quantas notas validas foram digitadas
// 1 - total, 2 - notas digitadas, 3 media
// sinal para finalizar e mostrar o resultado media, (sinal -1)

		Scanner entrada = new Scanner(System.in);

		double total = 0;
		double notas = 0;
		double validas = 0;
		String sair = "";

		while (!sair.equalsIgnoreCase("-1")) {
			System.out.println("Digite a nota de 1 até 10");
			notas = entrada.nextInt();
			
			if(notas == -1){
				sair = "-1";
			}else if(notas>0 && notas<11){
				total+= notas;
				validas ++;
				System.out.println("Total acumulado: "+total);
				System.out.println("Notas Validas: "+validas);
			}else {
				System.out.println("Número invalido");
			}
		}
			
		entrada.close();
		
		double media = total/validas;
		
		System.out.println("\nSoma das notas: "+total);
		System.out.println("\nTotal de notas validas: "+validas);
		System.out.println("\nMédia das notas: "+media);
		System.out.println("Encerrado!!");

	}

}
