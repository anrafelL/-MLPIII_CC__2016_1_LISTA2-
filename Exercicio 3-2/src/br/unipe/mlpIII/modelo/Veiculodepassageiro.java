package br.unipe.mlpIII.modelo;

public class Veiculodepassageiro extends Veiculo {

	private int qntPortas;
	private boolean ar;
	
	public Veiculodepassageiro(String placa, String marca, String modelo, int ano, double valoKmRodado, double kmInicial, double kmFinal, double valorLocacao, String chassi, Pessoa proprietario, int qntPortas, boolean ar) {
		super(placa, marca, modelo, ano, valoKmRodado, kmInicial, kmFinal, valorLocacao, chassi, proprietario);
		this.qntPortas = qntPortas;
		this.ar = ar;
	}
	
	
}