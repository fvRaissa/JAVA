import java.util.Scanner;
public class CalcularImc {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double peso, altura, imc;
		
		System.out.println("Digite o seu peso:");
		peso = ler.nextDouble();
		System.out.println("Digite a sua altura:");
		altura = ler.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("Seu IMC é "+imc);
		
		if (imc < 18.5) {
			System.out.println("Exesso de magreza.");
		} else if (imc < 25) {
			System.out.println("Peso normal.");
			} else if (imc < 30) {
				System.out.println("Exesso de peso.");
				} else if (imc < 35) {
					System.out.println("Obesidade (Grau I).");
					} else if (imc < 40) {
						System.out.println("Obseidade (Grau II).");
						} else {
							System.out.println("Obesidade (Grau III).");
						}
		ler.close();
	}
}

