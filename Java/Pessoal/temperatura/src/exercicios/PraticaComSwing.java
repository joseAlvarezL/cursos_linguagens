package exercicios;

import javax.swing.JOptionPane;

public class PraticaComSwing {
	public static void main(String[] args) {
		double soma = 0;
		for(int i= 1;i<=5;i++) {
			String valor1 = JOptionPane.showInputDialog("Digite seu "+i+" Salário: ");
			soma += Double.parseDouble(valor1.replace(",", "."));
		}
		double media = soma/3;
		String resultado = String.format("%.2f", media);
		JOptionPane.showMessageDialog(null, "Média dos salários: "+resultado);
	}
}
