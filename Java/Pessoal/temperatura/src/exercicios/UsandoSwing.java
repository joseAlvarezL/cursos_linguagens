package exercicios;

import javax.swing.JOptionPane;

public class UsandoSwing {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite seu primeiro salário: ".replace(",", "."));
		String valor2 = JOptionPane.showInputDialog("Digite seu segundo salário: ".replace(",", "."));
		String valor3 = JOptionPane.showInputDialog("Digite seu teceiro salário: ".replace(",", "."));
		
		valor1 = valor1.replace(",", ".");
        valor2 = valor2.replace(",", ".");
        valor3 = valor3.replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1+salario2+salario3)/3;
		JOptionPane.showMessageDialog(null, "Média dos salários: " + media);
	}
}
