import java.util.Scanner;
public class maiorMenorAltura {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		double al, maior, menor;
		
		System.out.println("Digite sua altura");
		al = in.nextDouble();
		maior = al;
		menor = al;
		
		while (i <= 14) {
			System.out.println("Digite sua altura");
			al = in.nextDouble();
			
			if (al > maior) {
				maior = al;
			} else if (al < menor) {
				menor = al;
			}
			
			i++;
		}
		System.out.println("A menor altura do grupo é "+menor);
		System.out.println("A maior altura do grupo é "+maior);

	}

}
