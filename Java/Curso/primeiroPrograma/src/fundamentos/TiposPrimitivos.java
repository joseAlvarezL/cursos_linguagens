package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		// Informações do funcionário
		
		// 8 Tipos de dados primitivos
		
		// 4 - Tipos numéricos inteiros - Básicos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		// 2 - Tipos númericos reias - Básicos
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// 1 - Tipo booleano
		boolean estaDeFerias = true; // false
		
		// 1 - Tipo Caracter
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos/2);
		
		// Pontos por real - cada 1 real = 1.08123 po
		System.out.println(pontosAcumulados/ vendasAcumuladas);
		
		System.out.println(id + ": ganha -> "+ salario);
		System.out.println("Férias? "+estaDeFerias);
		System.out.println("Status: "+status);
	}
}
