package fundamentos.operadores;

public class Ternario {
public static void main(String[] args) {
	
	double media = 3.6;
	String resultadoParcial = media>=5.0?"Recuperação":"Reprovado";
	String resultadoFinal = media>=7.0?"Aprovado":resultadoParcial;
	System.out.println(resultadoFinal);
	
	double nota = 7.3;
	boolean bomComportamento = false;
	boolean passoPorMedia = nota >=7;
	boolean temDesconto = bomComportamento && passoPorMedia;
	String resultado = temDesconto ? "Sim":"Não"; 
	System.out.println("Tem desconto? "+ resultado);
}
}
