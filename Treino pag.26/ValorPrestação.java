import java.util.Scanner;
public class ValorPrestação {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double valor, taxa, tempo, prestacao;
		
		System.out.println("Digite o valor da prestação: ");
		valor = in.nextDouble();
		System.out.println("Digite a taxa de juros por dia: ");
		taxa = in.nextDouble();
		System.out.println("Digite a quantidade de dias que a pretação esta atrasada:");
		tempo = in.nextDouble();
		
		prestacao = valor+(valor*(taxa/100*tempo));
		
		System.out.println("O valor da prestação em atraso é: "+prestacao);
		
	}

}

