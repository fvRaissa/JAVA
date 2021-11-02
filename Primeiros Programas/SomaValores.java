import java.util.Scanner;
public class SomaValores {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		
		int n1, n2, r;
		
		System.out.println("Digite o primeiro valor");
		n1 = in.nextInt();
		
		System.out.println("Digite o segundo valor");
		n2 = in.nextInt();
		
		r = n1+n2;
		
		System.out.println("O resultado da soma é "+r);
	}

}
