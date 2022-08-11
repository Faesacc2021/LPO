import java.util.Scanner;

public class DadosAluno {

    static Scanner ler = new Scanner(System.in);
	
	public static Aluno manipulaAluno(Aluno aluno) {

		ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do Aluno: ");
		aluno.setNome(ler.nextLine());

		System.out.println("Digite a matricula: ");
		aluno.setMatricula(ler.nextInt());

		System.out.println("Digite a nota um: ");
		aluno.setNotaUm(ler.nextDouble());
		
		System.out.println("Digite a nota dois: ");
		aluno.setNotaUm(ler.nextDouble());
		
		aluno.setMedia((aluno.getNotaUm()+ aluno.getNotaDois())/2 );
		
		return aluno;
	}
	
	public static void consultaAluno() {

		Aluno aluno = new Aluno();

		System.out.println("Digite o nome do Aluno: ");
		aluno.setNome(ler.nextLine());

	}
}

