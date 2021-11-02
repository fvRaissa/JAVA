import java.util.Scanner;
public class CalcularMedia {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		double nota1, nota2, nota3, nota4, somaNotas, media;
		
		System.out.println("Digite a sua primeira nota:");
		nota1 = in.nextDouble();
		System.out.println("Digite a sua segunda nota:");
		nota2 = in.nextDouble();
		System.out.println("Digite a sua terceira nota:");
		nota3 = in.nextDouble();
		System.out.println("Digite a sua quarta nota:");
		nota4 = in.nextDouble();
		
		somaNotas = nota1+nota2+nota3+nota4;
		media = somaNotas/4;
		
		System.out.println("A sua m�dia aritm�tica � "+media);
	
	}
}
