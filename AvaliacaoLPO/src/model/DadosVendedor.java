package model;

import java.util.Scanner;

public class DadosVendedor {

    static Scanner ler = new Scanner(System.in);

    public static void incluirVendedor() {

        Vendedor vendedor = Vendedor.instanciaVendedor();

        System.out.println("Digite o nome do Vendedor: ");
        ler.nextLine();
        vendedor.setNome(ler.nextLine());

        System.out.println("Digite o tempo de servico em meses: ");
        int tempoServico = 0;
        tempoServico = ler.nextInt();
        Re
        RegrasVendedor.defineCategoria(vendedor, tempoServico);

        System.out.println("Digite o Nota 02: ");
        aluno.setNota02(ler.nextDouble());

        autoIncrement = autoIncrement + 1;
        aluno.setMatricula(autoIncrement);
        AlunosVet.incluirAlunos(aluno, autoIncrement);
    }

    public static void consultaVendedor() {

        System.out.println("por vafor informe a nota de corte: ");
        double nota = ler.nextDouble();

        Alunos.consultarAlunos(nota, autoIncrement);
    }

    public static void excluiVendedor() {
        Alunos.consultarMedia(autoIncrement);
    }

    public static void totalVendas() {
        Alunos.consultarMedia(autoIncrement);
    }

    public static void mediaVendas() {
        Alunos.consultarMedia(autoIncrement);
    }

}
