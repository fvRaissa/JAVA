import java.util.Scanner;
public class SequenciaNumeros {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double a, b, c;
			
		System.out.println("Digite o primeiro numero:");
		a = in.nextDouble();
		System.out.println("Digite o segundo numero:");
		b = in.nextDouble();
		System.out.println("Digite o terceiro numero:");
		c = in.nextDouble();
		
		if (a < b && b<c) {
			System.out.println("A sequecnia é "+a+", "+b+", "+c);
		} else if ( b < c && c < a) {
			System.out.println("A sequecnia é "+b+", "+c+", "+a);
			} else if ( c < a && a< b) {
				System.out.println("A sequecnia é "+c+", "+a+", "+b);
				} else if ( c < b && b < a) {
					System.out.println("A sequecnia é "+c+", "+b+", "+a);
					} else if ( b < a && a < c) {
						System.out.println("A sequecnia é "+b+", "+a+", "+c);
						} else if ( a < c && c < b) {
							System.out.println("A sequecnia é "+a+", "+c+", "+b);
						}
		in.close();	
		
	}

}

