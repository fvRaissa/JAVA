import java.util.Scanner;
public class ValorIPVA {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		double pV, valorIpva; 
		
		System.out.println("Digite o valor do veiculo: ");
		pV = in.nextDouble();
		
		valorIpva = pV/100*4;
		
		 System.out.println("O valor do IPVA é "+valorIpva);
			
	}

}
