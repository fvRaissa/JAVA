import java.util.Scanner;
public class PrecoProduto {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		double pP,lucro,valorL,pV;
		String i = "";
		while (!i.equals("não")){
			
			System.out.println("Digite o valor do produto:");
			pP = in.nextDouble();
			
			System.out.println("Digite a porcentagem da margem lucro:");
			lucro = in.nextDouble();
			
			valorL = pP / 100 *lucro;
			pV = pP + valorL;
			
			System.out.println("O valor da venda foi R$"+pV);
			System.out.println("Deseja continuar?");
			i = in.next();	
		}
	}

}
