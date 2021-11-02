import java.util.Scanner;
public class NegativoPositivo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double num;
		
		System.out.println("Digite o numero:");
		num = in.nextDouble();
		
		if (num>=0) {
			System.out.println("O numero é positivo.");
		}else {
			System.out.println("O numero é negativo.");
		}
		in.close();
	} 
	

}

