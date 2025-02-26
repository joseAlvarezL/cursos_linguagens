package praticando;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Laboratorio1 {
	public static void main(String[] args) {
		// JFrame - Janela principal
		JFrame janela = new JFrame("Sistema de vendas");
		janela.setSize(700, 350);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		janela.setLayout(new BorderLayout());

		JLabel texto1 = new JLabel("Norte");
		JLabel texto2 = new JLabel("Centro (eu)");
		JLabel texto3 = new JLabel("Sul");
		JLabel texto4 = new JLabel("Leste");
		JLabel texto5 = new JLabel("Oeste");
		texto1.setForeground(Color.blue);
		texto1.setFont(new Font("Arial", Font.BOLD, 20));
		texto1.setHorizontalAlignment(JLabel.CENTER);
		texto2.setForeground(Color.red);
		texto2.setFont(new Font("Poppins", Font.ITALIC, 32));
		texto2.setHorizontalAlignment(JLabel.CENTER);
		texto3.setForeground(Color.gray);
		texto3.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 60));
		texto3.setHorizontalAlignment(JLabel.CENTER);
		texto4.setForeground(Color.CYAN);
		texto4.setFont(new Font("Georgia", Font.ITALIC, 30));
		texto4.setHorizontalAlignment(JLabel.CENTER);
		texto5.setForeground(Color.GREEN);
		texto5.setFont(new Font("Impact", Font.BOLD, 30));
		texto5.setHorizontalAlignment(JLabel.CENTER);

		janela.add(texto1, BorderLayout.NORTH);
		janela.add(texto3, BorderLayout.SOUTH);
		janela.add(texto4, BorderLayout.EAST);
		janela.add(texto5, BorderLayout.WEST);
		janela.add(texto2, BorderLayout.CENTER);
		janela.setVisible(true);

		System.out.println(janela);
	}
}