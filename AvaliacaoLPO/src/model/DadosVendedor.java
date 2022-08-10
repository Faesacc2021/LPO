package model;
import business.RegrasVendedor;
import util.Constants;

import java.util.Scanner;

public class DadosVendedor {

    static Scanner ler = new Scanner(System.in);

    public static void incluirVendedor() {

        ler = new Scanner(System.in);

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
        ler = new Scanner(System.in);
        String nomeVendedor = "";
        boolean found = false;
        System.out.println("Digite o nome do Vendedor: ");
        nomeVendedor = ler.nextLine();

        for (int indice = 0; indice < (Constants.TAMANHO_VETOR - 1); indice++){
            if (VetVendedor.vetVendedor[indice].getNome().equals(nomeVendedor)) {
                System.out.println(VetVendedor.vetVendedor[indice].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vendedor não encontrado");
        }
    }

    public static void excluiVendedor() {

    }

    public static void totalVendas() {

    }

    public static void mediaVendas() {

    }

}
