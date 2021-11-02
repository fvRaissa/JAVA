import java.util.Scanner;
public class CalculaImposto {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double sal, taxa, parc, imposto;
		
		System.out.println("Digite o valor do salario:");
		sal = in.nextDouble();
		
		if (sal<1432.59) {
			taxa = 0;
			parc = 0;
		} else if (sal<=2150) {
			taxa = 7.5;
			parc = 107.59;
		} else if (sal <= 2866.7) {
			taxa = 15;
			parc = 268.84;
		} else if ( sal <= 3582){
			taxa = 22.5;
			parc = 483.84;
		} else {
			taxa = 27.5;
			parc = 662.84;
		}
		imposto = sal/100*taxa - parc;
		System.out.printf("O imposto devido � R$ %.2f",imposto );
	} 
}	

