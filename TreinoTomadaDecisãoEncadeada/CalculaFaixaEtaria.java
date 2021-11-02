import java.util.Scanner;
public class CalculaFaixaEtaria {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int aN, aT, iU;
		
		System.out.println("Digite o ano de nascimento:");
		aN = in.nextInt();
		System.out.println("Digite o ano atual:");
		aT = in.nextInt();
		
		iU = aT - aN;
		
		if ( iU < 10) {
			System.out.println("Sua idade é "+iU+", Criança");
		} else if ( iU >= 10 && iU < 18) {
			System.out.println("Sua idade é "+iU+", Adolescente");
		} else if ( iU >=18 && iU< 60) {
			System.out.println("Sua idade é "+iU+", Adulto");
		} else {
			System.out.println("Sua idade é "+iU+", Idoso");
		}
		in.close();
	} 

}

