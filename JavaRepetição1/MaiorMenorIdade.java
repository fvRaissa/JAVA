import java.util.Scanner;
public class MaiorMenorIdade {
	public static void main(String args[]) {
		Scanner  in = new Scanner(System.in);
		int i=1,idade, maior=0, menor=0;
		while (i<=10) {
			System.out.println("Digite a idade do aluno "+i);
			idade = in.nextInt();
			
			if (idade<18) {
				menor++;
			}else {
				maior++;
			}
			i++;
		}
		System.out.println("Quantidade de alunos menor de idade:"+menor);
		System.out.println("Quantidade de alunos maiores de idade:"+maior);
		in.close();
	}

}
