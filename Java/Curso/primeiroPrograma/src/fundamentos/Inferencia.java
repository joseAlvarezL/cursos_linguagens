package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;// declaração da variável e inicialização
		System.out.println(a);

		var b = 4.5;
		System.out.println(b);
		b = 12;
		System.out.println(b);

		var c = "texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		byte galo = 127;
		System.out.println(galo);
		
		double d; // variável foi declarada
		d = 123.32; // variável foi inicializada
		System.out.println(d); // usada!
	}
}
