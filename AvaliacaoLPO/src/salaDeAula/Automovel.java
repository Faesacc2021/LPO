package salaDeAula;

public class Automovel {

	public final static int NUMEROMAXIMOPRESTACOES = 24;
	
	public static enum tipoCombustivel {
		 GASOLINA, 
		 FLEX,
		 DIESEL,
	     GAS
	}
	
	public static int numeroPrestacoes(){
		return NUMEROMAXIMOPRESTACOES;
	}
	
	public static int valor(tipoCombustivel tipo){
		switch(tipo) {
		  case GASOLINA:
			return 60000;
		  case FLEX:
			return 55000;   
		  case DIESEL:
			return 52000;
		  default:
			return 58000;
		}
	}	
}
