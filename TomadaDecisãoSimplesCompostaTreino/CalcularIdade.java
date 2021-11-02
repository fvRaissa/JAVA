import java.util.Scanner;
public class CalcularIdade {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int an, ae, id;
		
		System.out.println("Digite o seu ano de nascimento:");
		an = in.nextInt();
		System.out.println("DIgite o ano eleitoral:");
		ae = in.nextInt();
		
		id = ae-an;
		
		if (id>=16) {
			System.out.println("Pode votar.");
		}else {
			System.out.println("N�o pode votar.");
		}
		in.close();
	}

}

