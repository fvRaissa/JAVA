import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1,p=1, a=0, v;
		
		System.out.println("Digite a quantidade de vezes");
		v = in.nextInt();
		
		do {
			p=p+a;
			a=p-a;
			i=i+1;
		}while (i<v);
		System.out.println(p);
		in.close();
	}
}
