package fundamentos;

import java.util.Date;

//import java.util.Date;

/* import em Java é usado para trazer
 * classes ou pacotes de outras partes do código ou
 * bibliotecas para o seu arquivo, evitando escrever
 * o caminho completo.*/


public class Import {
	public static void main(String[] args) {
		/*
		 * `java.lang` é um pacote padrão do Java que contém classes fundamentais como
		 * `String`, `Math` e `System`. O "caminho completo" de `String` é
		 * `java.lang.String`. Não precisa usar `java.lang` explicitamente porque ele é
		 * importado automaticamente pelo compilador em todos os programas Java.
		 * Exemplo: String texto = "Oi"; // funciona sem import java.lang.String
		 */

		java.lang.String b = "Boa tarde";
		java.lang.System.out.println(b);

		String s = "bom dia";
		System.out.println(s);

		Date d = new Date();
		System.out.println(d);

//		JButton botao = new Jbutton();

	}
}
