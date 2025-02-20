package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		final double FATORSUBTRACAO= 32;
		final double AJUSTEDIVISAO = 5/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit-FATORSUBTRACAO)*AJUSTEDIVISAO;
		System.out.println("O resultado é: "+celsius+" C.");
		fahrenheit = 126;
		
		celsius = (fahrenheit-FATORSUBTRACAO)*AJUSTEDIVISAO;
		System.out.println("O resultado é: "+celsius+" C.");
		
	}
}
