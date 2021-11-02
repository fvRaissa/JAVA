import java.util.Scanner;
public class IdadesPorcentagem {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int id, i1=0, i2=0, i3=0, i4=0, i5=0,por1,por2,por3,por4,por5;
		
		for (int i=0; i<=15; i++) {
			System.out.println("Digite a idade");
			id = in.nextInt();
			
			if (id <=15) {
				i1 = i1+1;
			}else if ( id >= 16 && id <=30) {
				i2 = i2+1;
			}else if ( id >=31 && id <= 45) {
				i3 = i3+1;
			}else if ( id >=46 & id <= 60) {
				i4 = i4+1;
			}else {
				i5 = i5+1;
			}
			
		}
		por1 = i1*100/15;
		por2= i2*100/15;
		por3= i3*100/15;
		por4= i4*100/15;
		por5= i5*100/15;
		System.out.println("1� faixa etaria tem "+i1+" pessoas, ou seja, "+por1+"%");
		System.out.println("2� faixa etaria tem "+i2+" pessoas, ou seja, "+por2+"%");
		System.out.println("3� faixa etaria tem "+i3+" pessoas, ou seja, "+por3+"%");
		System.out.println("4� faixa etaria tem "+i4+" pessoas, ou seja, "+por4+"%");
		System.out.println("5� faixa etaria tem "+i5+" pessoas, ou seja, "+por5+"%");
	}
}
