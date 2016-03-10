package br.unipe.mlpIII.ui;

import java.util.Scanner;
import br.unipe.mlpIII.modelo.Veiculo;
import br.unipe.mlpIII.modelo.Veiculodecarga;
import br.unipe.mlpIII.modelo.Veiculodepassageiro;

public class Principal {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo de veiculo:\n1 - Veiculo de carga\n2 - Veiculo de passeio");
		int cont = scan.nextInt();
		
		if(cont == 1) {
			System.out.println("Informe a capacidade de carga: ");
			double carga = scan.nextInt();
			Veiculo veiculo = new Veiculodecarga(null, null, null, 0, 0, 0, 0, 0, null, null, cont, false);
		}else {
			System.out.println("Informe a quantidade de portas: ");
			int porta = scan.nextInt();
			System.out.println("Possui ar ?");
			boolean ar = scan.hasNext();
			Veiculo veiculo = new Veiculodepassageiro(null, null, null, 0, 0, 0, 0, 0, null, null, porta, ar);
		}
		
		System.out.println("Informe a quilometragem inicial: ");		
			double kmInicial = scan.nextDouble();	
		System.out.println("Informe a quilometragem final");
			double kmFinal = scan.nextDouble();
		System.out.println("Informe a quantidade de quilometros rodados: ");
			double valorKmRodado = scan.nextDouble();

		Veiculo veiculo = new Veiculo(null, null, null, cont, valorKmRodado, valorKmRodado, valorKmRodado, valorKmRodado, null, null);
		double valorLocacao = (kmFinal - kmInicial) * valorKmRodado;
			
		System.out.println("Valor da locacao do veiculo: "+ veiculo.getValorLocacao());
		
	}
}
