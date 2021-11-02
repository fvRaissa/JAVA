import java.util.Scanner;
public class calculaCombustivel {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double dis, cap, gM;
		
		System.out.println("Digite a distancia percorrida em Km:");
		dis = in.nextDouble();
		System.out.println("Digite o valor da capacidade do tanque:");
		cap = in.nextDouble();
		
		gM = dis / cap;
		
		if ( gM >= 10) {
			System.out.println("Economico.");
		}else {
			System.out.println("N�o economico.");
		}
		in.close();
	}

}

