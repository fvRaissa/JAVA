import java.util.Scanner;
public class salarioProf {
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);
		double vA, nA,sL, Aliq, SalFinal, AliqFinal;
		
		System.out.println("Valor das aulas:");
		vA = in.nextDouble();
		
		System.out.println("Numero de aulas no mês:");
		nA = in.nextDouble();
		
		sL = nA * vA;
		System.out.println("Salario liquido:"+sL);
		
		System.out.println("Insira a sua porcentagem da Alíquota: ");
		Aliq = in.nextDouble();
		
		AliqFinal = sL/100 * Aliq;
		SalFinal = sL - AliqFinal;
		
		System.out.println("Salario Final: "+SalFinal);	
		
	}

}
