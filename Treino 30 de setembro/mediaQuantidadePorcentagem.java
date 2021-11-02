import java.util.Scanner;
public class mediaQuantidadePorcentagem {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int i=0, quant, positivos=0, negativos=0;
		double n,soma, media, porP, porN;
		
		System.out.println("Digite a quantidade de numeros:");
		quant = in.nextInt();
		
		System.out.println("Digite o numero:");
		n = in.nextDouble();
		if(n > 0) {
			positivos++;
		}else {
			negativos++;
		}
		soma = n;
		quant= quant-1;
		
		while(i< quant) {
			System.out.println("Digite o numero:");
			n = in.nextDouble();
			soma = soma+n;
			if(n > 0) {
				positivos++;
			}else {
				negativos++;
			}
			i++;

		}
		media = soma/quant;
		porP = positivos/100*quant;
		porN = negativos/100*quant;
		
		System.out.println("Média aritmética dos numeros lidos=" +media);
		System.out.println("Quantidade de valores positivos=" +positivos);
		System.out.println("Quantidade de valores negativos= "+negativos);
		System.out.println("Porcentagem de valores positivos= "+porP);
		System.out.println("Porcentagem de valores negativos= "+porN);
	}

}
