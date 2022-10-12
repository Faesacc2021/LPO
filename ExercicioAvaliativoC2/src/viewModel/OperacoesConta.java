package viewModel;

import data.DataConta;
import model.Conta;
import model.ContaEspecial;
import util.ContaStrings;
import java.text.NumberFormat;
import java.util.Scanner;

public class OperacoesConta {

    static Scanner ler = new Scanner(System.in);

    public static void cadastrar() {

        int numero;
        double limite;
        String nome;
        String cpf;
        String especial;

        System.out.println(ContaStrings.CONTA_NUMERO);
        numero = ler.nextInt();
        ler.nextLine();

        if (DataConta.consultaData(numero) != -1) {
            System.out.println(ContaStrings.CONTA_EXISTENTE);
            return;
        }

        System.out.println(ContaStrings.CONTA_NOME);
        nome = ler.nextLine();

        System.out.println(ContaStrings.CONTA_CPF);
        cpf = ler.nextLine();

        System.out.println(ContaStrings.CONTA_ESPECIAL);
        especial = ler.nextLine();

        if (especial.equals("S") || especial.equals("s")) {
            System.out.println(ContaStrings.CONTA_LIMITE);
            limite = ler.nextDouble();
            DataConta.incluiData(new ContaEspecial(numero, nome, cpf, limite));
        } else {
            DataConta.incluiData(new Conta(numero, nome, cpf));
        }
        System.out.println(ContaStrings.CONTA_CADASTRADA);
    }

    public static void consultarSaldo() {
        int arrayPosition = pedeContaAndChecaNoData();
        if (arrayPosition == -1) {
            return;
        }
        Conta conta = DataConta.getContasArray().get(arrayPosition);
        System.out.println(ContaStrings.CONTA_SALDO + conta.getNome() + " " + moedaMask(DataConta.saldoData(arrayPosition)) + "\n");
    }

    private static String moedaMask (Double valor) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(valor);
    }

    public static void realizarSaque() {
        int arrayPosition = pedeContaAndChecaNoData();
        if (arrayPosition == -1) {
            return;
        }
        System.out.println(ContaStrings.CONTA_VALOR_SAQUE);
        double valorSaque = ler.nextDouble();

        if (DataConta.saqueData(arrayPosition, valorSaque)) {
            System.out.println(ContaStrings.SAQUE_REALIZADO);
        } else {
           System.out.println(ContaStrings.SALDO_INSUFICIENTE);
        }
   }

    public static void realizarDeposito() {
        int arrayPosition = pedeContaAndChecaNoData();
        if (arrayPosition == -1) {
            return;
        }
        System.out.println(ContaStrings.CONTA_DEPOSITO);
        double valorSaque = ler.nextDouble();

        DataConta.depositoData(arrayPosition, valorSaque);
        System.out.println(ContaStrings.DEPOSITO_REALIZADO);
    }

    public static void realizarTransferencia() {

    }

    public static void imprimeContas() {
        String isSpecial = "Sim";
        for (Conta conta : DataConta.getContasArray()) {
            if (conta.getClass() == ContaEspecial.class) {
                isSpecial = "Sim - ";
                System.out.println(ContaStrings.CONTA_SALDO
                        + conta.getNome()
                        + " - É Conta Especial? "
                        + isSpecial
                        + moedaMask(conta.saldo())
                        + "  Limite especial somado ao Saldo : "
                        + moedaMask(((ContaEspecial) conta).getLimite()));
            }else {
                isSpecial = "Não - ";
                System.out.println(ContaStrings.CONTA_SALDO
                        + conta.getNome()
                        + " Conta Especial: "
                        + isSpecial
                        + moedaMask(conta.saldo()));
            }
        }
    }

    private static int pedeContaAndChecaNoData() {
        System.out.println(ContaStrings.CONTA_NUMERO);
        int numeroConta = ler.nextInt();

        int arrayPosition = DataConta.consultaData(numeroConta);
        if (arrayPosition == -1) {
            System.out.println(ContaStrings.CONTA_INEXISTENTE);
        }
        return arrayPosition;
    }
}