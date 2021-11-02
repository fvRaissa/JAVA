import java.util.Scanner;
public class CalculaNota {
	public static void main ( String args[]) {
		Scanner in = new Scanner (System.in);
		double n1, n2, total, media, exame, mN;
		
		System.out.println("Digite a pirmeira nota:");
		n1 = in.nextDouble();
		System.out.println("Digite a segunda nota:");
		n2 = in.nextDouble();
		
		total = n1 + n2;
		media = total / 2;
		
		if ( media < 3) {
			System.out.println("Reprovado.");
		} else if ( media >= 6) {
			System.out.println("Aprovado.");
		}else{
			System.out.println("Está em exame.");
			System.out.println("Digite a nota do exame:");
			exame = in.nextDouble();
		
			mN = media + exame / 2;
			  if( mN >= 6) {
				  System.out.println("Aprovado");
			  } else { 
				  System.out.println("Reprovado");
			  }
			  	  in.close();
		}
	}
}

