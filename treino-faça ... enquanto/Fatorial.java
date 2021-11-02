import java.util.Scanner; 
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, i=1, f=1;
		
		System.out.println("Digite um numero");
		n = in.nextInt();
		
		do {
			f = f*i;
			i++;
		}while (i<=n);
			
		System.out.println(f);
		
		in.close();
		

	}

}
