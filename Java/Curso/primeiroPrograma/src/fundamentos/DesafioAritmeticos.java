package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // Math.pow(base, expoente) calcula a potência e retorna um double.
		double c = Math.pow(a, 3); // Math.pow(base, expoente) calcula a potência e retorna um double.

		System.out.println(b);
		System.out.println(c);
	}
}
