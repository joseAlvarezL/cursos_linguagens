package praticando;

import javax.swing.*; // Inclui todas as classes do Swing

public class Laboratorio {
	public static void main(String[] args) {
		double valor1 = 0;
		for (int i = 1; i <= 5; i++) {
			String salarios = JOptionPane.showInputDialog("Digite o primeiro número: ");
			valor1 += Double.parseDouble(salarios.replace(",", "."));
		}
		double media = valor1/3;
		double mediaArrendendado = Math.round(media *100.0)/100.0;  // Multiplica por 100 (move o decimal 2 posições), arredonda, e divide por 100 para voltar, resultando em 2 casas decimais.
		JOptionPane.showMessageDialog(null, "Soma: "+mediaArrendendado);
	}
}
