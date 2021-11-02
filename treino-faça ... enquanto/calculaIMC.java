import java.util.Scanner;
public class calculaIMC {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1;
		double altura, peso, imc;
		
		do {
			System.out.println("Digite a sua altura em metros");
			altura = in.nextDouble();
			System.out.println("Digite o seu peso");
			peso = in.nextDouble();
			
			imc= peso/(altura*altura);
			System.out.println("Seu IMC � "+imc);
			System.out.println("Deseja continuar? (SIM=1/N�O=2)");
			i = in.nextInt();
			
		} while (i < 2);
		in.close();
		
	}

}
