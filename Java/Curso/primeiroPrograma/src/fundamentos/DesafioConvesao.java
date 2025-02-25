package fundamentos;

//import java.util.Locale;
import java.util.Scanner;

public class DesafioConvesao {
	public static void main(String[] args) {

		
		Scanner receber1 = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String valor1 = receber1.nextLine().replace(",", ".");
		
		
		System.out.println("Digite o segundo salário: ");
		String valor2 = receber1.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salário: ");
		String valor3 = receber1.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1+salario2+salario3)/3;
		System.out.printf("A média dos salários é: %.2f",media);
		
		receber1.close();
		
	}
}
