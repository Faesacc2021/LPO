package salaDeAulaHeitor;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class aula2109 {

	static Scanner teclado = new Scanner(System.in);
	static int numeroBase = 0;
	
	public static void main(String[] args) {
		System.out.println("Digite um número base: ");
		numeroBase = teclado.nextInt();
		montaListas();
	}

	private static void montaListas() {
		TreeSet<Integer> listaDois = new TreeSet<Integer>(getList());
		System.out.println(listaDois.tailSet(numeroBase, false));
	}
	
	private static ArrayList<Integer> getList() {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    Random rand = new Random(); 
	    int upperbound = 100;
	    
	    for (int ind = 0; ind < 10; ind++){
	    	myNumbers.add(rand.nextInt(upperbound));
	    }
		return myNumbers;
	}
}
