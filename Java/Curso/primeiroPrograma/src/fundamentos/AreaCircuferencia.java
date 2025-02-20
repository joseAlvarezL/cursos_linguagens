package fundamentos;

public class AreaCircuferencia {
	public static void main(String[] args) {
		int raio = 3;
		double raio1 = 3.4;
		final double PI = 3.14159;
		
		System.out.println(PI * raio1 * raio1);
		double area = PI * raio1 * raio1;
		System.out.println(area);
		
		raio = 5;
		raio1 = 4;
		area = PI * raio1;
		System.out.println("Área = "+area+" m2.");
	}
}
