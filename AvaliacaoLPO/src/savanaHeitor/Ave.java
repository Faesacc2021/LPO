package savanaHeitor;

public class Ave extends MateusPaulo {

	public Ave(String nome, String raca) {
		super(nome, raca);
	}
	
	public String caminha() {
		return(this.getNome() + " está voando...");
	}
	
	public String Canta() {
		return("Piu piu");
	}

}
