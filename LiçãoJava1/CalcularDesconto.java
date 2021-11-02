import java.util.Scanner;
public class CalcularDesconto {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double pP, desconto, vD,  nV;
		
		System.out.println("Digite o valor do produto ");
		pP = in.nextDouble();
		
		System.out.println("Digite a porcentagem do desconto ");
		desconto = in.nextDouble();
		
		vD = pP/100*desconto;
		
		nV = pP-vD;
		
		System.out.println("O valor do produto com a aplica��o do desconto � de "+nV+" reais");
	}

}
