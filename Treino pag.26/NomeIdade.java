import java.util.Scanner;
public class NomeIdade {
	public static void main(String args []) {
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		System.out.println("Digite o seu nome:");
		nome = ler.next();
		System.out.println("Digite sua idade:");
		idade = ler.nextInt();
		System.out.println(nome+", vc tem "+idade+" anos.");
		
	}	

}

