package praticando;
import javax.swing.*;
public class Laboratiorio1 {
	public static void main(String[] args) {
		
	
		JFrame frame = new JFrame("Título da Janela"); // Cria uma janela
		frame.setSize(600, 400); // Tamanho em pixels (largura, altura)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao clicar no X
		frame.setVisible(true); // Torna a janela visível
//		
//		JLabel label = new JLabel("Galo Sniper"); // Cria um rótulo
//		frame.add(label); // Adiciona ao JFrame
		
		JButton button = new JButton("Clique aqui mano"); // Cria um botão
		frame.add(button); // Adiciona ao JFrame
	}
}
