package view;

import data.DataConta;
import viewModel.OperacoesConta;

import java.util.Scanner;

public class Principal {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        movimentaConta();
    }

    public static void movimentaConta() {
        String entrada = "";
        int valorMenu = 0;

        while (valorMenu != 6) {

            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Saldo");
            System.out.println("3 - Saque");
            System.out.println("4 - Depósito");
            System.out.println("5 - Transferência");
            System.out.println("6 - Sair");
            entrada = ler.next();

            try {
                valorMenu = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                continue;
            }

            switch (valorMenu) {
                case 1:
                    OperacoesConta.cadastrar();
                    break;
                case 2:
                    OperacoesConta.consultarSaldo();
                    break;
                case 3:
                    OperacoesConta.realizarSaque();
                    break;
                case 4:
                    OperacoesConta.realizarDeposito();
                    break;
                case 5:
                    OperacoesConta.realizarTransferencia();
                    break;
                case 6:{
                    System.out.println("Programa Encerrado ");
                    System.exit(0);
                }
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("\n>>>>>> Quantidade de contas " + DataConta.quantidadeContas());
        }
    }
}

