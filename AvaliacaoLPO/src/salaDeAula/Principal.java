package salaDeAula;

public class Principal {
	public static Automovel automovel;
	public static Automovel.tipoCombustivel tipoCombustivel;

	public static void main(String[] args) {
		
		int valorAutomovel = automovel.valor(tipoCombustivel.GASOLINA);
		System.out.println(valorAutomovel);	
		
	}

}
