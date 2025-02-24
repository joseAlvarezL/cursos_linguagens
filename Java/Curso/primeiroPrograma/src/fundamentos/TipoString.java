package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2)); // retorna index do caractere

		
		String s = "Boa tarde";
		s = s.toUpperCase(); 
		s = "Bom dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Bom")); // verifica se uma String começa com um texto específico
		System.out.println(s.toLowerCase()// converte todos os caracteres de uma String para letras minúsculas, retornando uma nova String.
				.startsWith("bom"));
		System.out.println(s.length());
		System.out.println(s.endsWith("dia"));
		System.out.println(s.toUpperCase()// Java converte todos os caracteres de uma String para letras maiúsculas, retornando uma nova String.
				.endsWith("DIA"));
		System.out.println(s.equals("bom dia")); // compara duas Strings para ver se têm o mesmo conteúdo, sendo sensível a maiúsculas/minúsculas.
		System.out.println(s.equalsIgnoreCase("bom dia")); // faz o mesmo, mas ignora diferenças de caso.
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.4F;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",
				nome,sobrenome,idade,salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.",
				nome,sobrenome,idade,salario);
		System.out.println(frase);
		
		System.out.println("Frase aqui".contains("aqui"));
		System.out.println("Frase aqui".indexOf("aqui"));
		System.out.println("Frase aqui".substring(6));
		System.out.println("Frase aqui".substring(6,9));
		}
}
