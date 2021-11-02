import java.util.Scanner;
public class VerificarSalario {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		double salario;
		
		System.out.println("Digite o valor do salario:");
		salario = ler.nextDouble();
		
		if (salario>=1100) {
			System.out.println("suficiente");
		}else {
			System.out.println("insuficiente");
		}
		ler.close();
	}

}

