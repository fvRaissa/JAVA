import java.util.Scanner;
public class ClassificaTriangulo {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		double a, b, c;
		
		System.out.println("Digite o valor primiero lado do triangulo:");
		a = in.nextDouble();
		System.out.println("Digite o valor do segundo lado do triangulo:");
		b = in.nextDouble();
		System.out.println("Digite o valor do terceiro lado do triangulo:");
		c = in.nextDouble();
			
		if ( a > b + c || b > a + c ||  c > a + b) { 
			System.out.println("Não é triangulo.");  
		} else if ( a == b && b == c) {
			System.out.println("O triangulo é eqüilátero.");
		} else if ( a != b && b != c && a != c) {
			System.out.println("O triangulo é escaleno");
		} else {
			System.out.println("O triangulo é Isósceles");
		}
		in.close();
	
	}

}

