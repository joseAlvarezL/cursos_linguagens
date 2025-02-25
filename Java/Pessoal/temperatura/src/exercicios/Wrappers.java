package exercicios;

import javax.swing.JOptionPane;

public class Wrappers {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite 1 número: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite 2 número: ");
		
		System.out.println(valor2+valor1);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1+numero2;
		
		JOptionPane.showMessageDialog(null,
				"A soma dos valores é: "+soma);
		
	}
}
