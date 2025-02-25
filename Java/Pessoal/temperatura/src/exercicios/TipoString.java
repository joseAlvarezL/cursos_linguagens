package exercicios;

public class TipoString {
	public static void main(String[] args) {
		String s = "Olá, Mundo";
		s = s.toUpperCase();
		System.out.println(s);
		
		System.out.println(s.equalsIgnoreCase("bom dia"));
		System.out.println(s.getClass().getSimpleName());
		
		var nome = "José";
		var sobrenome = "Alvarez";
		var idade = 19;
		var salario = 12.392F;
		String frase = String.format("%nO senhor %s %s tem R$ %.3f%n", nome,sobrenome,salario);
		System.out.printf(frase);
		
		System.out.println("Frase aqui".contains("aqui"));
	}
}