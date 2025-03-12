package controle;

public class For1 {
public static void main(String[] args) {
	

	for(int contador2 =0;contador2<=20;contador2+=2) {
		System.out.printf("i = %d\n", contador2);
	}
	int x =2;
	for(;x<10;) {
		System.out.println("x = "+x);
		x++;
	}
	
	// Laço infinito!!!
	for(;;) { // true
		System.out.println("Fim!");
	}
}
}
