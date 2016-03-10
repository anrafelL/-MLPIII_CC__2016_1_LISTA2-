package br.unipe.mlpIII.modelo;

public class Veiculodecarga extends Veiculo { 
 	 
 	private double capacidadeCarga; 
 	 
 	public Veiculodecarga(String placa, String marca, String modelo, int ano, double valoKmRodado, double kmInicial, double kmFinal, double valorLocacao, String chassi, Pessoa proprietario, int qntPortas, boolean ar) {
		super(placa, marca, modelo, ano, valoKmRodado, kmInicial, kmFinal, valorLocacao, chassi, proprietario);
		this.capacidadeCarga = capacidadeCarga;
	}
 
 
 } 
