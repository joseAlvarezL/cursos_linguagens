package fundamentos;
/* A notação ponto em Java (ex.: objeto.metodo()) é usada
 * para acessar membros(métodos ou atributos) de um
 * objeto ou classe.*/
public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("????");
		System.out.println(y);
		
		/* Tipos primitivos não tem o operador ponto "."
		 * 
		 * Tipos primitivos (int, float, etc.) não têm
		 * notação ponto porque não são objetos, mas
		 * sim valores simples sem métodos ou atributos
		 * associados.
		 * 
		 * // Exemplo: int x = 5; // não tem x.algumaCoisa()
		 */
	}
}
