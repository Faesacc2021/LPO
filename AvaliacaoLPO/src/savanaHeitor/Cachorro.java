package savanaHeitor;

public class Cachorro extends MateusPaulo {

	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}

	public String caminha() {
		return(this.getNome() + " está correndo...");
	}
	
	public String late() {
		return("Au au");
	}
}

