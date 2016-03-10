package Data.java;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Data() {
}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
		this.ano = 2016;
	}
	
	public String toString() {
		if (this.dia > 31 || this.dia <1 || this.mes > 12 || this.mes < 1 || this.ano < 1000) {
			return "Data invalida";
		}else {			
			return dia + "/" + mes + "/" + ano;
			 
		}
	}
}