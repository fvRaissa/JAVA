import java.util.Scanner;
public class CalcularSalario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valorH, aulas, inss, vT,valorInss, sL;
		
		System.out.println("Digite o valor da hora aula:");
		valorH = in.nextDouble();
		System.out.println("Digite o n�mero de aulas dadas no m�s:");
		aulas = in.nextDouble();
		System.out.println("Digite o percentual de desconto do INSS:");
		inss = in.nextDouble();
		
		vT = aulas*valorH;
		valorInss =vT/100*inss;
		sL = vT-valorInss;
		
		
		System.out.println("O valor do salario liquido �: "+sL);
	}

}
