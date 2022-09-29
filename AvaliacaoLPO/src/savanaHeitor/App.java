package savanaHeitor;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<MateusPaulo> lista = new ArrayList<MateusPaulo>();
		
		lista.add(new Cachorro("Rex", "pitbull"));
		lista.add(new Gato("Heitor", "siames"));
		lista.add(new Ave("Piu piu", "pintinho"));
		lista.add(new Cachorro("Bela", "goldador"));
		lista.add(new Gato("jonatan", "garfield"));
		
		for (MateusPaulo mp: lista) {
			if (mp instanceof Cachorro) {
				System.out.println(((Cachorro)mp).caminha());
				System.out.println(((Cachorro)mp).late());
			}
			if (mp instanceof Gato) {
				System.out.println(((Gato)mp).caminha());
				System.out.println(((Gato)mp).Mia());
				
			}
			if (mp instanceof Ave) {
				System.out.println(((Ave)mp).caminha());
			}
			
		}

	}

}
