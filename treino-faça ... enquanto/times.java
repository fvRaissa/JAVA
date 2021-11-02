import java.util.Scanner;
public class times {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, por1=0, por2=0, por3=0, por4=0, por5=0, r;
		
		System.out.println("S�o Paulo-1,Corinthians-2,Palmeiras-3,Santos-4,Outros-5");
		
		
		do {
			System.out.println("Utilizando os numeros, diga par aqual time voc� torce:");
			r = in.nextInt();
			if (r == 1) {
				por1= por1+10;
			}else if (r == 2) {
				por2 = por2+10;
			}else if (r == 3) {
				por3 = por3+10;
			}else if ( r== 4) {
				por4 = por4+10;
			} else {
				por5 = por5+10;
			}
			i++;
			
		}while (i <= 10);
		System.out.println("TORCEDORES:");
		System.out.println("S�o Paulo: "+por1+"%");
		System.out.println("Corinthians: "+por2+"%");
		System.out.println("Palmeiras: "+por3+"%");
		System.out.println("Santos: "+por4+"%");
		System.out.println("Outros: "+por5+"%");
		in.close();
	}

}
