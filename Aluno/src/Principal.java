import java.util.Scanner;


public class Principal {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuAluno();
	}


	public static void menuAluno() {

		Aluno alunoUm = new Aluno(); 

		Aluno alunoDois = new Aluno(); 
		
		alunoUm = DadosAluno.manipulaAluno(alunoUm);
		alunoDois = DadosAluno.manipulaAluno(alunoDois); 
		
		System.out.println(alunoUm.toString());
		System.out.println(alunoDois.toString());
		
		int result = alunoUm.getNome().compareTo(alunoDois.getNome());
		if (result == 0){
			System.out.println("Alunos São Iguais");
		}else {
			System.out.println("Alunos São Diferentes");
		}
		
		DadosAluno.manipulaAluno(alunoUm);
		DadosAluno.manipulaAluno(alunoDois);
		
		int compare = alunoUm.getNome().compareTo(alunoDois.getNome());

		if (compare < 0) {  
			System.out.println(alunoUm.toString());
			System.out.println(alunoDois.toString());
		}
		else if (compare >= 0) {
			System.out.println(alunoDois.toString());
			System.out.println(alunoUm.toString());
		}
	}
}
