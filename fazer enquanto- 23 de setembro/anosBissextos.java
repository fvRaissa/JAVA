import java.util.Scanner; 
public class anosBissextos {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int anoI=0, anoF, anoB=0;
		
		System.out.println("Digite o ano inicial");
		anoI = in.nextInt();
		System.out.println("Digite o ano final");
		anoF = in.nextInt();
		
		do {
			if((anoI % 4 == 0) && (anoI % 100 != 0) || (anoI % 400 == 0)) {
				System.out.println("O ano " + anoI+ " � bissexto");
				
				anoB = anoB+1;
			}else {
				System.out.println("O ano " + anoI+" n�o � bissexto");
				
			}
			anoI++;
		}while (anoI<=anoF);
		System.out.println("A quantidade de anos bissextos s�o: "+anoB);
		in.close();
	}

}
