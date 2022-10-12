package data;
import model.Conta;
import model.ContaEspecial;
import util.ContaStrings;

import java.util.ArrayList;

public class DataConta {
    private static final ArrayList<Conta> contasData = new ArrayList<Conta>();

    public static void incluiData(Conta conta) {
        contasData.add(conta);
    }

    public static int quantidadeContasData() {
        return  contasData.size();
    }

    public static ArrayList<Conta> getContasArray() {
        return contasData;
    }

    public static int consultaData(int numeroConta) {
        for (Conta conta : contasData) {
            if (conta.getNumero() == numeroConta) {
                return contasData.indexOf(conta);
            }
        }
       return -1;
    }

    public static double saldoData(int index) {
        double saldoAtual = 0.0;
        if (contasData.get(index).getClass() == ContaEspecial.class) {
            saldoAtual =  ((ContaEspecial) contasData.get(index)).saldo()  ;
        } else {
            saldoAtual = contasData.get(index).saldo();
        }
        return  saldoAtual;
    }

    public static void depositoData (int index, double valor) {
        contasData.get(index).deposito(valor);
    }

    public static boolean saqueData(int index, double valor) {
        if (saldoData(index) < valor){
           return false;
        } else {
            contasData.get(index).saque(valor);
            return true;
        }
    }
}
