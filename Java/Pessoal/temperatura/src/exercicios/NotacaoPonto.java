package exercicios;

class PessoaMan{
	String nome1 = "Paulo";  // Atributo
}
public class NotacaoPonto{
	public static void main(String[] args) {
		//Acessando Métodos de um Objeto
		String texto = "Olá, mundo!!!";
		int tamanho = texto.length(); // O método length() retorna o tamanho da string
		System.out.println(tamanho); 
		
		//Acessando Atributos
		PessoaMan p = new PessoaMan();
		System.out.println(p.nome1); // Acessa o atributo nome com notação ponto
		
		//Métodos Encadeados
		String frase1;
		String frase = "Java é Legal";
		frase1 = frase.toUpperCase();
		System.out.println(frase1);
		String frase2 = " Java é Poggers" ;
		String resultado = frase2.trim(); // É usado para remover os espaços em branco iniciais e finais de uma String
		System.out.println(resultado);
		String frase3 = "Java é Foda man";
		String resultado1 = frase3.toUpperCase(); // Converte para maiúsculas
		System.out.println(resultado1);
		
		//Classes Estáticas
		double raizQuadrada = Math.sqrt(144);
		System.out.println(raizQuadrada);
		
		
		String s = "Bom dia";
		s = s.replace("dia", "Galo Sniper"); // Ele retorna uma nova string com as substituições feitas.
		s = s.concat("!!!"); // Concatena (junta) duas strings.
		System.out.println(s);
		String s1 = "Bom dia";
		System.out.println(s1.replace("Bom", "Fds?"));
	}
}