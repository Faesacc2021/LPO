import model.DadosVendedor;
import model.VetVendedor;
import java.util.Scanner;

public class Principal {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		VetVendedor.defineTamanhoVetor();
		menuVendedor();
	}

	public static void menuVendedor() {
		int continuar = 7;
		String entrada = "";
		int valorMenu = 0;

		while (continuar != 0) {

			System.out.println("Escolha uma opção");
			System.out.println("1 - Incluir Vendedor");
			System.out.println("2 - Consultar Vendedor");
			System.out.println("3 - Excluir Vendedor");
			System.out.println("4 - Outras Operações");
			System.out.println("0 - Finalizar");
			entrada = ler.next();

			try {
				valorMenu = Integer.parseInt(entrada);
			} catch (NumberFormatException e) {
				continue;
			}

			switch (valorMenu) {
				case 0 -> {
					System.out.println("Programa Encerrado ");
					continuar = 0;
				}
				case 1 -> DadosVendedor.incluirVendedor();
				case 2 -> DadosVendedor.consultaVendedor();
				case 3 -> DadosVendedor.excluiVendedor();
				case 4 -> OutrasOperacoes();
				default -> System.out.println("Opção Inválida!");
			}
		}
	}

	public static void OutrasOperacoes() {
		int continuar = 7;
		String entrada = "";
		int valorMenu = 0;

		while (continuar != 0) {

			System.out.println("Escolha uma opção");
			System.out.println("1 - Total de Vendas");
			System.out.println("2 - Media Vendas");
			System.out.println("0 - Finalizar");
			entrada = ler.next();

			try {
				valorMenu = Integer.parseInt(entrada);
			} catch (NumberFormatException e) {
				continue;
			}

			switch (valorMenu) {
				case 0 -> {
					System.out.println("Programa Encerrado ");
					continuar = 0;
				}
				case 1 -> DadosVendedor.totalVendas();
				case 2 -> DadosVendedor.mediaVendas();
				default -> System.out.println("Opção Inválida!");
			}
		}
		menuVendedor();
	}
}

