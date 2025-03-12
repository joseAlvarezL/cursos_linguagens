package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		
		// e como um nome ou rotulo
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++	) {
				if (i == 1) {
					System.out.println("break");
					break
					//break externo;
				}
				
				System.out.printf("[%d] < Esquerda [%d] <Direita\n" , i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
