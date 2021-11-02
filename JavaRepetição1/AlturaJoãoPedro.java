import java.util.Scanner;
public class AlturaJo�oPedro {
	public static void main(String args[]) {
		int i=0; 
		double aJ, aP;
		aJ = 1.34;
		aP = 1.45;
		while (aJ<=aP) {
			aJ = aJ+0.025;
			aP = aP+0.02;
			
			
			i++;
		}
		System.out.println("Demorou "+i+" anos para Jo�o ficar mais alto que pedro.");
	}
}
