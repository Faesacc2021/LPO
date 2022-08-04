package model;

public class Vendedor {
	
	private String nome;
	private double salarioBase;
	private int tempoServico;
	private char  categoria;
	private double totalVendas;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	public char getCategoria() {
		return categoria;
	}
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	@Override

	public String toString() {
		return "model.Vendedor [nome=" + nome + ", salarioBase=" + salarioBase
				+ ", tempoServico=" + tempoServico + ", categoria=" + categoria
				+ ", totalVendas=" + totalVendas + "]";
	}
	
    public static Vendedor instanciaVendedor(double salarioBase) {
        Vendedor vendedor = new Vendedor();
        vendedor.setSalarioBase(salarioBase);
        return vendedor;
    }

	public static void defineCategoria(Vendedor vendedor, int tempoServico) {
		if (tempoServico > 60) {
			vendedor.setCategoria('A');
		} else if (tempoServico > 30) {
			vendedor.setCategoria('B');
		}  else {
			vendedor.setCategoria('C');
		}
	}

}





