import java.util.Scanner;
public class SomaVetores {
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);
        final int TAM = 3;
        int i = 0, j = 0, a[], b[], c[];
        
        a = new int [TAM];
        b = new int [TAM];
        c = new int [TAM];
        
        for(i=0; i<TAM; i++) {
        	System.out.println("Digite o "+(i+1)+"º número da sequencia 1: ");
        	a[i] = in.nextInt();
        }
        
        for(i=0; i<TAM; i++) {
        	System.out.println("Digite o "+(i+1)+"º número: da sequencia 2");
        	b[i] = in.nextInt();
        }
        
        
    	
    	for(j=0; j<TAM; j++) {
    		for(i=0; i<TAM; i++) {
    			c[i] = a[i] + b[i];
    		}
    	}
    	System.out.print("A somatoria dos numeros é igual a: ");
    	for(i=0; i<TAM; i++) {
    		System.out.print(c[i]+" ");
    	
    	}
    	
	}
}

