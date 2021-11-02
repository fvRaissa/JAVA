import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double base, h, area;
		
		System.out.println("Digite o valor da base do triangulo:");
		base = ler.nextDouble(); //se for inteiro ler.nextInt();
		
		System.out.println("Digiteo valor da altura do triangulo");
		h = ler.nextDouble();
		
		area = (base*h)/2;
		
		System.out.println("O valor da area é "+area);
	}

}
