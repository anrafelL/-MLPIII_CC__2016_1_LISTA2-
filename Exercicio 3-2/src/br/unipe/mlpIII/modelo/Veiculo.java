package br.unipe.mlpIII.modelo;

public class Veiculo {

	protected String placa;
	protected String marca;
	protected String modelo;
	protected int ano;
	protected double valorKmRodado;
	protected double kmInicial;
	protected double kmFinal;
	protected double valorLocacao;
	protected String chassi;
	protected Pessoa proprietario;
	
	public Veiculo(String placa, String marca, String modelo, int ano, double valoKmRodado, double kmInicial, double kmFinal, double valorLocacao, String chassi, Pessoa proprietario) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorKmRodado = valoKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.valorLocacao = valorLocacao;
		this.chassi = chassi;
		this.proprietario = proprietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public double getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public double getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	
}