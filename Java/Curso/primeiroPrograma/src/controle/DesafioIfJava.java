package controle;

public class DesafioIfJava {
	public static void main(String[] args) {

		double nota = 1.3;

		/* O ; após o if é interpretado como uma instrução vazia, equivalente a if
		 (condição) {}.*/
		/* O bloco {} seguinte vira um escopo independente, executado
		incondicionalmente.*/
		// não usar ; em estrutura de controle (tem uma exceção)
		if (nota >= 9.0)
			;
		{
			System.out.println("Quadro de honra!");
			System.out.println("Vocé é fera!!!");
		}
	}
}
