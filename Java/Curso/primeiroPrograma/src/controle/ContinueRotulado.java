package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					System.out.println("break");
					continue externo; // vai fazer com que o loop externo pule diretamente para a próxima iteração, sem continuar o loop interno.
				}

				System.out.printf("[%d] < Esquerda [%d] <Direita\n", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");

	}
}
