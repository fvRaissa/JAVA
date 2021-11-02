import java.util.Scanner;
public class paresImpares {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, p=0, i=0, somaP=0,  mediaP, vezes=0;
		double somaG=0, mediaG;
		do {
			System.out.println("Digite um numero");
			n = in.nextInt();
			
			if( n%2==0) {
				p++;
				somaP = somaP+n;
				somaG = somaG+n;
			}else {
				i++;
				somaG = somaG+n;
			}
			
			vezes++;
			
		}while(n>0);
		mediaP = somaP/p;
		mediaG= somaG/vezes;
		
		System.out.println("Tem "+p+" numeros pares e "+i+" numeros impares");
		System.out.println("A media dos numeros pares é de "+mediaP+" e a media geral dos numeros é de "+mediaG);

	}

}
