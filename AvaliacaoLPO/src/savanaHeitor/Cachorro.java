package savanaHeitor;

public class Cachorro extends MateusPaulo {

	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}

	public String caminha() {
		return(this.getNome() + " est� correndo...");
	}
	
	public String late() {
		return("Au au");
	}
}

