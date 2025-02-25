package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());//conversao 1

		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());//conversao 2
		
		System.out.println((""+num1).length());//conversao 3 (""+num1)
		System.out.println((""+num2).length());
	}
}
