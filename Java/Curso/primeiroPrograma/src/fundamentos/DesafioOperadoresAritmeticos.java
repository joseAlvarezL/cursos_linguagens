package fundamentos;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {
		double valor1Cima = ((1 - 5) * (2 - 7)) / 2;
		double valor1Potencia = Math.pow(valor1Cima, 2);
		
		double valor2Cima = 6 * (3 + 2);
		double valor2Potencia = Math.pow(valor2Cima, 2);
		double valor2Abaixo = (3 * 2);
		double valor2Resultado = valor2Potencia/valor2Abaixo;
		
		
		double subtracao = valor2Resultado-valor1Potencia;
		double cimaPotencia = Math.pow(subtracao, 3);
		
		double divisao = Math.pow(10,3);
	
		double resultadoFinal = cimaPotencia/divisao;
		System.out.println(resultadoFinal);
		
		
		

	}
}
