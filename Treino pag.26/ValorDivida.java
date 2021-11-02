import java.util.Scanner;
public class ValorDivida {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		double salario, div;
		
		System.out.println ("Digite o valor do salario");
		salario = in.nextDouble();
		
		div = salario/100*30;
		
		System.out.println("O valor de divida que você pode fazer é "+div);

	}

}

