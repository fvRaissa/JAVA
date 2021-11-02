import java.util.Scanner;
public class intervaloNumerico {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int inter=0;
		double n;
		
		do {
			System.out.println("Digite o numero");
			n = in.nextDouble();
			
			if (n>=0 && n<=25) {
				inter++;
			} else if (n>=26 && n<=50) {
				inter++;
			}else if (n>=51 && n<=75) {
				inter++;
			}else if (n>=75 && n<=100) {
				inter++;
			}else {
				inter=inter;
			}
		}while(n>=0);
		System.out.println("Programa encerrado.");
		System.out.println("A quantidade de numeros dentro dos intervalos � de "+inter);

	}

}
