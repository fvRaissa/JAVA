import java.util.Scanner;
public class ValorPresta��o {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double valor, taxa, tempo, prestacao;
		
		System.out.println("Digite o valor da presta��o: ");
		valor = in.nextDouble();
		System.out.println("Digite a taxa de juros por dia: ");
		taxa = in.nextDouble();
		System.out.println("Digite a quantidade de dias que a preta��o esta atrasada:");
		tempo = in.nextDouble();
		
		prestacao = valor+(valor*(taxa/100*tempo));
		
		System.out.println("O valor da presta��o em atraso �: "+prestacao);
		
	}

}

