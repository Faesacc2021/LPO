import java.util.LinkedList;
import java.util.Scanner;

public class Discursiva02 {

    public static LinkedList<Equipamento> listaEquipamento = new LinkedList<>();
    static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		Equipamento equipamento = new Equipamento(1, "furadeira", 6);
		listaEquipamento.add(equipamento);
		equipamento = new Equipamento(2, "Serra", 16);
		listaEquipamento.add(equipamento);
		equipamento = new Equipamento(3, "makita", 8);
		listaEquipamento.add(equipamento);
		listaEquipamento(listaEquipamento);
	}

	public static void listaEquipamento(LinkedList<Equipamento> lista) {

    	 System.out.println("Digite o codigo do equipamento");
    	 int codigo = entrada.nextInt();
    	 
    	 for (int i = 0; i < listaEquipamento.size(); i++){
    		 if (lista.get(i).getCodigo() == codigo) {
    			 lista.get(i).setQuantDias(50);
    			 lista.get(i).setValorDia(20);
    			 System.out.println("EQUIPAMENTO " + lista.get(i).getTipo() +  " LOCADO POR " + lista.get(i).getQuantDias() + " DIAS");
    			 System.out.println("VALOR DA DIÁRIA " + lista.get(i).getValorDia());
    			 System.out.println("VALOR A PAGAR " + lista.get(i).valorAPagar());
    		 }
    	 }
	}
}	