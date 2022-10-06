
public class Aluno {
	
	private String nome;
	private int matricula;
	private double notaUm;
	private double notaDois;
	private double media;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNotaUm() {
		return notaUm;
	}
	public void setNotaUm(double notaUm) {
		this.notaUm = notaUm;
	}

	public double getNotaDois() {
		return notaDois;
	}
	public void setNotaDois(double notaDois) {
		this.notaDois = notaDois;
	}

	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notaUm="
				+ notaUm + ", notaDois=" + notaDois + ", media=" + media + "]";
	}
}
