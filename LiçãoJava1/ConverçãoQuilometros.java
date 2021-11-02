import java.util.Scanner;
public class ConverçãoQuilometros {
	
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double m, q;
		 
		System.out.println("Digite a quantidade de metros: ");
		m = in.nextDouble();
		
		q = m/1000;
		
		System.out.println("O valor em quilomentros é "+q);
				
	}

}
