import java.util.Scanner;
public class ValorArea {
	public static void main (String[] args) {
	Scanner in = new Scanner (System.in);
	double b, h, a;
	
	System.out.println("Digite o valor da base: ");
	b = in.nextDouble();
	System.out.println("Digite o valor da altura: ");
	h = in.nextDouble();
	
	a = b*h;
	
	System.out.println("O valor da área é "+a);
	
	}
}
