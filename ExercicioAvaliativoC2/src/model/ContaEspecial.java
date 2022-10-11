package model;

public class ContaEspecial extends Conta implements Transacao{

    double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(int numero, String nome, String cpf, Double limite) {
        super(numero, nome, cpf);
        this.limite = limite;
    }

    public double saldoEspecial() {
        return this.saldo() + getLimite();
    }
}
