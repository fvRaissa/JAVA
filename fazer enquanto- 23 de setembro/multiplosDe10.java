import java.util.Scanner;
public class multiplosDe10 {
	public static void main (String args[]) {
		int i=0;
		do {
			if(i% 10 ==0) {
				System.out.println(i+ " é multiplo de 10");
			}else {
				System.out.println(i);
			}
			i= i+1;
		} while (i<301);
	}

}
