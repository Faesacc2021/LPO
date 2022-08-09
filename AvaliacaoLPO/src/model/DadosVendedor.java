package model;

import business.RegrasVendedor;

import java.util.Scanner;

public class DadosVendedor {

    static Scanner ler = new Scanner(System.in);

    public static void incluirVendedor() {

        int posicao = VetVendedor.getNovaPosicao();
        if (posicao == -1) {
            System.out.println("Não é possível cadastra vendedor, limite atingigo!");
        } else {
            Vendedor vendedor = Vendedor.instanciaVendedor();

            System.out.println("Digite o nome do Vendedor: ");
            vendedor.setNome(ler.nextLine());

            int tempoServico = 0;
            System.out.println("Digite o tempo de servico em meses: ");
            tempoServico = ler.nextInt();

            RegrasVendedor.defineCategoria(vendedor, tempoServico);
            VetVendedor.insereVendedorVetor(vendedor, posicao);
            System.out.println("Vendedor inserido com sucesso!");
        }
    }

    public static void consultaVendedor() {
        System.out.println("por vafor informe a nota de corte: ");
        double nota = ler.nextDouble();
    }

    public static void excluiVendedor() {

    }

    public static void totalVendas() {

    }

    public static void mediaVendas() {

    }

}
