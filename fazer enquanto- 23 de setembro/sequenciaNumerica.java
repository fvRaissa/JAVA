import java.util.Scanner;
public class sequenciaNumerica {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0,vezes,n, m=0;
		do {
			i=0;
			System.out.println("Digite a quatidade de vezes");
			vezes = in.nextInt();
		
			if( vezes == 0) {
				System.out.println("Fim do programa");
			}else {
					do {
						System.out.println("Digite o numero");
						n = in.nextInt();
						
						if ( n > m) {
							m = n;
						}else { 
							m = m;
						}
						i++;
					}while  ( i < vezes );
					System.out.println("O numero maior é "+m);
			}
		}while (vezes != 0);
		in.close();
	}
}

