import java.util.Scanner;
public class SequenciaUsuario {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int id, idadeMaior, idadeMenor;
		String nome, nomeMaior, nomeMenor;
		
		System.out.println("Digite o nome do primeiro usuario:");
		nome = in.next();
		System.out.println("Digite a idade do primeiro usuario:");
		id = in.nextInt(); 
		nomeMaior= nome;
		idadeMaior=id;
		nomeMenor=nome;
		idadeMenor=id;
		System.out.println("Digite o nome do segundo usuario:");
		nome = in.next();
		System.out.println("Digite a idade do segundo usuario:");
		id = in.nextInt();
		if (id>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		} else if (id<idadeMenor) {
			nomeMenor=nome;
			idadeMenor=id;
		}
		System.out.println("Digite o nome do terceiro usuario:");
		nome = in.next();
		System.out.println("Digite a idade do terceiro usuario:");
		id = in.nextInt();
		if (id>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		} else if (id<idadeMenor) {
			nomeMenor=nome;
			idadeMenor=id;
		}
		System.out.println("Digite o nome do quarto usuario:");
		nome = in.next();
		System.out.println("Digite a idade do quarto usuario:");
		id = in.nextInt();
		if (id>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		} else if (id<idadeMenor) {
			nomeMenor=nome;
			idadeMenor=id;
		}
		System.out.println("Digite o nome do quinto usuario:");
		nome = in.next();
		System.out.println("Digite a idade do quinto usuario:");
		id = in.nextInt();
		if (id>idadeMaior) {
			nomeMaior = nome;
			idadeMaior = id;
		} else if (id<idadeMenor) {
			nomeMenor=nome;
			idadeMenor=id;
		}
		System.out.println("A pessoa mais velha é "+nomeMaior+" com "+idadeMaior+" anos");
		System.out.println("A pessoa mais nova é "+nomeMenor+" com "+idadeMenor+" Anos");
	}

}

