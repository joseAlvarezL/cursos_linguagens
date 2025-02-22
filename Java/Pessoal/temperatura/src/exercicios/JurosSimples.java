package exercicios;

public class JurosSimples{
	public static void main(String[] args) {
		double principal = 1000.0;
		double taxa = 0.05;
		double tempo = 2.0;
		
		double juros = principal*taxa*tempo;
		
		System.out.println(juros);
	}
}