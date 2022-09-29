package savanaHeitor;

public class MateusPaulo {
	private String nome, raca;

	public MateusPaulo(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String caminha() {
		return(this.getNome() + " está caminhando...");
	}
	
}
