package fundamentos;

public class ConveraoTiposPrimitivosNumericos {
public static void main(String[] args) {
	double a =1.123483921793215; // suportou - implícita
	System.out.println(a);
	
	float b = (float)1.123483921793215; // nao suportou - explícita (CAST)
	System.out.println(b);
	
	int c =130;
	byte d = (byte)c; // explícita (CAST)
	System.out.println(d);
	
	double e = 1.999;
	int f = (int)e;
	System.out.println(f);
}
}
