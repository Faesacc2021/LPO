package model;

import util.Constants;

public class VetVendedor {

	private static Vendedor[] vetVendedor;
	private static int countVendedor;

	public static void defineTamanhoVetor(){
		vetVendedor = new Vendedor[Constants.TAMANHO_VETOR];
	}

	public static int getNovaPosicao() {
		int indice;
		if (Constants.TAMANHO_VETOR == 0) {
			return 0;
		}
		for (indice = 0; indice < (Constants.TAMANHO_VETOR - 1); indice++){
			if (vetVendedor[indice].getNome().equals("")){
				indice = indice + 1;
			} else{
				break;
			}
		}
      		return indice + 1;
	}

	public static void organizaVetor() {
		int indice;
		int indiceAux = 0;

		Vendedor[] vetVendedorAux = new Vendedor[Constants.TAMANHO_VETOR];
		for (indice = 0; indice < (Constants.TAMANHO_VETOR - 1); indice++){
			if (!vetVendedor[indice].getNome().equals("")) {
				vetVendedorAux[indiceAux] = vetVendedor[indice];
				indiceAux ++;
			}
		}
		vetVendedor = vetVendedorAux;
	}

	public static int getCount() {
		return countVendedor;
	}

	public static void insereVendedorVetor(Vendedor vendedor) {
		vetVendedor[getCount()] = vendedor;
	}
}
