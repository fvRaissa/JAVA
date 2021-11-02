import java.util.Scanner;
public class baseExpoente {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base, ex, i=0, pot=1;
		
		System.out.println("Escreva a base do numero:");
		base = in.nextInt();
		System.out.println("Escreva o expoente do numero:");
		ex = in.nextInt();
		
		do {
			pot= pot*base;
			i++;
		} while ( i < ex);
		System.out.println("A potencia do numero �:"+pot);
		in.close();

	}

}
