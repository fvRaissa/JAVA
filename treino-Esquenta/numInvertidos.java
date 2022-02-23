import java.util.Scanner;
public class NumInvertidos {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int num,n2;
		
		System.out.println("Digite um numero de 3 digitos");
		num = in.nextInt();
		
		n2 = num%100;
		
		
		num = Math.round(num/100);
		System.out.print(n2);
		System.out.print(num);

	}

}
