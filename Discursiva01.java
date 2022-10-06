import java.util.LinkedList;
import java.util.Random;


public class Discursiva01 {

    public static LinkedList<Integer> lista = new LinkedList<>();
	
	public static void main(String[] args) {
	    Random rand = new Random(); 
	    int upperbound = 25;
	    for (int i = 0; i < 15; i++) {
	    	int int_random = rand.nextInt(upperbound);
	    	lista.add(int_random);
	    }
	    listaInteiros(lista);
	}

	public static void listaInteiros(LinkedList<Integer> lista) {
		 int maiorValor = lista.getFirst();
				 
	     for (int i = 0; i < lista.size(); i++){
	    	 System.out.println("Elementos => " + lista.get(i));
	    	 if (lista.get(i)> maiorValor) {
	    		 maiorValor = lista.get(i);
	    	 }
	     }
    	 System.out.println("\n Maior Valor é o ==> " + maiorValor);
	}
}
