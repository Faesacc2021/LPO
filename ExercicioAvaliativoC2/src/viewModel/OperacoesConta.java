package viewModel;

import data.DataConta;
import model.Conta;
import model.ContaEspecial;
import util.ContaStrings;

import java.util.Scanner;

public class OperacoesConta {

    static Scanner ler = new Scanner(System.in);

    public static void cadastrar() {

        int numero;
        String nome;
        String cpf;
        String especial;
        double limite;

        System.out.println(ContaStrings.CONTA_NUMERO);
        numero = ler.nextInt();
        ler.nextLine();

        if (DataConta.consulta(numero) != -1) {
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
            DataConta.inclui(new ContaEspecial(numero, nome, cpf, limite));
        } else {
            DataConta.inclui(new Conta(numero, nome, cpf));
        }
        System.out.println(ContaStrings.CONTA_CADASTRADA);
    }

    public static void consultarSaldo() {

        System.out.println(ContaStrings.CONTA_NUMERO);
        int numeroConta = ler.nextInt();

        int arrayPosition = DataConta.consulta(numeroConta);
        if (arrayPosition == -1) {
            System.out.println(ContaStrings.CONTA_EXISTENTE);
            return;
        }

        Conta conta = DataConta.contasArray.get(arrayPosition);
        System.out.println(ContaStrings.CONTA_SALDO + conta.getNome() + " " + DataConta.saldo(arrayPosition));
    }

    public static void realizarSaque() {

        System.out.println(ContaStrings.CONTA_NUMERO);
        int numeroConta = ler.nextInt();

        int arrayPosition = DataConta.consulta(numeroConta);
        if (arrayPosition == -1) {
            System.out.println(ContaStrings.CONTA_EXISTENTE);
            return;
        }

        System.out.println(ContaStrings.CONTA_SAQUE);
        double valorSaque = ler.nextDouble();

        if (DataConta.saque(arrayPosition, valorSaque)) {
            System.out.println(ContaStrings.SAQUE_REALIZADO);
        } else {
           System.out.println(ContaStrings.SALDO_INSUFICIENTE);
        }

    }

    public static void realizarDeposito() {
        System.out.println(ContaStrings.CONTA_NUMERO);
        int numeroConta = ler.nextInt();

        int arrayPosition = DataConta.consulta(numeroConta);
        if (arrayPosition == -1) {
            System.out.println(ContaStrings.CONTA_EXISTENTE);
            return;
        }

        System.out.println(ContaStrings.CONTA_DEPOSITO);
        double valorSaque = ler.nextDouble();

        DataConta.deposito(arrayPosition, valorSaque);
        System.out.println(ContaStrings.DEPOSITO_REALIZADO);
    }

    public static void realizarTransferencia() {

    }

}