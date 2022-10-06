package savanaHeitor;

public class Gato extends MateusPaulo {

	public Gato(String nome, String raca) {
		super(nome, raca);
	}
	
	public String caminha() {
		return(this.getNome() + " está saltando...");
	}
	
	public String Mia() {
		return("Miau");
	}

}
