package data;
import model.Conta;
import model.ContaEspecial;
import util.ContaStrings;

import java.util.ArrayList;

public class DataConta {
    public static ArrayList<Conta> contasArray = new ArrayList<Conta>();

    public static void inclui(Conta conta) {
        contasArray.add(conta);
    }

    public static int quantidadeContas() {
        return  contasArray.size();
    }

    public static int consulta(int numeroConta) {
        for (Conta conta : contasArray) {
            if (conta.getNumero() == numeroConta) {
                return contasArray.indexOf(conta);
            }
        }
       return -1;
    }

    public static double saldo(int index) {
        double saldoAtual = 0.0;
        if (contasArray.get(index).getClass() == ContaEspecial.class) {
            saldoAtual =  ((ContaEspecial) contasArray.get(index)).saldoEspecial()  ;
        } else {
            saldoAtual = contasArray.get(index).saldo();
        }
        return  saldoAtual;
    }

    public static void deposito (int index, double valor) {
        contasArray.get(index).deposito(valor);
    }

    public static boolean saque(int index, double valor) {
        if (saldo(index) < valor){
           return false;
        } else {
            contasArray.get(index).saque(valor);
            return true;
        }
    }
}
