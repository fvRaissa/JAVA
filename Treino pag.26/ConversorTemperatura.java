import java.util.Scanner;
public class ConversorTemperatura {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		double f, c;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		f = in.nextDouble();
		
		c = (f-32)*(5/9);
			
		System.out.println("A temperatura convertida em graus Celsius é de "+c+" graus");
	}

}
