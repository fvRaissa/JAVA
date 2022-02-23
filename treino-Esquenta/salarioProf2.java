import java.util.Scanner;
public class salarioProf2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double vA, nA,sL, Aliq, SalFinal, AliqFinal;
		
		System.out.println("Valor das aulas:");
		vA = in.nextDouble();
		
		System.out.println("Numero de aulas no mês:");
		nA = in.nextDouble();
		
		sL = nA * vA;
		System.out.println("Salario liquido:"+sL);
		
		if (sL <= 1212.00) {
			Aliq = sL/100 * 7.5;
			SalFinal = sL - Aliq;
			System.out.println("Salario Final: "+SalFinal);
		}else if (sL == 1212.01 || sL<= 2427.35){
			Aliq = sL/100 * 9;
			SalFinal = sL - Aliq;
			System.out.println("Salario Final: "+SalFinal);
		}else if (sL == 2427.36 || sL<= 3641.03){
			Aliq = sL/100 * 12;
			SalFinal = sL - Aliq;
			System.out.println("Salario Final: "+SalFinal);
		}else if (sL == 3641.04 || sL<= 7087.22){
			Aliq = sL/100 * 14;
			SalFinal = sL - Aliq;
			System.out.println("Salario Final: "+SalFinal);
		}else if (sL == 7087.23 || sL<= 12136.79){
			Aliq = sL/100 * 14.5;
			SalFinal = sL - Aliq;
			System.out.println("Salario Final: "+SalFinal);
		}else if (sL == 12136.80 || sL<= 24273.57){
			Aliq = sL/100 * 16.5;
			SalFinal = sL - Aliq;
			System.out.println("Salario Final: "+SalFinal);
		}else if (sL == 24273.58 || sL<= 47333.46){
			Aliq = sL/100 * 19;
			SalFinal = sL - Aliq;
			System.out.println("Salario Final: "+SalFinal);
		}else {
			Aliq = sL/100 * 22;
			SalFinal = sL - Aliq;
			System.out.println("Salario Final: "+SalFinal);
		}
		

	}

}
